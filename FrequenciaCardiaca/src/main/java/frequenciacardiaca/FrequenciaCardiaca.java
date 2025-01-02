/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package frequenciacardiaca;

/*Ao fazer exercícios físicos, você pode utilizar um monitor de frequência cardíaca para ver
se sua frequência permanece dentro de um intervalo seguro sugerido pelos seus treinadores e médicos. 
Segundo a American Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), 
a fórmula para calcular a frequência cardíaca
máxima por minuto é 220 menos a idade em anos. Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca
máxima. [Observação: essas fórmulas são estimativas fornecidas pela AHA. As frequências cardíacas máximas e alvo podem variar com
base na saúde, capacidade física e sexo da pessoa. Sempre consulte um médico ou profissional de saúde qualificado antes de começar
ou modificar um programa de exercícios físicos.] Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome,
sobrenome e data de nascimento da pessoa (consistindo em atributos separados para mês, dia e ano de nascimento). Sua classe deve ter um
construtor que receba esses dados como parâmetros. Para cada atributo forneça métodos set e get. A classe também deve incluir um método
que calcule e retorne a idade (em anos), um que calcule e retorne a frequência cardíaca máxima. Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HeartRates e
imprima as informações a partir desse objeto — incluindo nome, sobrenome e data de nascimento da pessoa — calcule e imprima a idade
da pessoa (em anos), seu intervalo de frequência cardíaca máxima.
 */
public class FrequenciaCardiaca {

    public String nome;
    public String sobrenome;
    public int dataDia;
    public int dataMes;
    public int dataAno;
    
    public FrequenciaCardiaca(String nome, String sobrenome, int dataDia, int dataMes, int dataAno){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDia = dataDia;
        this.dataMes = dataMes;
        this.dataAno = dataAno;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setDataDia(int dataDia){
        this.dataDia = dataDia;
    }
    
    public void setDataMes(int dataMes){
        this.dataMes = dataMes;
    }
    
    public void setDataAno(int dataAno){
        this.dataAno = dataAno;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public int getDataDia(){
        return dataDia;
    }
    
    public int getDataMes(){
        return dataMes;
    }
    
    public int getDataAno(){
        return dataAno;
    }
    
    public int idade(){
        return 2025 - dataAno;
    }
    
    public int fcMax(){
        return 220 - idade();
    }
    
    public String mostrarDados1(){
        return "DADOS: " + getNome() + " " +  getSobrenome();
        
    }
    
    public String mostrarDados2(){
        return "DADOS: " + getDataDia() + " / " +  getDataMes() + " / " + getDataAno();
    }
    
    public String mostrarDados3(){
        return "IDADE: " + idade() + " FREQUENCIA CARDIACA: " + fcMax();
    }
    
    
    
    
}
