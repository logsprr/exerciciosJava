/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

/**
 *
 * @author gabriel
 */
public class Pax {
    String[] feira = {"Sofa", "Vasilha 2 reais", "Fogao", "Panela de Pressao","Cesta","Vasilha de arroz"};
    
    public String sort(){
        int n = (int) (Math.random() * feira.length);
        return feira[n];
    }
}
