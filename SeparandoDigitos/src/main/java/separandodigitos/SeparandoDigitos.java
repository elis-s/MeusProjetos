/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package separandodigitos;

import java.util.Scanner;

/*Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário,
separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços. Por exemplo, se o usuário
digitar o número 42339, o programa deve imprimir
4 2 3 3 9

Suponha que o usuário insira o número correto de dígitos. O que acontece quando você insere um número com mais de cinco dígitos?
O que acontece quando você insere um número com menos de cinco dígitos? [Dica: é possível fazer este
exercício com as técnicas que aprendeu neste capítulo. Você precisará tanto das operações de divisão como das de resto 
para “selecionar” cada dígito.]
 */


public class SeparandoDigitos {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um valor de 5 digitos: ");
        int valor = teclado.nextInt();
        
        //metodo de conversão, ou seja o inteiro vai se transformar em String 3 em "3", por exemplo
        String conversao = Integer.toString(valor);
        
        if(conversao.length() != 5){
            System.out.println("INVÁLIDO!");
        }else{
            //acessando cada digito da String, a posição começa do 0, então quando chamo o 0 chamo primeiro numero
        char numero1 = conversao.charAt(0);
        char numero2 = conversao.charAt(1);
        char numero3 = conversao.charAt(2);
        char numero4 = conversao.charAt(3);
        char numero5 = conversao.charAt(4);
        
        System.out.println(numero1 + " " + numero2 + " " + numero3 + " " + numero4 + " " + numero5);

        }
                
        
        
        
        
    }
}
