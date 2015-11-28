package alocador.classes;

import alocador.enuns.TiposDeSala;

public class LabEletronica extends Sala{
    private boolean impressoraCircuitos = true;
    private int quatImpressorasCircuitos = 0;

     public void CriarSala(String id, int cap,boolean m, boolean qb,boolean dt, boolean ar,TiposDeSala tipo,boolean imp,int quantImpre){
        super.CriarSala(id, cap, m, qb, dt, ar, tipo);
        impressoraCircuitos = imp;
        quatImpressorasCircuitos = quantImpre;
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
