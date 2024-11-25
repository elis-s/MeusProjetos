/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package menormaior;

import java.util.Scanner;

/*) Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os
números menores e maiores.
 */
public class MenorMaior {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int num2 = teclado.nextInt();
        
        System.out.println("Digite o terceiro numero: ");
        int num3 = teclado.nextInt();
        
        int soma = num1 + num2 + num3;
        System.out.println("Soma: " + soma);
        
        int media = soma / 3;
        System.out.println("Media: " + media);
        
        int produto = num1 * num2 * num3;
        System.out.println("Produto: " + produto);
        
        if(num1 > num2 && num1 > num3){
            System.out.println("O primeiro numero é maior");
        }else if(num1 < num2 && num2 > num3){
            System.out.println("O segundo numero é maior");
        }else if(num3 > num1 && num3 > num2){
            System.out.println("O terceiro numero é maior");
        }else{
            System.out.println("INVÁLIDO");
        }

    }
}
