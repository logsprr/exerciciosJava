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
public class ValorV1V2 {
    float numero1 = 0, numero2 = 0 ;
    String aux = "";
    float opp = 0;
    int op = 0;
    
    void operaçao(){
        aux = JOptionPane.showInputDialog("Digite a opçao matematica: "
                + "1- Adição "
                + "2- Subtração "
                + "3- Multiplicação "
                + "4- Divisão ");
        op = Integer.parseInt(aux);
        
        switch (op) {
            case 1:
                aux = JOptionPane.showInputDialog("Digite 1 valor: ");
                this.numero1 = Float.parseFloat(aux);
                aux = JOptionPane.showInputDialog("Digite 2 valor: ");
                this.numero2 = Float.parseFloat(aux);
                opp = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "Resultado : " +opp);
                break;
            case 2:
                aux = JOptionPane.showInputDialog("Digite 1 valor: ");
                this.numero1 = Float.parseFloat(aux);
                aux = JOptionPane.showInputDialog("Digite 2 valor: ");
                this.numero2 = Float.parseFloat(aux);
                opp = numero1 - numero2;
                JOptionPane.showMessageDialog(null,"Resultado : " +opp);
                break;
            case 3:
                aux = JOptionPane.showInputDialog("Digite 1 valor: ");
                this.numero1 = Float.parseFloat(aux);
                aux = JOptionPane.showInputDialog("Digite 2 valor: ");
                this.numero2 = Float.parseFloat(aux);
                opp = numero1 * numero2;
                JOptionPane.showMessageDialog(null,"Resultado : " +opp);
                break;
            case 4:
                aux = JOptionPane.showInputDialog("Digite 1 valor: ");
                this.numero1 = Float.parseFloat(aux);
                aux = JOptionPane.showInputDialog("Digite 2 valor: ");
                this.numero2 = Float.parseFloat(aux);
                opp = numero1 / numero2;
                JOptionPane.showMessageDialog(null,"Resultado : " +opp);
                break;
            default:
                System.out.println("Voce digitou um numero maior que 4: ");
                break;
        }
    }
}
