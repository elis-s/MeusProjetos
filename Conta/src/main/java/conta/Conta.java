/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package conta;

/*Enunciado:

Implemente uma classe chamada Account que simula uma conta bancária, com funcionalidades de controle de saldo e depósito. A classe deve possuir as seguintes características:

Atributos:

Um atributo name (do tipo String) para armazenar o nome do titular da conta.
Um atributo balance (do tipo double) para armazenar o saldo da conta. O saldo inicial deve ser 0.0, e a classe deve garantir que um saldo só seja atribuído se for maior que 0.0.
Construtor:

A classe deve conter um construtor que recebe dois parâmetros:
O nome do titular da conta (do tipo String).
O saldo inicial (do tipo double), que só será atribuído se for maior que 0.0; caso contrário, o saldo deve permanecer 0.0.
Métodos:

Um método deposit (do tipo void), que recebe um valor (do tipo double) e adiciona esse valor ao saldo da conta, desde que o valor seja maior que 0.0.
Um método getBalance (do tipo double), que retorna o saldo atual da conta.
Métodos setName e getName para modificar e acessar o nome do titular da conta, respectivamente.

Requisitos Adicionais:

Caso o valor de depósito informado seja menor ou igual a 0.0, o programa não deve realizar a operação e deve manter o saldo da conta inalterado.

Modifique a classe Account para fornecer um método chamado withdraw que retira dinheiro de uma Account. 
Assegure que o valor de débito não exceda o saldo de Account. Se exceder, o saldo deve ser deixado inalterado
e o método deve imprimir uma mensagem que indica "Withdrawal amount exceeded account balance" [Valor de débito
excedeu o saldo da conta]. Modifique a classe AccountTest (Figura 3.9) para testar o método withdraw.
 */
public class Conta {

    //Atributos
    private String nome;
    private double saldo;
    
    public Conta (String nome, double saldo){
        
        this.nome = nome;
        
        //se for maior que  vai referenciar o paramentro do construtor 
        if(saldo > 0.0){
            this.saldo = saldo;
        }
                
    }   
    
    public void sacar (double sacarRetirar){
        
        if(sacarRetirar > saldo){
            System.out.println("O valor de saque excedeu o valor da conta (saldo negativo)");
        }else{
            saldo = saldo -= sacarRetirar;
        }
        
    }
    
    public void deposito (double depositoAdicionado){
        
        //se for maior que 0 o valor adicionado, então esse novo saldo vai ser adicionado 
        if(depositoAdicionado > 0.0){
            saldo = saldo += depositoAdicionado;
        }
    }
    
    public double getSaldo (){
        return saldo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
        
    }
    
    public String getNome(){
        return nome;
        
    }
    
        
    }

