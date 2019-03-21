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
public class show {
    int numeros[] = new int[10];
    String aux = "";
    int total;
    int maior = 0;
    int menor = 0;
    void armazena(){
        
        for(int i=0;i<numeros.length;i++){
            aux = JOptionPane.showInputDialog("Digite 10 numeros: ");
            numeros[i] = Integer.parseInt(aux);
            total += numeros[i];
            
        }
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]>maior){
                maior = numeros[i];
            }
        }
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]<menor){
                menor = numeros[i];
            }
        }
        
        JOptionPane.showMessageDialog(null,"Soma : " +total+"\n" 
                + "Maior : " + maior+"\n" 
                + "Menor : " + menor);
    }
}
