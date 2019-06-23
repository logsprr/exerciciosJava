/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String gente[][] = new String[5][2];
        int i, k;
        String busca = "";
        String busca1= "";
        for(i=0;i<5;i++){
            for(k=0;k<2;k++){
                if(k==0){
                    gente[i][k] = JOptionPane.showInputDialog("Digite o sexo :");
                }
                else{
                    gente[i][k] = JOptionPane.showInputDialog("Digite o nome da pessoa :");
                }
            }
        }
        busca = JOptionPane.showInputDialog("Digite o sexo a ser procurado :");
        for(i=0; i<5; i++){
            gente[i][0] = gente[i][0];
            
            if(gente[i][0].contains(busca)){
                busca1 = busca1 +gente[i][1];
            }
        }
        
        JOptionPane.showMessageDialog(null, "Sexo que voce digitou \n " + busca+"\n" 
                + "Lista de nomes :\n" 
                + busca1+"\n");
    }
    
}
