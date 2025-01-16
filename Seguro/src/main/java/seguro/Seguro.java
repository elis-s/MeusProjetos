/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package seguro;

/*Você foi contratado por uma companhia de seguros de automóvel que atende estes estados do nordeste dos Estados
Unidos — Connecticut, Maine, Massachusetts, New Hampshire, Nova Jersey, Nova York, Pensilvânia, Rhode Island
e Vermont. A empresa quer que você crie um programa que produz um relatório indicando para cada uma das
apólices de seguro de automóvel se a apólice é válida em um estado com seguro de automóvel “sem culpa” (modalidade
de seguro em que o segurado é indenizado independentemente de sua responsabilidade no sinistro) — Massachusetts,
Nova Jersey, Nova York e Pensilvânia.
O aplicativo Java que atende esses requisitos contém duas classes — AutoPolicy (Figura 5.11) e AutoPolicyTest 
A classe AutoPolicy (Figura 5.11) representa uma apólice de seguro de automóvel. A classe contém:
• A variável de instância int accountNumber (linha 5) para armazenar o número da conta da apólice.
• A variável de instância String de makeAndModel (linha 6) para armazenar a marca e o modelo do carro (como um "Toyota Camry").
• A variável de instância String de state (linha 7) para armazenar a sigla do estado de dois caracteres que representa o estado em
que a apólice é válida (por exemplo, "MA" significando Massachusetts).
• Um construtor (linhas 10 a 15) que inicializa as variáveis de instância da classe.
• Os métodos setAccountNumber e getAccountNumber (linhas 18 a 27) para definir e obter uma variável de instância
accountNumber de AutoPolicy.
• Os métodos setMakeAndModel e getMakeAndModel (linhas 30 a 39) para definir e obter a variável de instância AutoPolicy de
um makeAndModel.
• Os métodos setState e getState (linhas 42 a 51) para definir e obter a variável de instância AutoPolicy de um state.
• O método isNoFaultState (linhas 54 a 70) para retornar um valor boolean que indica se a apólice é válida em um estado de
seguros de automóvel “sem culpa”; observe o nome do método — a convenção de nomeação para um método get que retorna um
valor boolean é começar o nome com "is" em vez de "get" (esse método é comumente chamado de método de predicado).
 */
public class Seguro {

    public int numeroConta;
    public String modeloMarca;
    public String estado;
    
    public Seguro (int numeroConta, String modeloMarca, String estado){
        this.numeroConta = numeroConta;
        this.modeloMarca = modeloMarca;
        this.estado = estado;
    }
    
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    
    public void setModeloMarca(String modeloMarca){
        this.modeloMarca = modeloMarca;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public int getNumeroConta(){
        return numeroConta;
    }
    
    public String getModeloMarca(){
        return modeloMarca;
    }
    
    public String getEstado(){
        return estado;
    }
    
    //aqui digo se o estado é elegivel ou não
    //uso o is pq quando o metodo get é um boolean ele começa com is ao inves de get
    //preciso de uma variavel nesse caso, pq não posso trabalhar apenas com o metodo
    public boolean isNoFaultState(){
        
        boolean isNotFaultState;
        
        switch(getEstado()){
        
            case "MA": case "NJ": case "NY": case "PS":
                isNotFaultState = true;
                break;
                
            default:
                isNotFaultState = false;
                break;
                
    }
        
        return isNotFaultState;
        
    }
    
    
    
}
