/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pedido;

/*Classe Pedido: prato, preco, quantidade

Método: calcularTotal()

Main: vetor de 5 pedidos, total geral
 */
public class Pedido {

   
    private String prato;
    private double preco;
    private int quantidade;
    
    
    public Pedido(String prato, double preco, int quantidade){
        this.prato = prato;
        this.preco = preco;
        this.quantidade = quantidade;
        
    }
    
    public double calcularTotal(){
        
        double total =  preco * quantidade;
        return total;
        
    }
    
    public String toString(){
        return "PRATO: " + prato + " PREÇO: " + preco + " QUANTIDADE: " + quantidade ;
    }
    
    
    
    
}
