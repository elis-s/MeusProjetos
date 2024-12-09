/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package funcionario1;

/*Crie uma classe chamada Employee que inclua três variáveis de instância — um primeiro nome (tipo String), um
sobrenome (tipo String) e um salário mensal (double). Forneça um construtor que inicializa as três variáveis de instância. Forneça um
método set e um get para cada variável de instância. Se o salário mensal não for positivo, não configure seu valor. 
Escreva um aplicativo de
teste chamado EmployeeTest que demonstre as capacidades da classe Employee. Crie dois objetos Employee e exiba o salário anual
de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o salário anual de cada Employee
 */
public class Funcionario1 {

    public String nome;
    public String sobrenome;
    public double salarioMensal;
    
    public Funcionario1(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        
        if(salarioMensal > 0){
            this.salarioMensal = salarioMensal;
        }
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setSalarioMensal(double salarioMensal){
        this.salarioMensal = salarioMensal;
    }
    
    public double getSalarioMensal(){
        return salarioMensal;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public double salarioAnual(){
        return salarioMensal * 12;
    }
    
    public double salarioAnualAcrescimo(){

        //o salarioAnual() tras o metodo de salario anual
        double salarioAnual = salarioAnual();
        //aumento de 10%
        return salarioAnual * 1.10;
    }
    
    
    
    
}
