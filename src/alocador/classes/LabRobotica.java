
package alocador.classes;

import alocador.enuns.TiposDeSala;

public class LabRobotica extends Sala {
    private boolean robos = true;
    private int quantRobos = 0;

     public void CriarSala(String id, int cap,boolean m, boolean qb,boolean dt, boolean ar,TiposDeSala tipo, boolean temRobo, int quantRobos){
        robos = temRobo;
        this.quantRobos = quantRobos;
    };
    
    public boolean getRobos() {
        return robos;
    }

    public void setRobos(boolean robos) {
        this.robos = robos;
    }

    public int getQuantRobos() {
        return quantRobos;
    }

    public void setQuantRobos(int quantRobos) {
        this.quantRobos = quantRobos;
    }
    
    
}
