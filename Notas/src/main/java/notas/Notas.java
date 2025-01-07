/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package notas;

import java.util.Scanner;

/*Uma classe de dez alunos se submeteu a um questionário. As notas (inteiros no intervalo 0–100) para esse
questionário estão disponíveis. Determine a média da classe no questionário.
 */
public class Notas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int aluno = 1; // contador de alunos começa em  pra ir ate , se começasse em  iria ate 11
        int total = 0; //contador de notas começa em 0 pq n tem nenhuma nota ainda quando inicializado
        
        while(aluno <= 10){
            System.out.println("Informe a nota do aluno: ");
            int nota = teclado.nextInt();
            total = total + nota; //atribuindo as notas inseridas ao total das notas
            aluno++; // garantindo que a nota foi inserida e trazendo a proxima pedida de nota
        }
        System.out.println("A soma das notas é: " + total);
        int media = total / 10;
        System.out.println("A media das notas é: " + media);
        
        



    }
}
