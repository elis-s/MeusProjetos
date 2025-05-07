/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package contato;

/**
 *
 * @author Usuario
 */
public class Contato {

  
    private String nome;
    private int telefone;
    private String dataAniversario = "dd/mm/yyyy";
    private String email;
    
    public Contato(String nome, int telefone, String dataAniversario, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.dataAniversario = dataAniversario;
        this.email = email;
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getDataAniversario(){
        return dataAniversario;
    }
    
    public String toString(){
        return "NOME: " + nome + " TELEFONE: " + telefone + " DATA ANIVERSARIO: " + dataAniversario + " 'EMAIL: " + email;
    }
    
    
    
    
}
