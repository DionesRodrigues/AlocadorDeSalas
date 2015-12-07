package alocador.classes;

import alocador.enuns.TiposDeSala;

public class LabComputacao extends Sala {
    private int quantComputadores = 0;
    private boolean temComputadores = true;
    private TiposDeSala tipo;

     public void CriarSala(String identificacao, int capacidade,boolean mesa, boolean quadroBranco,
        boolean dataShow, boolean arCondicionado,int quantPc){
        super.CriarSala(identificacao, capacidade, mesa, quadroBranco, dataShow, arCondicionado);
        quantComputadores = quantPc;
        temComputadores = true;
        this.tipo = TiposDeSala.LAB_COMPUTACAO;
    };
    
    public int getQuantComputadores() {
        return quantComputadores;
    }

    public void setQuantComputadores(int quantComputadores) {
        this.quantComputadores = quantComputadores;
    }
}
