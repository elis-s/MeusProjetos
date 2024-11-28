/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package imc;

import java.util.Scanner;

/*Crie um aplicativo de calculadora IMC que leia o peso do usuário em libras e a altura em polegadas 
(ou, se preferir, o peso em quilogramas e a altura em metros) e, então, calcule e exiba o índice de massa corporal dele.
Além disso, que exiba as seguintes informações do Department of Health and Human Services/National Institutes of Health,
assim o usuário pode avaliar o seu IMC:
 */
public class IMC {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o peso: ");
        int peso = teclado.nextInt();
        
        System.out.println("Informe a altura: ");
        double altura = teclado.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.println("O IMC é: " + imc);
        
        if(imc < 18.5){
            System.out.println("Abaixo do peso! ");
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso normal!");
        }else if(imc >= 25 && imc <= 29.9){
            System.out.println("Sobrepeso!");
        }else if(imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade I");
        }else if(imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade II");
        }else{
            System.out.println("Obesidade III");
        }

    }
}
