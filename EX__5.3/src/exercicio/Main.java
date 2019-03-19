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
        int i;
        int soma = 0;
        JOptionPane.showMessageDialog(null,"Soma de numeros de 1 ate 1000 somentes impares:");
        
        for(i=0;i<1000;i++){
            if(i % 2 != 0){
                soma += i;
            }
        }
       JOptionPane.showMessageDialog(null,"Total: " +soma);
    }
    
}
