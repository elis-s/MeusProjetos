/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionario1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        
        System.out.println("Informe o nome do primeiro funcionario: ");
        String nome = teclado.nextLine();
        
        System.out.println("Informe o sobrenome do primeiro funcionario: ");
        String sobrenome = teclado.nextLine();
        
        System.out.println("Informe o salario mensal do primeiro funcionario: ");
        double salarioMensal = teclado.nextDouble();
        
        Funcionario1 funcionario1 = new Funcionario1(nome, sobrenome, salarioMensal);
        
        System.out.println("Informe o nome do segundo funcionario: ");
        String nome2 = teclado.nextLine();
        
        System.out.println("Informe o sobrenome do segundo funcionario: ");
        String sobrenome2 = teclado.nextLine();
        
        System.out.println("Informe o salario mensal do segundo funcionario: ");
        double salarioMensal2 = teclado.nextDouble();
        
        Funcionario1 funcionario2 = new Funcionario1(nome2, sobrenome2, salarioMensal2);

        System.out.println("DADOS DO PRIMEIRO FUNCIONÁRIO ");
        System.out.println("Dados: " + funcionario1.getNome() + " " + funcionario1.getSobrenome() + " " + funcionario1.getSalarioMensal());
        System.out.println("Salario anual: " + funcionario1.salarioAnual());
        System.out.println("Salario com acrescimo: " + funcionario1.salarioAnualAcrescimo());
        
        System.out.println("DADOS DO SEGUNDO FUNCIONARIO");
        System.out.println("Dados: " + funcionario2.getNome() + " " + funcionario2.getSobrenome() + " " + funcionario2.getSalarioMensal());
        System.out.println("Salario anual: " + funcionario2.salarioAnual());
        System.out.println("Salario com acrescimo: " + funcionario2.salarioAnualAcrescimo());

    }
    
}
