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
public class Idade {
    public String id(int id){
        if(id>=0 && id <=2){
            return "Baby";
        } else if (id>=3 && id <=11){
            return "Demonio";
        } else if (id>=12 && id<=19){
            return "Destroi praças";
        } else if (id>=20 && id <=30){
            return "Passa raiva na faculdade";
        } else if (id>=31 && id <=60){
            return "Com dinheiro e sem tempo";
        } else if(id>60){
            return "com dinheiro e velho";
        } 
        return null;
    }
}
