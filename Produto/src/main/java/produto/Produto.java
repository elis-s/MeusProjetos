/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package produto;

/*Mercado: Carrinho de Compras com Vetor
Classe Produto: nome, marca, preco

Métodos: exibir(), comDesconto(double)

Main: vetor de 4 produtos, aplicar 15% de desconto no mais caro
 */
public class Produto {

    private String nome;
    private String marca;
    private double preco;
    
    public Produto(String nome, String marca, double preco){
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }
    
    public double comDesconto(double percentual){
        
        return preco -= preco * (percentual /100);
        
    }
    
    public double getPreco(){
        return preco;
    }
    
    public String toString(){
        return "NOME " + nome + " MARCA " + marca + " PREÇO " + preco;
    }
    
    
    
    
    
}
