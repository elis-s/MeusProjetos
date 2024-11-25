/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aritmetica;

import java.util.Scanner;

/*Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e imprima sua soma, produto,
diferença e quociente (divisão).
 */
public class Aritmetica {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe um numero inteiro: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Informe outro numero inteiro: ");
        int num2 = teclado.nextInt();
        
        int soma = num1 + num2;
        System.out.println("Soma: " + soma);
        
        int multiplicacao = num1 * num2;
        System.out.println("Multiplicação: " + multiplicacao);
        
        int subtracao = num1 - num2;
        System.out.println("Subtração: " + subtracao);

        int divisao = num1 / num2;
        System.out.println("Divisão: " + divisao);
        
    }
}
