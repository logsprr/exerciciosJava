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
    public static void main(String[] args) {
        Dtae c = new Dtae();
        String data = JOptionPane.showInputDialog("Digite uma data:");
        System.out.println("Data: "+data+"\n"
                +"Mes: "+c.week(data));
    }
}
