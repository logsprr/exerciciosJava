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
    void sorteia(){
        for(int i=0; i<50;i++){
            for(int j=0;i<20;i++){
                aux = JOptionPane.showInputDialog("Digite um numero para ser pesquisado no Array:");
                numero2 = Integer.parseInt(aux);
                
                numeros[i][j] = (int) (Math.random() * 1000);
                
                if(numero2==numeros[i][j]){
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
