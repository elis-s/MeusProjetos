/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package circulo;

import java.util.Scanner;

/*
Escreva um aplicativo que leia a entrada a partir do usuário do raio de um círculo como um inteiro e imprima o diâmetro do círculo,
circunferência e área utilizando o valor do ponto flutuante 3,14159 para S. Utilize as técnicas mostradas na Figura 2.7. [Observação: você
também pode empregar a constante Math.PI predefinida para o valor de S. Essa constante é mais precisa que o valor 3,14159. A classe
Math é definida no pacote java.lang. As classes nesse pacote são importadas automaticamente, portanto, você não precisa importar
a classe Math para utilizá-la.] Adote as seguintes fórmulas (r é o raio):
diâmetro = 2r
circunferência = 2Sr
área = Sr2
Não armazene os resultados de cada cálculo em uma variável. Em vez disso, especifique cada cálculo como o valor de saída em uma
instrução System.out.printf. Os valores produzidos pelos cálculos de circunferência e área são números de ponto flutuante. A saída
desses valores pode ser gerada com o especificador de formato %f em uma instrução System.out.printf.
 */
public class Circulo {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o raio: ");
        double raio = teclado.nextDouble();
        //Math.PI - é para usar a constante de pi de maneira mais precisa
        double diametro = 2 * raio;
        double circ = 2 * Math.PI * raio;
        double area = Math.PI * raio * 2;
        
        System.out.printf("O diametro é: " + diametro + " .A circunferencia é: " + circ + " .A area é: " + area);

    }
}
