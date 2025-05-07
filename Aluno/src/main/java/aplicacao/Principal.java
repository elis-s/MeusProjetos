/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacao;
import escola.Aluno;
import escola.Turma;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int cont = 0;
        int nota1, nota2, notaTrabalho;
        
        System.out.println("DADOS DA TURMA");
        System.out.println("Disciplina: ");
        String disciplina = teclado.nextLine();
        System.out.println("Professor: ");
        String professor = teclado.nextLine();
        System.out.println("Craga Horaria: ");
        int cargaHoraria = teclado.nextInt();
        teclado.nextLine();
        
        Turma turma = new Turma(disciplina, professor, cargaHoraria);
        
        while(cont <= 7){
            System.out.println("(1) INSERIR ALUNO"
                    + "\n"
                + "(2) REGISTRAR NOTA 1"
                    + "\n"
                + "(3) REGISTRAR NOTA 2"
                    + "\n"
                + "(4) REGISTRAR NOTA DO TRABALHO"
                    + "\n"
                + "(5) CALCULAR MÉDIA DA TURMA"
                    + "\n"
                + "(6) MOSTRAR LISTA DA TURMA"
                    + "\n"
                + "(7) SAIR"
                    + "\n");
            int escolha = teclado.nextInt();
            
            switch(escolha){
                case 1: 
                    System.out.println("Nome: ");
                    teclado.nextLine();
                    String nome = teclado.nextLine();
                    System.out.println("Matricula: ");
                    int matricula = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Nota 1: ");
                    nota1 = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Nota 2:");
                    nota2 = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Nota do trabalho:" );
                    notaTrabalho = teclado.nextInt();
                    teclado.nextLine();
                    turma.insereAluno(matricula, nome, nota1, nota2, notaTrabalho);
                    turma.exibir();
                    break;
                    
                case 2:
                    System.out.println("Nota 1: ");
                    nota1 = teclado.nextInt();
                    turma.nota1(nota1);
                    break;
                    
                case 3: 
                   System.out.println("Nota 2: ");
                    nota2 = teclado.nextInt();
                    turma.nota2(nota2);
                    break;
                case 4:
                    System.out.println("Nota do Trabalho: ");
                    notaTrabalho = teclado.nextInt();
                    turma.notaTrabalho(notaTrabalho);
                    break;
                case 5: 
                    Aluno[] alunos = turma.getAluno();
                    for(int i = 0; i < alunos.length; i++){
                        if(alunos[i] != null){
                            double media = alunos[i].media();
                            System.out.println(alunos[i].getNome() + "MEDIA: " + media);
                        }
                    }
                    break;
                case 6: 
                    turma.exibir();
                    break;
                case 7: 
                    System.out.println("ENCERRADO!");
                    break;
                default: 
                    System.out.println("INVALIDO!");
                    break;
            }

        }
        


    }
    
}
