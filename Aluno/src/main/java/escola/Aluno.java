/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package escola;

/*Cada objeto da classe Aluno deve guardar os seguintes dados: matrícula, nome, 2
notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta classe:
a. setNota1 -> para inserir a nota da primeira avaliação.
b. setNota2 -> para inserir a nota da segunda avaliação.
c. setNotaTrabalho -> para inserir a nota do trabalho
d. media -> calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho
tem peso 2)
 */
public class Aluno {

    private int matricula;
    private String nome;
    private int nota1;
    private int nota2;
    private int notaTrabalho;
    
    public Aluno (int matricula, String nome, int nota1, int nota2, int notaTrabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }
    
    public void setNota1(int nota1){
        this.nota1 = nota1;
    }
    
    public void setNota2(int nota2){
        this.nota2 = nota2;
    }
    
    public void setNotaTrabalho(int notaTrabalho){
        this.notaTrabalho = notaTrabalho;
    }
    
    public double media(){
        
        double calculo = 2.5 + 2.5 + 2;
        double mediaFinal = ((nota1 * 2.5) + (nota2 *2.5) + (notaTrabalho * 2)) / calculo;
        return mediaFinal;
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public String toString(){
        return "NOME: " + nome + " MATRICULA: " + matricula + " NOTA 1: " + nota1 + " NOTA 2: " +nota2 + " NOTA DO TRABALHO: " + notaTrabalho;
    }
    
    
    
}
