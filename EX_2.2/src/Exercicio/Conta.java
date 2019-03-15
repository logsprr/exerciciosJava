package Exercicio;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Conta {
    float deposito= 0;
    String titular;
    float saldo = 0;
    
    
    void deposita(double quantidade){
        System.out.println("Por favor digite o valor do deposito:");
        Scanner sc = new Scanner(System.in);
        quantidade = sc.nextDouble();
        double nsaldo = this.saldo + quantidade;
        this.saldo = (float) nsaldo;
        
    }
    
    
    void saca(double retirada){
        System.out.println("Por favor digite quanto deseja sacar:");
        Scanner sc = new Scanner(System.in);
        retirada = sc.nextDouble();
        double nsaldo = this.saldo - retirada;
        this.saldo = (float) nsaldo;
    }
    
}
