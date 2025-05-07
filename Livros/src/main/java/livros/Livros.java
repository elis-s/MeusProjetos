/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package livros;

/*Biblioteca: Controle de Livros
Crie uma classe Livro com atributos: titulo, autor, preco.
Implemente os seguintes métodos:

Um construtor que receba os três atributos

Um método exibirDetalhes() que imprime os dados do livro

Um método reajustarPreco(double percentual) que aumenta o preço conforme o percentual passado

Crie também uma classe Main para cadastrar 3 livros e reajustar o preço do primeiro em 10%.
 */
public class Livros {

   private String titulo;
   private String autor;
   private double preco;
   
   public Livros(String titulo, String autor, double preco){
       this.titulo = titulo;
       this.autor = autor;
       this.preco = preco;
   }
   
   public double reajustarPreco(double percentual){
       return preco += preco * (percentual/100);
   }
   
   @Override
   public String toString(){
       return "TITULO: " + titulo + " , " + " AUTOR: " + autor + " PREÇO: " + preco;
   }
   
    
}
