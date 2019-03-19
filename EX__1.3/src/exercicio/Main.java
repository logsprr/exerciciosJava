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
        desconto geradesconto;
        geradesconto = new desconto();
        
        try{
            geradesconto.processaValores();
        }
        catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null,"Houve um erro de digitação"
                    + "\n" + erro.toString());
        }
    }
    
}
