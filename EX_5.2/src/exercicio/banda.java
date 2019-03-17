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
public class banda {
    String aux = "";
    float internet = 25000;   //2 megabites equivalem em bytes 25000
    int valorbyte = 0;
    float velocidadesegundos = valorbyte/internet;
    
    
    
    void calculavelocidade(){
        aux = JOptionPane.showInputDialog("Digite o tamanho do arquivo em bytes: ");
        valorbyte = Integer.parseInt(aux);
        velocidadesegundos = valorbyte/internet;
        JOptionPane.showMessageDialog(null,"Tamanho do arquivo para download : " + valorbyte);
        JOptionPane.showMessageDialog(null, "Tempo necessario em segundos : " + velocidadesegundos);
    }
}
