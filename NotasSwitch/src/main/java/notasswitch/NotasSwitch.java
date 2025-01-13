/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package notasswitch;

import java.util.Scanner;

/*
Fiz de forma melhor, optei por informar a quantidade de alunos em que eu ia inserir a nota e dai coloquei as notas e a media final
foi de toda a turma e não por aluno, pq a nota foi apenas uma 
 */
public class NotasSwitch {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        
        int alunos = 1;
        int qtdAlunos = 0;
        int soma = 0;
        int mediaTurma = 0;
        
        System.out.println("Quantos alunos irão receber a nota? ");
        qtdAlunos = teclado.nextInt();
        
        do {
            System.out.println("Digite a nota: ");
            int nota = teclado.nextInt();
            alunos++;
            
            //atribuir cada nota ao montade, para assim ir somando e eu ter a media no final
            soma += nota;
            
           switch(nota){
               case 10:
                   System.out.println("NOTA A!");
                   break;
               case 9: 
                   System.out.println("NOTA B!");
                   break;
               case 8:
                   System.out.println("NOTA C!");
                   break;
               case 7: 
                   System.out.println("NOTA D!");
                   break;
               case 6, 5, 4, 3, 2, 1:
                   System.out.println("NOTA F!");
                   break;
                   
               default: 
                   System.out.println("INVÁLIDO! ");
           }
           
          
        }while(alunos <= qtdAlunos);
        
         mediaTurma = soma / qtdAlunos;
           
            System.out.println("MEDIA: " + mediaTurma);
           
        
        
    }
}
