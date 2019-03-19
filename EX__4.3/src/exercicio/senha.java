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
public class senha {
    String senha = "";
    String padraosenha = "Java";
    
    
    void entradaSenha(){
        while (senha == null || senha.equals("")) {
            senha = JOptionPane.showInputDialog("Digite a senha:\n");
            if (senha == null || senha.equals("")){
                  JOptionPane.showMessageDialog(null,
                                        "Você não digitou nada");
            }
        } 
    }
    
    void confereSenha(){
        int cont = 0;
        entradaSenha();
        for(int i=0;i<3;i++){
            cont =1;
            if(senha.equals(padraosenha)){
                JOptionPane.showMessageDialog(null,"Senha Valida");
                break;
            }
            else{
                cont++;
                if(cont==3){
                    JOptionPane.showMessageDialog(null,"Perdeu Cartao Cancelado");
                    break;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Senha Invalida");
                    senha = JOptionPane.showInputDialog("Digite a senha:\n");
                }
                
            }
        }
    }
    
}
