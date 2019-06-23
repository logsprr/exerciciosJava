package firebaseapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author Gabriel
 */
public class Main {

    public static void main(String[] args) throws ProtocolException, IOException {
        Perfil[] perf = vemget();
        int i;
        String url;
        for(i = 0; i<perf.length; i++){
            System.out.println(perf[i].toString());
        }
    }   
    public static void vemput(String url, Perfil x) throws MalformedURLException, ProtocolException, IOException{
        Gson g = new Gson();
        URL object = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) object.openConnection();
        con.setRequestMethod("PUT");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(g.toJson(x));
        wr.flush();
        wr.close();
        int responseCode = con.getResponseCode();
    }
    public static Perfil[] vemget(){
        try{
            URL url = new URL("https://auladanilooo.firebaseio.com/.json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("ACCEPT", "application/json");
            if(conn.getResponseCode() != 200){
                System.out.println(conn.getResponseCode());
                throw new RuntimeException("Falha ao conectar");
            }
            ObjectMapper mapper = new ObjectMapper();
            Perfil[] perfil = mapper.readValue(url, Perfil[].class);
            return perfil;
            
        }catch (MalformedURLException ex) {
            System.out.println("Erro na url selecionada: "+ex.getMessage());
        } catch (IOException ex){
            System.out.println("Erro de internet ou perda de conexão: "+ex.getMessage());
        }
        return null;
    }
    
}
