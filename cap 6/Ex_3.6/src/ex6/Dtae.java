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
public class Dtae {
    public int week(String dt){
       String[] dat = dt.split("/");
       return Integer.parseInt(dat[1]);
    }
}
