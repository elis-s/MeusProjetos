/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package quilometro;

import java.util.Scanner;

/* Os motoristas se preocupam com a quilometragem obtida por seus automóveis.
Um motorista monitorou várias viagens registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para 
cada tanque cheio.
Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros)
para cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem
total e a soma total de litros de combustível consumidos até esse ponto para todas as viagens. Todos os cálculos de média devem produzir
resultados de ponto flutuante. Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário.
 */
public class Quilometro {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int viagensTotal = 0;
        int viagens = 1;
        int totalKm = 0;
        int totalL = 0;
        
        System.out.println("Quantas viagens foram feitas? ");
        viagensTotal = teclado.nextInt();
        
        while(viagens <= viagensTotal){
            System.out.println("Informe quantos km: ");
            int  km = teclado.nextInt();
            System.out.println("Informe quantos L: ");
            int L = teclado.nextInt();
            totalKm = totalKm + km;
            totalL = totalL + L;
            viagens++;
            
        }
        
        System.out.println("Soma dos Km: " + totalKm);
        System.out.println("Soma dos L: " + totalL);
        double mediaKm = totalKm / viagensTotal;
        System.out.println("Media Km: " + mediaKm);
        double mediaL = totalL / viagensTotal;
        System.out.println("Media L: " + mediaL);


    }
}
