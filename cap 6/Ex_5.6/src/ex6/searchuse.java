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
public class searchuse {
    
    public void pub() {
        search s = new search();
        
        int[] vet = {1 , 5 , 6, 8 , 8 , 0 , 9 , 54 , 67 , 87 };
        String[] vet2 = {"a","x","c","e","e","n","j","p","u","I"};
        System.out.println(s.sn(7,vet));
        System.out.println(s.sword(vet2));
    }

}
