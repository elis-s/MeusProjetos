/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package perfilsaude;

/*Neste exercício, você projetará uma classe HealthProfile “inicial” para uma
pessoa. Os atributos da classe devem incluir nome, sobrenome, sexo, data de nascimento (consistindo em atributos separados para mês, dia
e ano de nascimento), altura (em metros) e peso (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba esses dados.
Para cada atributo, forneça métodos set e get. A classe também deve incluir métodos que calculem e retornem a idade do usuário em anos,
intervalo de frequência cardíaca máxima e frequência cardíaca alvo (veja o Exercício 3.16), além de índice de massa corporal (IMC; veja
o Exercício 2.33). Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HealthProfile para
ela e imprima as informações a partir desse objeto — incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––, e
então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo. Ele também deve exibir
o gráfico de valores IMC do Exercício 2.33.

 */
public class PerfilSaude {

    public String nome;
    public String sobrenome;
    public String sexo;
    public int nascDia;
    public int nascMes;
    public int nascAno;
    public int altura;
    public int kg;
    
    public PerfilSaude(String nome, String sobrenome, String sexo, int nascDia, int nascMes, int nascAno, int altura, int kg){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.nascDia = nascDia;
        this.nascMes = nascMes;
        this.nascAno = nascAno;
        this.altura = altura;
        this.kg = kg;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public void setNascDia(int nascDia){
        this.nascDia = nascDia;
    }
    
    public void setNascMes(int nascMes){
        this.nascMes = nascMes;
    }
    
    public void setNascAno(int nascAno){
        this.nascAno = nascAno;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public void setKg(int kg){
        this.kg = kg;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public int getNascDia(){
        return nascDia;
    }
    
    public int getNascMes(){
        return nascMes;
    }
    
    public int getNascAno(){
        return nascAno;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public int getKg(){
        return kg;
    }
    
    public int idade(){
        return 2025 - nascAno;
    }
    
    public int fcMax(){
        return 220 - idade();
    }
    
    public String mostrarDados1(){
        return "Nome: " + getNome() + " Sobrenome: " + getSobrenome() + " Sexo: " + getSexo();
    }
    
    public String mostrarDados2(){
        return "Nascimento: " + getNascDia() + " / " + getNascMes() + " / " + getNascAno();
    }
    
    public String mostrarDdados3(){
        return "Altura: " + getAltura() + " Kg: " + getKg() + " Idade: " + idade() + " FC: " + fcMax();
    }
    
    
}
