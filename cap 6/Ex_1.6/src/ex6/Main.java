/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Idade idn = new Idade();
       
       String aux;
       
       aux = JOptionPane.showInputDialog("Entre com a idade");
       JOptionPane.showMessageDialog(null, idn.id(Integer.parseInt(aux)));
       
        
    }
    
}
