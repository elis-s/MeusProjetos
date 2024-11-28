/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package crescimentodemografico;


/*Utilize a internet para descobrir a população mundial atual e a taxa de crescimento demográfico mundial anual.
Escreva um aplicativo que introduza esses valores e, então, que exiba a população mundial estimada
depois de um, dois, três, quatro e cinco anos
 */
public class CrescimentoDemografico {

    public static void main(String[] args) {

        //int so pode ser usado ate 2 milhoes, então long é mais apropriado e vai um L ao final
        long populacao = 8000000000L;
        
        double crescimento = 0.009;
        
        //se eu vou usar um long tenho q informar ou vai assumir como int 
        double crescimento1ano = (long) (populacao * crescimento) + populacao;
        double crescimento2anos = (long) (populacao) * (crescimento * crescimento) + populacao;
        double crescimento3anos = (long) (populacao) * (crescimento * crescimento * crescimento) + populacao;
        double crescimento4anos = (long) (populacao) * (crescimento * crescimento * crescimento * crescimento) + populacao;
        double crescimento5anos = (long) (populacao) * (crescimento * crescimento * crescimento * crescimento * crescimento) + populacao;

        
        System.out.println("Crescimento em 1 ano: " + crescimento1ano);
        System.out.println("Crescimento em 2 anos: " + crescimento2anos);
        System.out.println("Crescimento em 3 anos: " + crescimento3anos);
        System.out.println("Crescimento em 4 anos: " + crescimento4anos);
        System.out.println("Crescimento em 5 anos: " + crescimento5anos);
        
    }
}
