/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package comparandointeiros;

import java.util.Scanner;

/*Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e exiba o número
maior seguido pelas palavras “is larger". Se os números forem iguais, imprima a mensagem “These numbers are equal"
 */
public class ComparandoInteiros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe um numero inteiro: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Informe outro numero inteiro: ");
        int num2 = teclado.nextInt();
        
        if(num1 > num2){
            
            System.out.println("É MAIOR o numero 1: " + num1);
            
        }else if (num1 < num2){
        
            System.out.println("É MAIOR o numero 2:  " + num2);
            
    }else{
            
            System.out.println("É IGUAL " + num1);
            
        }
        
    }
}
