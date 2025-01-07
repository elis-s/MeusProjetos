/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package limitecredito;

import java.util.Scanner;

/*Desenvolva um aplicativo Java que determina se um cliente de uma loja de departamentos excedeu o
limite de crédito em uma conta-corrente. Para cada cliente, os seguintes dados estão disponíveis:
a) Número de conta.
b) Saldo no início do mês.
c) Total de todos os itens cobrados desse cliente no mês.
d) Total de créditos aplicados ao cliente no mês.
e) Limite de crédito autorizado.
O programa deve inserir todos esses dados como inteiros, calcular o novo saldo , 
exibir o novo saldo e
determinar se o novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo limite de crédito foi excedido, 
o programa deve
exibir a mensagem "Limite de crédito excedido".
 */
public class LimiteCredito {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Numero da conta: ");
        int conta = teclado.nextInt();
        System.out.println("Saldo inicial no mes: ");
        int saldoInicial = teclado.nextInt();
        System.out.println("Total de cobranças do mes: ");
        int cobrancas = teclado.nextInt();
        System.out.println("Total de credito do mes: ");
        int credito = teclado.nextInt();
        System.out.println("Limite de credito: ");
        int limite = teclado.nextInt();
        
        int novoSaldo = saldoInicial - (cobrancas + credito);
        
        System.out.println("O novo saldo é " + novoSaldo);
        
        if(novoSaldo > limite){
            System.out.println("Limite de crédito excedido");
        }
        
        

    }
}
