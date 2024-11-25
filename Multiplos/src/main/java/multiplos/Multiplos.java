/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package multiplos;

import java.util.Scanner;

/* Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e imprimir o resultado. 
[Dica: utilize o operador de resto.]
 */
public class Multiplos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite o primeiro numero: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int num2 = teclado.nextInt();
        
        if(num1 % num2 == 0){
            System.out.println("Os numeros são multiplos!");
        }else{
            System.out.println("Os numeros não são multiplos!");
        }
        
    }
}
