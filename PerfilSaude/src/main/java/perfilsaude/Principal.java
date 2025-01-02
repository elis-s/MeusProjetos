/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perfilsaude;

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
        
        System.out.println("Nome: ");
        String nome = teclado.nextLine();
        System.out.println("Sobrenome: ");
        String sobrenome = teclado.nextLine();
        System.out.println("Sexo: ");
        String sexo = teclado.nextLine();
        System.out.println("Dia nascimento: ");
        int nascDia = teclado.nextInt();
        System.out.println("Mes nascimento: ");
        int nascMes = teclado.nextInt();
        System.out.println("Ano nascimento: ");
        int nascAno = teclado.nextInt();
        System.out.println("Altura: ");
        int altura = teclado.nextInt();
        System.out.println("KG:");
        int kg = teclado.nextInt();
        
        PerfilSaude perfilSaude = new PerfilSaude(nome, sobrenome, sexo, nascDia, nascMes, nascAno, altura, kg);

        System.out.println(perfilSaude.mostrarDados1());
        System.out.println(perfilSaude.mostrarDados2());
        System.out.println(perfilSaude.mostrarDdados3());
       
    }
    
}
