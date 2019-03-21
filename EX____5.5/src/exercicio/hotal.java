/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/**
 *
 * @author Gabriel
 */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code"
public class hotal {
    String[][] hotel = new String [5][10];
    int i,k;
    String contq  = "";
    int resp;
    
    void menu(){
        Object[] opcoes = { "Imprimir lista de quartos", "Definir ocupação",
                "Sair" };
        for(i=0;i<5;i++){
            for(k=0;k<10;k++){
                hotel[i][k] = "desocupado";
            }
        }
        int result;
        do{
            JPanel panel = new JPanel();
            panel.add(new JLabel("Hotel de Gabriel"));
            result = JOptionPane.showOptionDialog(null, panel, "Hotel",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, opcoes, null);
            if(opcoes[result].equals("Imprimir lista de quartos")){
                imprimeLista();
            }
            else if(opcoes[result].equals("Definir ocupação")){
                defocupaçao();
            }
        } while(result !=2);
    }
    
    void imprimeLista(){
        contq = "";
            for(k=0;k<10;k++){
                if(k==9){
                    contq+=   "Andar: 01 Quarto: "+(k+1)+" - "+hotel[0][k]+"    |    "
                            + "Andar: 02 Quarto: "+(k+1)+" - "+hotel[1][k]+"    |    "
                            + "Andar: 03 Quarto: "+(k+1)+" - "+hotel[2][k]+"    |    "
                            + "Andar: 04 Quarto: "+(k+1)+" - "+hotel[3][k]+"    |    "
                            + "Andar: 05 Quarto: "+(k+1)+" - "+hotel[4][k]+"\n";
                } else{
                contq+=   "Andar: 01 Quarto: 0"+(k+1)+" - "+hotel[0][k]+"    |    "
                        + "Andar: 02 Quarto: 0"+(k+1)+" - "+hotel[1][k]+"    |    "
                        + "Andar: 03 Quarto: 0"+(k+1)+" - "+hotel[2][k]+"    |    "
                        + "Andar: 04 Quarto: 0"+(k+1)+" - "+hotel[3][k]+"    |    "
                        + "Andar: 05 Quarto: 0"+(k+1)+" - "+hotel[4][k]+"\n";
                }
        }
        JOptionPane.showMessageDialog(null, contq);
    }
    
    void defocupaçao(){
        int posicaoquarto;
        int posicaoandar ;
        resp = JOptionPane.showConfirmDialog(null, "Digite para ocupar um quarto: "
                + "Andar de 1 a 5 "
                + "Quartos de 1 a 10");
        if(resp == JOptionPane.YES_OPTION){
            posicaoandar = Integer.parseInt(JOptionPane.showInputDialog("Andar :"));
            posicaoquarto = Integer.parseInt(JOptionPane.showInputDialog("Quarto: "));
            posicaoandar-=1;
            posicaoquarto-=1;
            if(posicaoandar>5 || posicaoquarto>10){
                JOptionPane.showMessageDialog(null,"Nao existe");
            }
            else if(hotel[posicaoandar][posicaoquarto].equals("desocupado")){
                    hotel[posicaoandar][posicaoquarto] = "ocupado       ";
                    JOptionPane.showMessageDialog(null,"Ocupado 20 reais");
                }
            else{
                JOptionPane.showMessageDialog(null,"Ja esta ocupado");
            }
        }
        
    }
}
