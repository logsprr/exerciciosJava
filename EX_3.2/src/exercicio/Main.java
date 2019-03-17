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
        String aux = "";
        float altura = 0, peso = 0, imc = 0;
         try{
             aux = JOptionPane.showInputDialog("Entre com o seu peso:");
             peso = Float.parseFloat(aux);
             
             aux = JOptionPane.showInputDialog("Entre com sua altura:");
             altura = Float.parseFloat(aux);
             
             imc = peso /(altura*altura);
             JOptionPane.showMessageDialog(null, "Seu Imc e: " + imc);
         }
         catch(NumberFormatException erro){
             JOptionPane.showMessageDialog(null, "Houve erro na conversão, somente digite numeros, não letras" 
                     + erro.toString());
         }
         System.exit(0);
    }
    
}
