/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package emissaocarbono;

import java.util.Scanner;

/*

Alguns cientistas acreditam que as emissões de carbono, em especial da queima de
combustíveis fósseis, contribuem significativamente para o aquecimento global, e que isso pode ser combatido se as pessoas tomarem
medidas a fim de limitar o uso de combustíveis com base de carbono. As organizações e pessoas estão cada vez mais preocupadas com suas
“emissões de carbono”.

Teste essas calculadoras com o intuito de determinar as suas emissões de carbono. Os exercícios nos próximos capítulos solicitarão que
você programe sua própria calculadora de emissões de carbono. A fim de se preparar, use a web como recurso de pesquisa de fórmulas para
esse cálculo.

Emissa de CO2 = Atividade x Fator de Emissão
*/



public class EmissaoCarbono {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o consumo estimado? ");
        double consumo = teclado.nextDouble();
        System.out.println("Qual o fator de emissão? ");
        double fatorEmissao = teclado.nextDouble();
        
        double emissao = consumo * fatorEmissao;
        
        System.out.println("A emissão é " + emissao);
        
        
        
    }
}
