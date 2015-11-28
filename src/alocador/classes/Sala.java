package alocador.classes;

import alocador.enuns.TiposDeSala;

public class Sala {
    protected String identificacao = "";
    protected int capacidade = 0;
    protected boolean mesa = true;
    protected boolean quadroBranco = true;
    protected boolean dataShow = true;
    protected boolean arCondicionado = true;
    protected TiposDeSala tipo;
    
    public Sala(){
        identificacao = "vazio";
        capacidade = 0;
        mesa = false;
        quadroBranco = false;
        dataShow = false;
        arCondicionado = false;
        tipo = TiposDeSala.NORMAL;
    };
    
    public void CriarSala(String id, int cap,boolean m, boolean qb,boolean dt, boolean ar,TiposDeSala tipo){
        identificacao = id;
        capacidade = cap;
        mesa = m;
        quadroBranco = qb;
        dataShow = dt;
        arCondicionado = ar;
        this.tipo = tipo;
    };

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isMesa() {
        return mesa;
    }

    public void setMesa(boolean mesa) {
        this.mesa = mesa;
    }

    public boolean isQuadroBranco() {
        return quadroBranco;
    }

    public void setQuadroBranco(boolean quadroBranco) {
        this.quadroBranco = quadroBranco;
    }

    public boolean isDataShow() {
        return dataShow;
    }

    public void setDataShow(boolean dataShow) {
        this.dataShow = dataShow;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public String toString() {
        return "Detalhes da sala: " + "identificacao = " + identificacao + ", capacidade = " + capacidade + ", mesa = " + mesa + ", quadroBranco = " + quadroBranco + ", dataShow = " + dataShow + ", arCondicionado = " + arCondicionado + ", tipo "+ tipo;
    }
    
    
}
