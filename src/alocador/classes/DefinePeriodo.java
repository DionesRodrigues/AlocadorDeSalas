package alocador.classes;

import java.util.Date;

public class DefinePeriodo {
    protected Date dataInicial;
    protected Date dataFinal;
    
    public DefinePeriodo(){
        dataInicial = null;
        dataFinal = null;
    }
    
    public DefinePeriodo(Date dataInicial, Date dataFinal){
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }
    
    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    @Override
    public String toString() {
        return "Periodo do evento-> Data: " + dataInicial;
    }
  
}

