/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package produto;

import java.util.Scanner;

/*/*Mercado: Carrinho de Compras com Vetor
Classe Produto: nome, marca, preco

Métodos: exibir(), comDesconto(double)

Main: vetor de 4 produtos, aplicar 15% de desconto no mais caro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int posicaoMaior = 0;
        Produto[] produto = new Produto[3];
        
        for(int i = 0; i < produto.length; i++){
        System.out.println("Informe o nome do produto: ");
        String nome = teclado.nextLine();
            System.out.println("Informe a marca do produto: ");
            String marca = teclado.nextLine();
            System.out.println("Informe o preço do produto: ");
            double preco = teclado.nextDouble();
            teclado.nextLine();
            
            produto[i] = new Produto(nome, marca, preco);
                        
            if(produto[i].getPreco() > posicaoMaior){
                posicaoMaior += produto[i].comDesconto(15);
            }
            
    }
        
        for(Produto p : produto){
            System.out.println(p.toString());
        }
        
        


    }
    
}
