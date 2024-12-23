/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frequenciacardiaca;

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
        System.out.println("Dia de nascimento: ");
        int dataDia = teclado.nextInt();
        System.out.println("Mês do nascimento: ");
        int dataMes = teclado.nextInt();
        System.out.println("Ano do nascimento: ");
        int dataAno = teclado.nextInt();
        
        FrequenciaCardiaca frequenciaCardiaca = new FrequenciaCardiaca(nome, sobrenome, dataDia, dataMes, dataAno);
        
        System.out.println(frequenciaCardiaca.mostrarDados1());
        System.out.println(frequenciaCardiaca.mostrarDados2());
        System.out.println(frequenciaCardiaca.mostrarDados3());
        
        
        
    }
    
}
