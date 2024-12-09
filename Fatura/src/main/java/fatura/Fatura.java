/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fatura;

/*) Crie uma classe chamada Invoice para que uma loja de suprimentos de informática a utilize para representar uma
fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informações como variáveis de instância — o
número (tipo String), a descrição (tipo String), a quantidade comprada de um item (tipo int) e o preço por item (double). Sua
classe deve ter um construtor que inicializa as quatro variáveis de instância. Forneça um método set e um get para cada variável de instância. Além disso, forneça um método chamado 
getInvoiceAmount que calcula o valor de fatura (isto é, multiplica a quantidade pelo
preço por item) e depois retorna esse valor como double. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço
por item não for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado InvoiceTest que demonstra as
capacidades da classe Invoice.
 */
public class Fatura {
    
    public String numero;
    public String descricao;
    public int quantidade;
    public double preco;
    
    public Fatura (String numero, String descricao, int quantidade, double preco){
        
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public void setDescricao (String descricao){
        this.descricao = descricao;
    }
    
    //se a quantidade informada for negativa ele vai considerar quantidade como 0, se não vai considerar quantidade como quantidade normalmente
    public void setQuantidade(int quantidade){
        
        if(quantidade < 0){
            this.quantidade = 0;
        }else{
            this.quantidade = quantidade;
        }
        
    }
    
    public void setPreco(double preco){

        if(preco < 0){
            this.preco = 0.0;
        }else{
            this.preco = preco;
        }
        
    }
    
    public double getPreco(){
        return preco;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public double valorFatura(){
        return quantidade * preco;
    }
    
    
}
