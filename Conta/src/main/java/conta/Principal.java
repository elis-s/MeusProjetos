/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conta;

import java.util.Scanner;

/*Classe AccountTest:
A classe AccountTest deve criar dois objetos do tipo Account e demonstrar as funcionalidades da classe Account. Inicialmente, deve ser exibido o saldo de cada conta.
Em seguida, deve ser solicitado ao usuário um valor para depósito em cada uma das contas. Após os depósitos, o saldo de cada conta deve ser exibido novamente.
Requisitos Adicionais:

Caso o valor de depósito informado seja menor ou igual a 0.0, o programa não deve realizar a operação e deve manter o saldo da conta inalterado.
 */
public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        //o objeto não pode ser inicializado vazio nesse caso, pq teoricamente as contas eu já tenho
        Conta conta1 = new Conta("Elislania " , 500000);
        Conta conta2 = new Conta("Soelania " , 100000);
        
        //exibindo os saldos das contas
        System.out.println("Saldo da conta 1: " + conta1.getNome() + conta1.getSaldo());
        System.out.println("Saldo da conta 2: " + conta2.getNome() + conta2.getSaldo());
        
        //depositos
        System.out.println("Informe o valor de deposito da conta 1: ");
        //a variavel para adicionar o dinheiro jás estava criada na classe Conta para o metodo de deposito, se eu criasse outra aqui daria erro e esse vai ter a declaração do tipo double
        //a da conta 2 nao vai ter pq já foi refernciado aqui ou vai dar erro 
        double depositoAdicionado = teclado.nextDouble();
        conta1.deposito(depositoAdicionado);
        
        System.out.println("Informe o valor de deposito da conta 2: ");
        depositoAdicionado = teclado.nextDouble();
        conta2.deposito(depositoAdicionado);
        
        //saques
        System.out.println("Informe o valor que gostaria de retirar da conta 1: ");
        double sacarRetirar = teclado.nextDouble();
        conta1.sacar(sacarRetirar);
        
        System.out.println("Informe o valor que gostaria de sacar da conta 2: ");
        sacarRetirar = teclado.nextDouble();
        conta1.sacar(sacarRetirar);
        
        //saldo atual
        System.out.println("O saldo atual da conta 1 é de " + conta1.getNome() + conta1.getSaldo());
        System.out.println("O saldo atual da conta 2 é de " + conta2.getNome() + conta2.getSaldo());
        

    }
    
}
