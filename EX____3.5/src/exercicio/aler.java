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
public class aler {
    int numeros[][] = new int[50][20];
    String aux = "";
    int numero2;
    int i,k;
    void sorteia(){
        for(i=0; i<50;i++){
            for(k=0;k<20;k++){
                numeros[i][k] = (int) (Math.random() * 1000);
            }
        }
        aux = JOptionPane.showInputDialog("Digite um numero para ser pesquisado no Array:");
        numero2 = Integer.parseInt(aux);
        for(i=0; i<50;i++){
            for(k=0;k<20;k++){
                if(numero2==numeros[i][k]){
                    JOptionPane.showMessageDialog(null,"O numero existe no aray");
                    break;
                }
                else{
                    JOptionPane.showMessageDialog(null,"O numero nao existe no aray");
                    break;
                }
            }
        }
    }
}
