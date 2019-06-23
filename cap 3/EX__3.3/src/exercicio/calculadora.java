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
public class calculadora {
    int num1;
    int num2;
    String aux = "";
    String op = "";
    
    String a = "A";
    String b = "B";
    String c = "C";
    String d = "C";
    String A = "a";
    String B = "b";
    String C = "c";
    String D = "d";
    
    
    void calula(){
        JOptionPane.showMessageDialog(null,"Calculadora"
                + "\n"
                + "A -------- Soma\n"
                + "B -------- Subtração\n"
                + "C -------- Multiplicação\n"
                + "D -------- Divisão"
                + "\n");
        while (op == null || op.equals("")) {
            op = JOptionPane.showInputDialog("Digite a operação\n");
            if (op == null || op.equals("")){
                  JOptionPane.showMessageDialog(null,
                                        "Você não digitou nada");
            }
        }
        aux = JOptionPane.showInputDialog("Digite o 1 numero: ");
        num1 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Digite o 2 numero: ");
        num2 = Integer.parseInt(aux);
        if(op.equals(A) || op.equals(a)){
            JOptionPane.showMessageDialog(null,"Numeros fornecidos :"
                    + num1 +"," + num2 +"\n"
                    + "Operação escolhida : Soma \n"
                    + "Resultado: "
                    + (num1+num2));
        }
        else if(op.equals(B) || op.equals(b)){
            JOptionPane.showMessageDialog(null,"Numeros fornecidos :"
                    + num1 +"," + num2 +"\n"
                    + "Operação escolhida : Subtração \n"
                    + "Resultado: "
                    + (num1-num2));
        }
        else if(op.equals(C) || op.equals(c)){
            JOptionPane.showMessageDialog(null,"Numeros fornecidos :"
                    + num1 +"," + num2 +"\n"
                    + "Operação escolhida : Multiplicação \n"
                    + "Resultado: "
                    + (num1*num2));
        }
        else if(op.equals(D) || op.equals(d)){
            JOptionPane.showMessageDialog(null,"Numeros fornecidos :"
                    + num1 +"," + num2 +"\n"
                    + "Operação escolhida : Divisão \n"
                    + "Resultado: "
                    + (num1/num2));
        }
        else{
            JOptionPane.showMessageDialog(null,"Voce digitou errado");
        }
        
    }
}
