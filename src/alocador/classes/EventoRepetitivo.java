package alocador.classes;

import alocador.enuns.TiposDeEvento;
import java.util.Date;

/**
 *
 * @author dione
 */
public class EventoRepetitivo extends Evento {
    
    private TiposDeEvento tipoDoEvento;
    
    public EventoRepetitivo(){
        super();
    }
    
    @Override
    public void CriarEvento(String nome, String responsavel,Sala sala,Date dataInicial, 
            Date dataFinal, int horarioInicial, int horarioFinal, int minutoInicial, int minutoFinal){
        //antes de utilizar a sala verificar se ela não esta sendo usada 
        //por outro evento nessa mesma data e hora        
        super.CriarEvento(nome, responsavel, sala, dataInicial, dataFinal, horarioInicial, 
                horarioFinal, minutoInicial, minutoFinal);
        this.tipoDoEvento = TiposDeEvento.REPETITIVO;
    }
    
    //verifica disponibilidade do horario, se estiver disponivel a sala o evento podera ser criado
    public void verificaDisponibilidade(){
        
    }
    
    @Override
    public String toString() {
        return super.toString()+ ", tipo do evento: " + tipoDoEvento;
    }
}
