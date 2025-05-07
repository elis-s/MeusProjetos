/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alunoo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        Alunoo[] aluno = new Alunoo[2];
        
        for(int i = 0; i < aluno.length; i++){
            System.out.println("Nome: ");
            String nome = teclado.nextLine();
            System.out.println("Idade: ");
            int idade = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Peso: ");
            int peso = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Altura: ");
            double altura = teclado.nextDouble();
            teclado.nextLine();
           
            aluno[i] = new Alunoo(nome, idade, peso, altura);
                    
                    
            
        }
        
       
            for(Alunoo a : aluno){
            double imc = a.calcularIMC();
            System.out.println(a.toString() + a.calcularIMC() + a.classificarIMC(imc));
        }





    }
    
}
