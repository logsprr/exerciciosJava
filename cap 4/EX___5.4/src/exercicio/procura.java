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
public class procura {
    String palavra = "";
    String frase = "";
   
    void search(){
        frase = JOptionPane.showInputDialog("Digite uma frase :");
        palavra = JOptionPane.showInputDialog("Digite uma palavra:");
        int cont=0;
        int cont2=0;
        String sfrase[] = frase.split(" ");
        for(int i=0; i<sfrase.length;i++){
            if(sfrase[i].equals(palavra)){
               cont++;
            }
            else{
                cont2++;
            }
        }
        JOptionPane.showMessageDialog(null,"Frase fornecida : " + frase+"\n"
                        + "Palavra fornecida : " + palavra+"\n"
                        + "Quantidades de ocorrências positivas : "  + cont+"\n"     //postivas sao que aparecem na frase 
                        + "Quantidades de ocorrências negativas : "  + cont2);  // negativas que nao aparecem 
    }
}
