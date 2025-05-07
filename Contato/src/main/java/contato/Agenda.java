/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contato;

/**
 *
 * @author Usuario
 */
public class Agenda {
    
    private int qtdContatos = 0;
    
   
    
    Contato[] contato = new Contato[50];
    
    public boolean addContato(String nome, int telefone, String dataAniversario, String email){
        if(qtdContatos < 50){
            Contato contatoCriado = new Contato(nome, telefone, dataAniversario, email);
            contato[qtdContatos] = contatoCriado;
            qtdContatos++;
            return true;
        }else{
            return false;
        }
    }
    
    
    public String consultar(String nomeProcurado){
        for(int i = 0; i < contato.length; i++){
            if(contato[i] != null && contato[i].getNome().equalsIgnoreCase(nomeProcurado)){
             System.out.println("Contato: " + contato[i].getNome());
            }
        }
        
        return "Não Encontrado";
    }
    
    public void exibirContatos(){
        for(int i = 0; i < qtdContatos; i++){
            System.out.println(contato[i].toString());
        }
    }
    
    public String aniversarianteMes(int mes){
        
        String resultado = "";
        
        for(int i = 0; i < contato.length; i++){
            if(contato[i] != null){
                String data = contato[i].getDataAniversario();
                String[] parte = data.split("/");
                
                if(parte.length == 3){
                    int mesContato = Integer.parseInt(parte[1]);
                    
                    if(mesContato == mes){
                        resultado += contato[i].getNome() + " " + contato[i].getDataAniversario();                   }
                }
            }
        }
        
        return resultado;
        
    }
    
    
}
