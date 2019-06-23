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
public class idades {
    
    int idade[] = new int[4];
    String aux = "";
    
    
    void processaIdades(){
        JOptionPane.showMessageDialog(null,"Digite 4 idades:");
        aux = JOptionPane.showInputDialog("Idade 1:");
        idade[0] = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Idade 2:");
        idade[1] = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Idade 3:");
        idade[2] = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Idade 4:");
        idade[3] = Integer.parseInt(aux);
        
        if(idade[0]>idade[1] && idade[0]>idade[2] && idade[0]>idade[3]){
            JOptionPane.showMessageDialog(null,"Idades fornecidas :\n"
                    + idade[0] +","+ idade[1] +","+ idade[2] +","+ idade[3] 
                    + "\n"
                            + "A maior idade:" + idade[0] 
                    + "\n");
            if(idade[0]<idade[1] && idade[0]<idade[2] && idade[0]<idade[3]){
            JOptionPane.showMessageDialog(null,"A menor idade:" + idade[0]);
            }
            else if(idade[1]<idade[2] && idade[1]<idade[3] && idade[1]<idade[0]){
                JOptionPane.showMessageDialog(null,"A menor idade:" + idade[1]);
            }
            else if(idade[2]<idade[3] && idade[2]<idade[0] && idade[2]<idade[1]){
                JOptionPane.showMessageDialog(null,"A menor idade:" + idade[2]);
            }
            else if(idade[3]<idade[0] && idade[3]<idade[1] && idade[3]<idade[2]){
                JOptionPane.showMessageDialog(null,"A menor idade:" + idade[3]);
            }
        }
        else if(idade[1]>idade[2] && idade[1]>idade[3] && idade[1]>idade[0]){
            JOptionPane.showMessageDialog(null,"Idades fornecidas :\n"
                    + idade[0] +","+ idade[1] +","+ idade[2] +","+ idade[3] 
                    + "\n"
                            + "A maior idade:" + idade[1] 
                    + "\n");
            if(idade[0]<idade[1] && idade[0]<idade[2] && idade[0]<idade[3]){
            JOptionPane.showMessageDialog(null,"A menor idade:" + idade[0]);
            }
            else if(idade[1]<idade[2] && idade[1]<idade[3] && idade[1]<idade[0]){
                JOptionPane.showMessageDialog(null,"A menor idade:" + idade[1]);
            }
            else if(idade[2]<idade[3] && idade[2]<idade[0] && idade[2]<idade[1]){
                JOptionPane.showMessageDialog(null,"A menor idade:" + idade[2]);
            }
            else if(idade[3]<idade[0] && idade[3]<idade[1] && idade[3]<idade[2]){
                JOptionPane.showMessageDialog(null,"A menor idade:" + idade[3]);
            }
        }
        else if(idade[2]>idade[3] && idade[2]>idade[1] && idade[2]>idade[0]){
            JOptionPane.showMessageDialog(null,"Idades fornecidas :\n"
                    + idade[0] +","+ idade[1] +","+ idade[2] +","+ idade[3] 
                    + "\n"
                            + "A maior idade:" + idade[2] 
                    + "\n");
            if(idade[0]<idade[1] && idade[0]<idade[2] && idade[0]<idade[3]){
            JOptionPane.showMessageDialog(null,"A menor idade:" + idade[0]);
            }
            else if(idade[1]<idade[2] && idade[1]<idade[3] && idade[1]<idade[0]){
                JOptionPane.showMessageDialog(null,"A menor idade:" + idade[1]);
            }
            else if(idade[2]<idade[3] && idade[2]<idade[0] && idade[2]<idade[1]){
                JOptionPane.showMessageDialog(null,"A menor idade:" + idade[2]);
            }
            else if(idade[3]<idade[0] && idade[3]<idade[1] && idade[3]<idade[2]){
                JOptionPane.showMessageDialog(null,"A menor idade:" + idade[3]);
            }
        }
        else if(idade[3]>idade[0] && idade[3]>idade[1] && idade[3]>idade[2]){
            JOptionPane.showMessageDialog(null,"Idades fornecidas :\n"
                    + idade[0] +","+ idade[1] +","+ idade[2] +","+ idade[3] 
                    + "\n"
                            + "A maior idade:" + idade[3] 
                    + "\n");
            if(idade[0]<idade[1] && idade[0]<idade[2] && idade[0]<idade[3]){
            JOptionPane.showMessageDialog(null,"A menor idade:" + idade[0]);
            }
            else if(idade[1]<idade[2] && idade[1]<idade[3] && idade[1]<idade[0]){
                JOptionPane.showMessageDialog(null,"A menor idade:" + idade[1]);
            }
            else if(idade[2]<idade[3] && idade[2]<idade[0] && idade[2]<idade[1]){
                JOptionPane.showMessageDialog(null,"A menor idade:" + idade[2]);
            }
            else if(idade[3]<idade[0] && idade[3]<idade[1] && idade[3]<idade[2]){
                JOptionPane.showMessageDialog(null,"A menor idade:" + idade[3]);
            }
        }
    }
    
}
