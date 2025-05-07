/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionario;

import java.util.Scanner;

/*/*Implemente uma classe chamada Funcionario que possui atributos (nome, funcao,
salario) e um método chamado ajustaSalario que atualiza o salário em 5%. Em seguida,
crie uma aplicação que instancia cinco objetos do tipo Funcionario, define os valores
dos atributos de cada funcionário e aplica o método ajustaSalario para todos os
funcionários.

 */
public class Principal {
        
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);    

    int qtdFuncionarios = 2;
    
        for(int i = 0; i < qtdFuncionarios; i++){
            System.out.println("Nome: ");
            String nome = teclado.nextLine();
            System.out.println("Função: ");
            String funcao = teclado.nextLine();
            System.out.println("Salario: ");
            double salario = teclado.nextDouble();
            teclado.nextLine();
                    
            Funcionario funcionario = new Funcionario(nome, funcao, salario);
            
            
            funcionario.ajustarSalario();
            
            System.out.println(funcionario.toString());

            
                       
        }
    


    }
    
}
