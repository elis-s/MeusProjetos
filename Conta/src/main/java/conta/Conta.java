/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package conta;

/*Implemente uma classe chamada Conta que tenha por atributos o número da conta, o
nome do correntista e o saldo. Deve ser criada uma aplicação que instancie um objeto
da classe Conta e ofereça um menu com as opções saque, depósito, consulta de saldo
e sair da aplicação. A aplicação deve realizar as operações que o usuário desejar até
que ele peça para sair do programa.
 */
public class Conta {

    
    private int numeroConta;
    private String nome;
    private double saldo;
    
        public Conta(int numeroConta, String nome, double saldo){
            this.numeroConta = numeroConta;
            this.nome = nome;
            this.saldo = saldo;
        }
        
        public double saque(double saque){
             saldo -= saque;
             return saldo;
        }
        
        public double deposito(double deposito){
            saldo += deposito;
            return saldo;
        }
        
        public double getSaldo(){
            return saldo;
        }
        
        public String toString(){
            return "Nome: " + nome + " Numero da Conta: " + numeroConta ;
        }    
    
    
    
    
    
}
