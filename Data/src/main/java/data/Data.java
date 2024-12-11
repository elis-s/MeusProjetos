/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package data;

/*Crie uma classe chamada Date que inclua três variáveis de instância — mês (tipo int), dia (tipo int) e ano (tipo int).
Forneça um construtor que inicializa as três variáveis de instância supondo que os valores fornecidos estejam corretos. Ofereça um método
set e um get para cada variável de instância. Apresente um método displayDate que exiba mês, dia e ano separados por barras normais
(/). Escreva um aplicativo de teste chamado DateTest que demonstre as capacidades da classe Date
 */
public class Data {

    public int dia;
    public int mes;
    public int ano;
    
    public Data (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public String mostrarDados(){
         return "DADOS: " + getDia() + " / " + getMes() + " / " + getAno();
    }
      
    
}
