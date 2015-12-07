
package alocador.classes;

import alocador.enuns.TiposDeEvento;
import java.util.Date;


public class EventoUnico extends Evento {
    
    private TiposDeEvento tipoDoEvento;
    
    public EventoUnico(){
        super();
    }
    
    /**
     *
     * @param nome
     * @param responsavel
     * @param sala
     * @param dataInicial
     * @param dataFinal
     * @param horarioInicial
     * @param horarioFinal
     * @param minutoInicial
     * @param minutoFinal
     */
    @Override
    public void CriarEvento(String nome, String responsavel,Sala sala,Date dataInicial, 
        Date dataFinal, int horarioInicial, int horarioFinal, int minutoInicial, int minutoFinal){
        super.CriarEvento(nome, responsavel, sala, dataInicial, dataFinal, horarioInicial, horarioFinal, minutoInicial, minutoFinal);
        this.tipoDoEvento = TiposDeEvento.UNICO;
    }

    @Override
    public String toString() {
        return super.toString()+ ", tipo do evento: " + tipoDoEvento;
    }
    
    
}
