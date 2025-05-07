/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedido;

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
        
        double totalGeral = 0;
        
        Pedido[] pedido = new Pedido[2];
        
        for(int i = 0; i < pedido.length; i++){
            
        System.out.println("Qual prato? ");
        String prato = teclado.nextLine();
        System.out.println("Preço: ");
        double preco = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Quantidade: ");
        int quantidade = teclado.nextInt();
        teclado.nextLine();
        

        pedido[i] = new Pedido(prato, preco, quantidade);
        
        totalGeral += pedido[i].calcularTotal();
                
        }
        
        for(Pedido p : pedido ){
            System.out.println(p.toString() + " " + p.calcularTotal());
        }
        
        System.out.println("TOTAL " + totalGeral);
        
       


    }
    
}
