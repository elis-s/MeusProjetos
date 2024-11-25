/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package inteirosmaioresmenores;

import java.util.Scanner;

/*Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e o menor inteiro
no grupo.
 */
public class InteirosMaioresMenores {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Primeiro numero: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Segundo numero: ");
        int num2 = teclado.nextInt();
        
        System.out.println("Terceiro numero: ");
        int num3 = teclado.nextInt();
        
        System.out.println("Quarto numero: ");
        int num4 = teclado.nextInt();
        
        System.out.println("Quinto numero: ");
        int num5 = teclado.nextInt();
        
        if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
            System.out.println("Primeiro numero maior!");
        }else if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
            System.out.println("Segundo numero maior!");
        }else if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
            System.out.println("Terceiro numero maior!");
        }else if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
            System.out.println("Quarto numero maior!");
        }else{
            System.out.println("Quinto numero maior!");
        }
        
        if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
            System.out.println("Primeiro numero menor!");
        }else if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
            System.out.println("Segundo numero menor!");
        }else if(num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
            System.out.println("Terceiro numero menor!");
        }else if(num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
            System.out.println("Quarto numero menor!");
        }else{
            System.out.println("Quinto numero menor!");
        }
        

    }
}
