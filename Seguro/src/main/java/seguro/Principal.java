/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seguro;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Informe o modelo e marca: ");
        String modeloMarca = teclado.nextLine();
        
        System.out.println("Informe a sigla do estado: ");
        String estado = teclado.nextLine();
        
        System.out.println("Informe o numero da conta: ");
        int numeroConta = teclado.nextInt();
        
        
        Seguro seguro = new Seguro(numeroConta, modeloMarca, estado);
        
        //se o valor do boolean for verdadeiro vai ser seguro permitido, se não o seguro não vai ser permitido
        if(seguro.isNoFaultState()){
            System.out.println("Modelo e Marca: " + seguro.getModeloMarca() + " , Estado: " + seguro.getEstado() + " ,Numero da conta:  " + seguro.getNumeroConta() +
                    " - SEGURO PERMITIDO!");
        }else{
            System.out.println("Modelo e Marca: " + seguro.getModeloMarca() + " , Estado: " + seguro.getEstado() + " ,Numero da conta:  " + seguro.getNumeroConta() +
                    " - SEGURO NÃO PERMITIDO!");  
        }
        
        
        
    }
    
}
