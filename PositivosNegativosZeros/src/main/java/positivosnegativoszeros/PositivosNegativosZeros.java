/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package positivosnegativoszeros;

import java.util.Scanner;


/*Escreva um programa que insira cinco números, além de determinar e imprimir quantos negativos,
quantos positivos e quantos zeros foram inseridos.
 */
public class PositivosNegativosZeros {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //variaveis para contar os numeros negativos, positivos e zeros, isso iniclaiza a partir do 0;
        int negativo = 0;
        int positivo = 0; 
        int zero = 0;
    
        System.out.println("Primeiro numero: ");
        
        //Isso vai fazer ler apenas um dos digitos e quando ler vai somar mais um para incrementar e contar quantos são
        double numero1 = teclado.nextInt();
        if(numero1 < 0){
            negativo++;
        }else if(numero1 > 0){
            positivo++;
        }else{
            zero++;
        }
        
        System.out.println("Segundo numero: ");
        double numero2 = teclado.nextInt();
        if(numero2 < 0){
            negativo++;
        }else if(numero2 > 0){
            positivo++;
        }else{
            zero++;
        }
        
        
        System.out.println("Terceiro numero: ");
        double numero3 = teclado.nextDouble();
        if(numero3 < 0){
            negativo++;
        }else if(numero3 > 0){
            positivo++;
        }else{
            zero++;
        }

        System.out.println("Quarto numero: ");
        double numero4 = teclado.nextDouble();
        if(numero4 < 0){
            negativo++;
        }else if(numero4 > 0){
            positivo++;
        }else{
            zero++;
        }

        System.out.println("Quinto numero: ");
        double numero5 = teclado.nextDouble();
        if(numero5 < 0){
            negativo++;
        }else if(numero5 > 0){
            positivo++;
        }else{
            zero++;
        }
        
        System.out.println("Numeros positivos: " + positivo);
        System.out.println("Numeros negativos: " + negativo);
        System.out.println("Zeros: " + zero);
    }
}
