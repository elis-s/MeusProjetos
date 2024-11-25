/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package produtointeiros;

import java.util.Scanner;

/*Usando as instruções que você escreveu no Exercício 2.5, elabore um programa completo que calcule e imprima a soma de dois inteiros.
 */
public class ProdutoInteiros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe umn numero inteiro: ");
        int num1 = teclado.nextInt();
        System.out.println("Informe outro numero inteiro: ");
        int num2 = teclado.nextInt();
        
        int total = num1 + num2;
        
        System.out.println("O total da equação: " + total);



    }
}
