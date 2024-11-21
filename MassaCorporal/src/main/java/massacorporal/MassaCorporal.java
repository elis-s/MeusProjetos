/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package massacorporal;

import java.util.Scanner;

/*
A obesidade causa agravamentos significativos de problemas de saúde como
diabetes e doenças cardíacas. Para determinar se uma pessoa está acima do peso ou obesa, você pode utilizar uma medida chamada índice
de massa corporal (IMC). Os departamentos de assistência social e de saúde norte-americanos fornecem uma calculadora do IMC em
http://www.nhlbi.nih.gov/guidelines/obesity/BMI/bmicalc.htm. Utilize-a para calcular seu próprio IMC. Um exercício
adiante solicitará que você programe sua própria calculadora. A fim de se preparar, use a web como recurso de pesquisa de fórmulas para
esse cálculo.
 */
public class MassaCorporal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o peso: ");
        double peso = teclado.nextInt();
        
        System.out.println("Informe a altura: ");
        double altura = teclado.nextDouble();
                
        double imc = peso / (altura * altura);
        
        System.out.println("O IMC é: " + imc);
        
        
        
    }
}
