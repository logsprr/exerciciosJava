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
public class desconto {
    float produto;
    int desconto;
    float codigo;
    String aux ="";
    float total;
    
    
    void processaValores(){
        aux = JOptionPane.showInputDialog("Digite o valor do produto:");
        produto = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog("Digite o código de desconto: \n"
                + "1- 5%"
                + "2- 10%"
                + "3- 20%"
                + "4- 50");
        desconto = Integer.parseInt(aux);
        
        switch (desconto) {
            case 1:
                this.total = (float) (produto-(produto*5)/100);
                JOptionPane.showMessageDialog(null,"O valor do seu produto : R$" + produto +"\n"
                        + "Codigo de desconto: 1\n"
                        + "O valor do seu produto com desconto "
                        + "é de R$" +this.total);
                break;
            case 2:
                this.total = (float) (produto-(produto*10)/100);
                JOptionPane.showMessageDialog(null,"O valor do seu produto : R$" + produto +"\n"
                        + "Codigo de desconto: 2\n"
                        + "O valor do seu produto com desconto "
                        + "é de R$" +this.total);
                break;
            case 3:
                this.total = (float) (produto-(produto*20)/100);
                JOptionPane.showMessageDialog(null,"O valor do seu produto : R$" + produto +"\n"
                        + "Codigo de desconto: 3\n"
                        + "O valor do seu produto com desconto "
                        + "é de R$" +this.total);
                break;
            case 4:
                this.total = (float) (produto-(produto*50)/100);
                JOptionPane.showMessageDialog(null,"O valor do seu produto : R$" + produto +"\n"
                        + "Codigo de desconto: 4\n"
                        + "O valor do seu produto com desconto "
                        + "é de R$" +this.total);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Voce digitou um numero maior que 4");
                break;
        }
    }
}
