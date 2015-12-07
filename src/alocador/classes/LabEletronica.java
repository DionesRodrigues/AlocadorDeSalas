package alocador.classes;

import alocador.enuns.TiposDeSala;

public class LabEletronica extends Sala{
    private boolean impressoraCircuitos = true;
    private int quatImpressorasCircuitos = 0;
    private TiposDeSala tipo;

     public void CriarSala(String identificacao, int capacidade,boolean mesa, boolean quadroBranco,
        boolean dataShow, boolean arCondicionado,int quatImpressorasCircuitos){
        
        super.CriarSala(identificacao, capacidade, mesa, quadroBranco, dataShow, arCondicionado);
        impressoraCircuitos = true;
        this.quatImpressorasCircuitos = quatImpressorasCircuitos;
        this.tipo = TiposDeSala.LAB_ELETRONICA;
    };
    
    public boolean getImpressoraCircuitos() {
        return impressoraCircuitos;
    }

    public void setImpressoraCircuitos(boolean impressoraCircuitos) {
        this.impressoraCircuitos = impressoraCircuitos;
    }

    public int getQuatImpressorasCircuitos() {
        return quatImpressorasCircuitos;
    }

    public void setQuatImpressorasCircuitos(int quatImpressorasCircuitos) {
        this.quatImpressorasCircuitos = quatImpressorasCircuitos;
    }
}
