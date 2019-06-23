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
        float num;
        int op;
        float total;
        aux = JOptionPane.showInputDialog("Digite o valor do produto: ");
        num = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog("Digite o desconto do produto : ");
        op = Integer.parseInt(aux);
        
        total = num - (num*op)/100;
        
        
        JOptionPane.showMessageDialog(null," Valor original : " + num + "\n" 
                + "Percentual de desconto: " + op + "\n"
                + "Valor com desconto: " + total);
        
        
    }
    
}
