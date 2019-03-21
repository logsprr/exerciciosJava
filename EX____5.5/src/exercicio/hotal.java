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
    
    void menu(){
        Object[] opcoes = { "Imprimir lista de quartos", "Definir ocupação",
                "Sair" };
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Hotel de Gabriel"));
        int result = JOptionPane.showOptionDialog(null, panel, "Hotel",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, opcoes, null);
        if(opcoes.equals("Imprimir lista de quartos")){
            imprimeLista();
        }
        else if(opcoes.equals("Definir ocupação")){
            defocupaçao();
        }
        else{
            
        }
    }
    
    void imprimeLista(){
        for(i=0;i<5;i++){
            for(k=0;k<10;k++){
                hotel[i][k] = "desocupado";
            }
        }
        for(i=0;i<5;i++){
            for(k=0;k<10;k++){
                JOptionPane.showMessageDialog(null,"Andar" +hotel[i]+"\n" 
                    + "Quarto" +hotel[k]);
            }
        }
    }
    
    void defocupaçao(){
        int posicaoquarto =0;
        int posicaoandar = 0;
        posicaoandar = Integer.parseInt(JOptionPane.showInputDialog("Andar :"));
        posicaoquarto = Integer.parseInt(JOptionPane.showInputDialog("Quarto: "));
        
        for(i=0;i<5;i++){
            for(k=0;k<10;k++){
                if(hotel[i][k] ==  hotel[posicaoandar][posicaoquarto]){
                    if(hotel[i]>5 && hotel[k]>10){
                        JOptionPane.showMessageDialog(null,"Nao existe");
                    }
                    else if(hotel[i][k].equals("desocupado")){
                        hotel[posicaoandar][posicaoquarto] = "ocupado";
                        JOptionPane.showMessageDialog(null,"Ocupado 20 reais");
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Ja esta ocupado");
                        break;
                    }
                }
                
            }
        }
    }
}
