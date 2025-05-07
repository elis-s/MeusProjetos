/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

/**
 *
 * @author Usuario
 */
public class Turma {
    
    private String disciplina;
    private String professor;
    private int cargaHoraria;
    private int qtdAlunos = 0;
    
    public Turma (String disciplina, String professor, int cargaHoraria){
        this.disciplina = disciplina;
        this.professor = professor;
        this.cargaHoraria = cargaHoraria;
    }
    
    Aluno[] aluno = new Aluno[10];
    
    public boolean insereAluno(int matricula, String nome, int nota1, int nota2, int notaTrabalho ){
       
        if(qtdAlunos < 10){
            Aluno alunoInserido = new Aluno(matricula, nome, nota1, nota2, notaTrabalho);
            aluno[qtdAlunos] = alunoInserido;
            qtdAlunos++;
            return true;
        }else{
            return false;
        }
        
       
        
    }
    
    public int nota1(int nota1){
        return nota1;
    }
    
    public int nota2 (int nota2){
        return nota2;
    }
    
    public int notaTrabalho(int notaTrabalho){
        return notaTrabalho;
    }
    
    public Aluno[] getAluno(){
        return aluno;
    }
    
    
    public void exibir(){
        for(int i = 0; i < qtdAlunos; i++ ){
            System.out.println(aluno[i].toString());
        }
        
    }
    
    
    
}
