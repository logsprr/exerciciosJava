/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Conta myconta;
        myconta = new Conta();
        myconta.titular = "";
        System.out.println("Por favor digite seu nome de titular:");
        Scanner sc = new Scanner(System.in);
        myconta.titular = sc.nextLine();
        
        myconta.deposita(0);
        
        System.out.println("Saldo atual: "+ myconta.saldo);
        
        myconta.saca(0);
        
        
        System.out.println("Saldo Final: "+ myconta.saldo);
        
        
        
    
    }
}
