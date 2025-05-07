/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package alunoo;

/*2. Academia: Cadastro de Alunos
Crie uma classe Aluno com atributos nome, idade, peso, altura.
Adicione:

Um método calcularIMC() que retorna o IMC do aluno

Um método classificarIMC() que imprime "Abaixo do peso", "Peso ideal", ou "Acima do peso" com base no IMC

Na Main, leia os dados de 3 alunos, calcule e classifique o IMC de cada um.
 */
public class Alunoo {

    
    private String nome;
    private int idade;
    private int peso;
    private double altura;
    
    public Alunoo(String nome, int idade, int peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public double calcularIMC(){
        return peso / (altura * altura);
    }
    
    public double classificarIMC(double imc){
        if(imc < 18.5){
            System.out.println("ABAIXO DO PESO");
        }else if(imc>=18.5 && imc <=24.9){
            System.out.println("PESO NORMAL");
        }else if(imc > 25 && imc< 29.9){
            System.out.println("SOBREPESO");
        }else{
            System.out.println("OBESIDADE");
        }
        
        return imc;
    }
    
    public String toString(){
        return "NOME: " + nome + " IDADE: " + idade + " PESO: " + peso + " ALTURA: " + altura;
    }
   
    
    
    
    
    
    
    
    
}
