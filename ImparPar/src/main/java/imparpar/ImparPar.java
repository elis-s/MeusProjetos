/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package imparpar;

import java.util.Scanner;

/*Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador
de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
 */
public class ImparPar {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero qualquer: ");
        int numero = teclado.nextInt();
                
        if(numero % 2 == 0 ){
            System.out.println("O numero é par!");
        }else{
            System.out.println("O numero é impar!");
        }


    }
}
