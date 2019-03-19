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
        do{
            if(frase.equals(palavra)){
                cont++;
                JOptionPane.showMessageDialog(null,"Frase fornecida : " + frase
                        + "Palavra fornecida : " + palavra 
                        + "Quantidades de ocorrências : "  + cont);
            }
            else{
                JOptionPane.showMessageDialog(null,"Não tem a palavra que você digitou na frase :!!");
            }
        }while(cont!=0);
    }
}
