
package alocador.classes;

import java.util.Date;

public class Evento {
    protected String nome;//ok
    protected String responsavel;//ok
    protected Horario horarioDoEvento;//ok
    protected DefinePeriodo definePeriodo;//ok
    protected Sala salaUtilizada;//ok, mas dando erro
    
    public void CriarEvento(String nome, String responsavel,Sala sala,Date dataInicial, Date dataFinal, int horarioInicial, int horarioFinal, int minutoInicial, int minutoFinal){
        //antes de utilizar a sala verificar se ela não esta sendo usada por outro evento nessa mesma data e hora
        salaUtilizada = sala;//ok
        
        definePeriodo = new DefinePeriodo(dataInicial, dataFinal);//ok
        horarioDoEvento = new Horario(horarioInicial, horarioFinal, minutoInicial, minutoFinal);//ok
        this.nome = nome;//ok
        this.responsavel = responsavel;//ok
    }
   
    
    public String getNome(){
        return nome;
    }
    public String getResponsavel(){
        return responsavel;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setResponsavel(String responsavel){
        this.responsavel = responsavel;
    }
    
    public Evento(){
        nome = "sem nome";
        responsavel = "sem nome";
        salaUtilizada = null;
        definePeriodo = null;
        salaUtilizada = null;
    }

    @Override
    public String toString() {
        return "Nome do evento:" + nome + ", responsável pelo evento: " + responsavel 
                + ", horário: " + horarioDoEvento.toString() + ", periodo: " + definePeriodo.toString()
                + ", sala utilizada: " + salaUtilizada.getIdentificacao();
    }
    
    
    
}
