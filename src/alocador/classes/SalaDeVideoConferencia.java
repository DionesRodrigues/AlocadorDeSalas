package alocador.classes;

import alocador.enuns.TiposDeSala;

public class SalaDeVideoConferencia extends Sala {
    private boolean camara = true;
    private boolean microfone = true;
    private TiposDeSala tipo;
    
    //cria objeto sala do tipo Sala de video confencia
    @Override
     public void CriarSala(String identificacao, int capacidade,boolean mesa, boolean quadroBranco,
            boolean dataShow, boolean arCondicionado){
        
        super.CriarSala(identificacao, capacidade, mesa, quadroBranco, dataShow, arCondicionado);
        this.camara = true;
        this.microfone = true;
        this.tipo = TiposDeSala.VIDEO_CONFERENCIA;
    };
    
    public boolean getCamara() {
        return camara;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    public boolean getMicrofone() {
        return microfone;
    }

    public void setMicrofone(boolean microfone) {
        this.microfone = microfone;
    }

    
    
}
