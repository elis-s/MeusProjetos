/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package comissaovendas;

import java.util.Scanner;

/*Uma grande empresa paga seu pessoal de vendas com base em comissões. O pessoal de vendas
recebe R$ 200 por semana mais 9% de suas vendas brutas durante esse período. Por exemplo, um vendedor que realiza um total de vendas
de mercadorias de R$ 5.000 em uma semana recebe R$ 200 mais 9% de R$ 5.000, um total de R$ 650. Foi-lhe fornecida uma lista dos itens
vendidos por cada vendedor. Os valores desses itens são como segue:
Item Value
1 239.99
2 129.75
3 99.95
4 350.89
Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a última semana e calcula e exibe os 
rendimentos do vendedor. Não existe nenhum limite para o número de itens que pode ser vendido.
 */
public class ComissaoVendas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        
        int totalProd = 0;
        int prod = 1;
        double total = 0;
        
        System.out.println("Quantos produtos foram vendidos? ");
        totalProd = teclado.nextInt();
        
        while(prod <= totalProd){
            System.out.println("Informe o valor do produto vendido: ");
            double prodVendido = teclado.nextDouble();
            total = total + prodVendido;
            prod++;
            
        }
        
        System.out.println("Total em produtos vendidos " + total);
        double varRecebido = 200 + (total * 9.0 / 100.0);
        System.out.println("Valor recebido " + varRecebido);

    }
}
