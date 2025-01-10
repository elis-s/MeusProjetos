/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pares;

/*A instrução for para somar os inteiros pares de 2 a 20 e armazenar o resultado em uma variável int chamada total. 

 */
public class Pares {

    public static void main(String[] args) {
        

        int soma = 0;
        

        for(int par = 2; par <= 20; par += 2 ){
            soma = soma + par;
            System.out.println("Somas " + soma);
                        
            
        }
            
            
         
    }
}
