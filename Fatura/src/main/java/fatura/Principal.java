/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatura;

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

        Scanner teclado = new Scanner (System.in);
                
        System.out.println("Informe o numero da fatura: ");
        String numero = teclado.nextLine();
        
        System.out.println("Informe a descrição da fatura: ");
        String descricao = teclado.nextLine();
        
        System.out.println("Informe a quantidade de itens: ");
        int quantidade = teclado.nextInt();
        
        System.out.println("Informe o preço desses itens: ");
        double preco = teclado.nextDouble();
        
        Fatura fatura = new Fatura(numero, descricao, quantidade, preco);
        
        System.out.println("INFORMAÇÕES DA FATURA");
        System.out.println("Numero: " + fatura.getNumero() + " Descrição: " + fatura.getDescricao() + " Quantidade: " + fatura.getQuantidade() + " Preço: " + fatura.getPreco());
        System.out.println("VALOR TOTAL DA FATURA: " + fatura.valorFatura());
        



    }
    
}
