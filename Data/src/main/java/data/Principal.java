/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data;

import java.util.Scanner;

/*
 */
public class Principal {

   
    public static void main(String[] args) {

 Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o dia: ");
        int dia = teclado.nextInt();
        System.out.println("Infortme o mês: ");
        int mes = teclado.nextInt();
        System.out.println("Informe o ano: ");
        int ano = teclado.nextInt();
        
        Data data = new Data(dia, mes, ano);
  
        System.out.println(data.mostrarDados());

    }
    
}
