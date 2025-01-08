/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package salario;

import java.util.Scanner;

/*Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. A empresa paga
as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 40
horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana passada e o salário-hora de cada um. Seu
programa deve aceitar a entrada dessas informações para cada empregado e, então, determinar e exibir o salário bruto do empregado.
Utilize a classe Scanner para inserir os dados
 */
public class Salario {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int horasExtras;
        double totalExtra, total2, total1, total3;
        
        System.out.println("Nome do funcionário: ");
        String nome = teclado.nextLine();
        System.out.println("Salário do funcionário por hora: ");
        double salarioHora = teclado.nextDouble();
        System.out.println("Quantidade de horas trabalhadas: ");
        int horas = teclado.nextInt();
        
        if(horas > 40){
            horasExtras = horas - 40;
            totalExtra = (horasExtras * salarioHora) * (50.0 / 100.0);
            total1 = totalExtra + (horasExtras * salarioHora) + (salarioHora * 40);
            System.out.println(nome);
            System.out.println("Salario " + total1);
            
        }else if(horas == 40){
            total2 = salarioHora * 40;
            System.out.println(nome);
            System.out.println("Salario " + total2);
        }else{
            total3 = horas * salarioHora;
            System.out.println("Salario " + total3);
        }
        
        
        

    }
}
