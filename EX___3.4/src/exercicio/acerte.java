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
public class acerte {
    int num = (int) (Math.random() *9);
    int num2;
    String aux = "";
    void jogo(){
        aux = JOptionPane.showInputDialog("Digite o valor que voce acha que vai acertar: ");
        num2  = Integer.parseInt(aux);
        
        for(int i=0; i<9;i++){
            if(num==num2){
                i=9;
                JOptionPane.showMessageDialog(null,"Voce acertou !!"+"\n"
                        + "Numero sorteado : " + num +"\n" 
                        + "Numero digitado: " + num2);
                break;
            }
            else{
                JOptionPane.showMessageDialog(null,"Voce errou !!"+"\n"
                        + "Numero sorteado : " + num +"\n"
                        + "Numero digitado: " + num2);
                break;
            }
        }
    }
}
