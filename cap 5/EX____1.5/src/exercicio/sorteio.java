/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class sorteio {
    String[] nomes = new String[10];
    
    void sort(){
        for(int i=0;i<10;i++){
            nomes[i] = JOptionPane.showInputDialog("Digite o s 10 nomes para o sorteio:");
            
        }
        Arrays.sort(nomes);
        for( String nome: nomes){
            JOptionPane.showMessageDialog(null,"Ganhador :" +nome);
            break;
        }
    } 
}
