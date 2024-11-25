/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package valorinteirocaracter;

/*Eis outra prévia do que virá adiante. Neste capítulo, você aprendeu sobre inteiros e o tipo int. O
Java também pode representar letras maiúsculas, minúsculas e uma variedade considerável de símbolos especiais. Cada caractere tem
uma representação correspondente de inteiro. O conjunto de caracteres que um computador utiliza com as respectivas representações na
forma de inteiro desses caracteres é chamado de conjunto de caracteres desse computador. Você pode indicar um valor de caractere em um
programa simplesmente incluindo esse caractere entre aspas simples, como em ‘A'.
Você pode determinar o equivalente em inteiro de um caractere precedendo-o com (int), como em
 (int) 'A'
Um operador dessa forma é chamado operador de coerção. (Você aprenderá sobre os operadores de coerção no Capítulo 4.) A instrução
a seguir gera saída de um caractere e seu equivalente de inteiro:
System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
Quando a instrução precedente executa, ela exibe o caractere A e o valor 65 (do conjunto de caracteres Unicode®) como parte da
string. O especificador de formato %c é um espaço reservado para um caractere (nesse caso, ‘A').
Utilizando instruções semelhantes àquela mostrada anteriormente neste exercício, escreva um aplicativo que exiba os equivalentes
inteiros de algumas letras maiúsculas, minúsculas, dígitos e símbolos especiais. Mostre os equivalentes inteiros do seguinte: A B C a b c
0 1 2 $ * + / e o caractere em branco.
 */
public class ValorInteiroCaracter {

    //quando o resultado retornado é do proprio sistema eu não posso dar espaço, porque ele tambem conta, então vai dar erro
    public static void main(String[] args) {
    
        System.out.println("Os valores dos caracteres  seguir: " + 'A' + ((int)'A'));
        System.out.println("Os valores dos caracteres  seguir: " + 'B' + ((int)'B'));
        System.out.println("Os valores dos caracteres  seguir: " + 'C' + ((int)'C'));
        System.out.println("Os valores dos caracteres  seguir: " + 'a' + ((int)'a'));
        System.out.println("Os valores dos caracteres  seguir: " + 'b' + ((int)'b'));
        System.out.println("Os valores dos caracteres  seguir: " + 'c' + ((int)'c'));
        System.out.println("Os valores dos caracteres  seguir: " + '0' + ((int)'0'));
        System.out.println("Os valores dos caracteres  seguir: " + '1' + ((int)'1'));
        System.out.println("Os valores dos caracteres  seguir: " + '2' + ((int)'2'));
        System.out.println("Os valores dos caracteres  seguir: " + '$' + ((int)'$'));
        System.out.println("Os valores dos caracteres  seguir: " + '*' + ((int)'*'));
        System.out.println("Os valores dos caracteres  seguir: " + '+' + ((int)'+'));
        System.out.println("Os valores dos caracteres  seguir: " + '/' + ((int)'/'));
        System.out.println("Os valores dos caracteres  seguir: " + ' ' + ((int)' '));



    }
}
