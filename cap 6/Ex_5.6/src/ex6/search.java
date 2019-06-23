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
public class search extends searchuse {
    public boolean sn(int num, int[] vet){
            for(int i=0; i<vet.length;i++){
                if(num == vet[i]){
                    return true;
            }
        }
        return false;
    }
    
    public String sword(String[] words){
        for (int i=0; i<words.length; i++) {
            String b = "c";
            if (b.equals(words)) {
                return "yes";
            } else {
            }
        }
        return "not";
    }

}
