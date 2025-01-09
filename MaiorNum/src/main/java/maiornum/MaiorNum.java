/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package maiornum;

import java.util.Scanner;

/*O processo de localizar o maior valor é muito utilizado em aplicativos de computador. Por exemplo, um
programa que determina o vencedor de uma competição de vendas inseriria o número de unidades vendidas por cada vendedor. O vendedor
que vende mais unidades ganha a competição. Escreva um programa em pseudocódigo e, então, um aplicativo Java que aceita como entrada
uma série de 10 inteiros e determina e imprime o maior dos inteiros. Seu programa deve utilizar pelo menos as três variáveis a seguir:
a) counter: um contador para contar até 10 (isto é, monitorar quantos números foram inseridos e determinar quando todos os 10 números 
foram processados).
b) number: o inteiro mais recentemente inserido pelo usuário.
c) largest: o maior número encontrado até agora.
 */
public class MaiorNum {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        //inicializando o contador 
        int contador = 1;
        int primeiro = 0;
        int numero = 0;
        
        // o primeiro 
        System.out.println("Escreva o primeiro numero: ");
        primeiro = teclado.nextInt();
        
        while(contador < 10){
            System.out.println("Qual teu numero? " + (contador + 1));
            numero = teclado.nextInt();
            
            //substituição de posição 
            if(numero > primeiro){
                primeiro = numero;
                System.out.println("ESSE É O MAIOR NUMERO! " + primeiro);

            }
            
            contador++;
        }
        
        System.out.println("O MAIOR NUMERO DE TODOS FOI " + primeiro);
        
    }
}
