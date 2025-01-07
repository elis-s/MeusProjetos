/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package notassentinela;

import java.util.Scanner;

/*
 */
public class NotasSentinela {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int aluno = 1;
        int total = 0;
        
        System.out.println("Gostaria de iniciar o programa?"
                + "Sim (1) "
                + "Não (2) ");
        
        int escolha = teclado.nextInt();
        
        if(escolha != 2){
            
            while(aluno <= 10){
            System.out.println("Informe a nota do aluno: ");
            int nota = teclado.nextInt();
            total = total + nota;
            aluno++;
            
        }            
        }
        
        System.out.println("Soma das notas: " + total);

        
        

    }
}
