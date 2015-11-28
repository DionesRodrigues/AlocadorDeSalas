package alocador.classes;

import alocador.enuns.TiposDeSala;

public class SalaDeVideoConferencia extends Sala {
    private boolean camara = true;
    private boolean microfone = true;
    
    //cria objeto sala do tipo Sala de video confencia
     public void CriarSala(String id, int cap,boolean m, boolean qb,boolean dt, boolean ar,TiposDeSala tipo,boolean cam, boolean mic){
        super.CriarSala(id, cap, m, qb, dt, ar, tipo);
        camara = cam;
        microfone = mic;
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
