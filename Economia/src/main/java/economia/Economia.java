/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package economia;

import java.util.Scanner;

/*Pesquise vários sites sobre faixa solidária. Crie um aplicativo que calcule o custo diário
de dirigir, para estimar quanto dinheiro pode ser economizado com o uso da faixa solidária, que também tem outras vantagens, como
reduzir emissões de carbono e congestionamento de tráfego. O aplicativo deve introduzir as seguintes informações e exibir o custo por dia
de dirigir para o trabalho do usuário:
a) Quilômetros totais dirigidos por dia.
b) Preço por litro de gasolina.
c) Quilômetros médios por litro.
d) Taxas de estacionamento por dia.
e) Pedágio por dia.

 */
public class Economia {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe qual a kilimetragem inicial: ");
        double kmInicio = teclado.nextInt();
        
        System.out.println("Informe qual a kilometragem final:  ");
        double kmFinal = teclado.nextInt();
        
        double kmTotal = kmFinal - kmInicio;
               
        System.out.println("Informe quanto colocou de gasolina (em reais): ");
        double gasolina = teclado.nextInt();
        
        System.out.println("Informe quanto colocou de gasolina (em litros): ");
        int litros = teclado.nextInt();
        
        double precoLitro = gasolina / litros;
                
        System.out.println("Informe qual o consumo de combustivel na viagem(em litros): ");
        int consumo = teclado.nextInt();
        
        double kmMedio = kmTotal / consumo;
                
        System.out.println("Informe o valor do estacionamento: ");
        double precoEstacionamento = teclado.nextDouble();
        double precoMinuto = precoEstacionamento / 60;
        
        System.out.println("Quanto tempo ficou estacionado?(em minutos) ");
        int tempo = teclado.nextInt();
        
        double taxaDiaEstacionamento = precoMinuto * tempo;
        
        System.out.println("Informe o numero de pedagios: ");
        int numPedagio = teclado.nextInt();
        
        //armazenar o total de todos os pedagio, preciso dele pq não posso criar essa inicialização dentro do loop ou da erro
        double totalPedagio = 0;
        
            for(int i = 0; numPedagio > i; i++){
            System.out.println("Informe o preço do pedagio: ");
            double pedagio = teclado.nextDouble();
            //isso vai fazer que cada preço informado seja vinculado a um pedagio e esses valores sejam somados e implementados os totalPedagio a partir de pedagio que é o preço 
            totalPedagio += pedagio;        
        }
                
        System.out.println("TOTAL DE KM DIRIGIDOS NO DIA: " + kmTotal );
        System.out.println("VOCÊ GASTOU " + precoLitro + " A CADA LITRO DE GASOLINA");
        System.out.println("VOCê GASTOU " + kmMedio + " A CADA LITRO ");
        System.out.println("TAXA DE ESTACIONAMENTO: " + taxaDiaEstacionamento);
        System.out.println("TOTAL DE PEDAGIO: " + totalPedagio);

        

        
    }
}
