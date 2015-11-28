package alocador.classes;

import alocador.enuns.TiposDeSala;

public class LabComputacao extends Sala {
    private int quantComputadores = 0;
    private boolean temComputadores = true;

     public void CriarSala(String id, int cap,boolean m, boolean qb,boolean dt, boolean ar,TiposDeSala tipo,int quantPc){
        super.CriarSala(id, cap, m, qb, dt, ar, tipo);
        quantComputadores = quantPc;
        temComputadores = true;
    };
    
    public int getQuantComputadores() {
        return quantComputadores;
    }

    public void setQuantComputadores(int quantComputadores) {
        this.quantComputadores = quantComputadores;
    }

    public boolean getTemComputadores() {
        return temComputadores;
    }

    public void setTemComputadores(boolean temComputadores) {
        this.temComputadores = temComputadores;
    }
}
