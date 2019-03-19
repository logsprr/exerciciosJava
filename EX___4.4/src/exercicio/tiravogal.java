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
public class tiravogal {
    String palavra = "";
    
    
    
    void recebe(){
        palavra = JOptionPane.showInputDialog("Digite a palavra :");
        
        processa(palavra);
        
    }
    public String processa(String palavra){
        StringBuffer vog = new StringBuffer(palavra);
        for(int i=0;i<vog.length();i++){
            char c = Character.toLowerCase(vog.charAt(i));
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vog.deleteCharAt(i);
                vog = new StringBuffer(processa(vog.toString()));
                break;
            }
        }
        JOptionPane.showMessageDialog(null,"Palavra sem vogal: " + vog.toString());
        return null;
    }
}
