/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livros;

import java.util.Scanner;

/*/*Biblioteca: Controle de Livros
Crie uma classe Livro com atributos: titulo, autor, preco.
Implemente os seguintes métodos:

Um construtor que receba os três atributos

Um método exibirDetalhes() que imprime os dados do livro

Um método reajustarPreco(double percentual) que aumenta o preço conforme o percentual passado

Crie também uma classe Main para cadastrar 3 livros e reajustar o preço do primeiro em 10%.
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        Livros[] livros = new  Livros[3];
        for(int i = 0; i < livros.length;i++){
            
        System.out.println("Informe o nome do livro: ");
        String nome = teclado.nextLine();
        System.out.println("Informe o nome do autor: ");
        String autor =  teclado.nextLine();
        System.out.println("Informe o preço do livro: ");
        double preco = teclado.nextDouble();
            
        livros[i] = new Livros(nome, autor, preco);

        }
                 
        livros[0].reajustarPreco(10);
        
        for(Livros l : livros){
            System.out.println(l.toString());
            
        }
        



    }
    
}
