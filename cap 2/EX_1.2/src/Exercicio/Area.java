/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gabriel
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String b = "";
        float base;
        float altura;
        BufferedReader triangulo;
        try{
            System.out.println("Digite a altura");
            triangulo = new BufferedReader(new InputStreamReader(System.in));
            b = triangulo.readLine();
            altura = Float.parseFloat(b);


            System.out.println("Digite a base");
            triangulo = new BufferedReader(new InputStreamReader(System.in));
            b = triangulo.readLine();
            base = Float.parseFloat(b);


            float area = 0;

            area = (base * altura)/2;

            System.out.println("A area do triangulo é :" + area);
        }
        catch(IOException erro){
            System.out.println("ERRO" + erro.toString());
        }
        catch(NumberFormatException erro){
            System.out.println("ERRO 2" + erro.toString());
        }
    }
    
}
