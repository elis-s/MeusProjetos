/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conta;

import java.util.Scanner;

/*Implemente uma classe chamada Conta que tenha por atributos o número da conta, o
nome do correntista e o saldo. Deve ser criada uma aplicação que instancie um objeto
da classe Conta e ofereça um menu com as opções saque, depósito, consulta de saldo
e sair da aplicação. A aplicação deve realizar as operações que o usuário desejar até
que ele peça para sair do programa.
 */
public class Principal {

    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int escolha = 0;
        double novoSaldo = 0;

        
        System.out.println("Nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Numero da conta: ");
        int numeroConta = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Saldo da conta: ");
        double saldo = teclado.nextDouble();
        teclado.nextLine();
        
     
        Conta conta = new Conta(numeroConta, nome, saldo);
        
        
        while(escolha != 4){
             System.out.println("(1) DEPOSITO"
                + "(2) CONSULTAR SALDO"
                + "(3) SAQUE"
                + "(4) SAIR");
        escolha = teclado.nextInt();
        
        switch(escolha){
            case 1:
                System.out.println("Qual o valor do deposito? ");
                double deposito = teclado.nextDouble();
                novoSaldo = conta.deposito(deposito);
                System.out.println(conta.toString() + " SALDO " + novoSaldo);
                break;
                
            case 2: 
                System.out.println(conta.toString() + " " + novoSaldo);
                break;
                
            case 3: 
                System.out.println("Qual o valor do saque? ");
                double saque = teclado.nextDouble();
                novoSaldo = conta.saque(saque);
                System.out.println(conta.toString() + " SALDO " + novoSaldo);
                break;
                
            default:
                System.out.println("ENCERRADO!");
                
        }
        
        
        }
         
        
        
        

    }
    
}
