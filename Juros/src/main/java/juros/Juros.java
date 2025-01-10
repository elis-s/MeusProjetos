/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package juros;

/*Uma pessoa investe US$ 1.000 em uma conta-poupança que rende juros de 5% ao ano. Supondo que todo
o juro seja aplicado, calcule e imprima a quantia de dinheiro na conta no fim de cada ano por 10 anos.
Utilize a seguinte fórmula para determinar as quantidades:
 a = p (1 + r)n
onde
 p é a quantia original investida (isto é, o principal)
 r é a taxa de juros anual (por exemplo, utilize 0,05 para 5%)
 n é o número de anos
 a é a quantia em depósito no fim do n-ésimo ano
 */
public class Juros {

    public static void main(String[] args) {
        
        double poupanca = 1000;
        double poupancaJuros;
        double juros = 0.05;
        

        //contando o ano
        for(int ano = 1; ano <= 10; ano++){
        
        //seria o calculo da poupança com juros, seria o valor da poupança vezes os juros, formanco o valor da poupança de 1 ano
        poupancaJuros =  poupanca * (1 + juros);
        //o valor da poupança com juros seria atribuido ao valor de poupança, então poupanca se torna a poupancaJuros
        poupanca = poupancaJuros;
        
            
            System.out.println("Poupança: " + (ano + 1));
            System.out.println(poupancaJuros);
            
        }
            
         
    }
}
