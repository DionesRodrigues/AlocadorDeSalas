
package alocador.classes;

public class Evento {
    protected int horarioInicial;
    protected int horarioFinal;
    protected String nome;
    protected String responsavel;
    protected Sala salaUtilizada;
    protected Semestre semestre;
    
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
}
