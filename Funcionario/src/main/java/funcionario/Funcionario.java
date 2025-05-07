/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package funcionario;

/*Implemente uma classe chamada Funcionario que possui atributos (nome, funcao,
salario) e um método chamado ajustaSalario que atualiza o salário em 5%. Em seguida,
crie uma aplicação que instancia cinco objetos do tipo Funcionario, define os valores
dos atributos de cada funcionário e aplica o método ajustaSalario para todos os
funcionários.
 */
public class Funcionario {

    private String nome;
    private String funcao;
    private double salario;
    
    public Funcionario(String nome, String funcao, double salario){
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }
    
    /*
    Metodo de retorno pq eu precisaria atribuir o novo
    salario a uma variavel e ela precisaria ser retornada
    quando fosse chamada no main.
    O 1 na declaração da procentagem significa a porcentagem total
    que no caso srria 100%, ele me garante que o valor retornado
    sera do valor do salario mais o ajuste
    */
    public void ajustarSalario(){
        salario += salario * (1 + 5 / 100);
    }
    
    public String toString(){
        return "Nome: " + nome + " Função: " + funcao + " Salario Original: " + salario;
    }
    
}
