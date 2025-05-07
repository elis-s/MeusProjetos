/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clube;

import java.util.Scanner;

/** Clube: Controle de Sócios
Classe Socio: nome, matricula, ativo (boolean)

Métodos: ativar(), desativar(), status()

Main: cadastrar 3 sócios, desativar o 2º, mostrar status
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        boolean status;
        
        Clube[] clube = new Clube[3];
        
        for(int i = 0; i < clube.length; i++){
            System.out.println("NOME: " );
            String nome = teclado.nextLine();
            System.out.println("MATRICULA: ");
            int matricula = teclado.nextInt();
            teclado.nextLine();
            
            
            clube[i] = new Clube(nome, matricula);
           
        }
        
        System.out.println("Escolha qual vc quer desativar: ");
        int escolha = teclado.nextInt();
        switch(escolha){
            case 0: 
                clube[0].desativar();
                break;
                
            case 1:
                clube[1].desativar();
                break;
                
            case 2: 
                clube[2].desativar();
                break;
                
            default: 
                System.out.println("INVALIDO!");
        }
                
        for(Clube c : clube){
            
            System.out.println(c.toString());        
            
        }




    }
    
}
