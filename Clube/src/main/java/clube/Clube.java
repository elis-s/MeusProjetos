/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clube;

/* Clube: Controle de Sócios
Classe Socio: nome, matricula, ativo (boolean)

Métodos: ativar(), desativar(), status()

Main: cadastrar 3 sócios, desativar o 2º, mostrar status
 */
public class Clube {

   
    private String nome;
    private int matricula;
    private boolean ativo;
    
    public Clube(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.ativo = true;
    }
    
    public void ativar(){
       
        this.ativo = true;
    }
    
    public void desativar(){
      this.ativo = false;
    }
    
    public String status (){
       if(ativo == true){
           return "ATIVO";
       }else{
           return "INATIVO";
       }
    }
    
    public String toString(){
        return "NOME: " + nome + " MATRICULA: " + matricula + " STATUS: " + ativo;
    }
    
    
}
