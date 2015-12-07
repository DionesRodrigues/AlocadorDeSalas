
package alocador.classes;

import alocador.enuns.TiposDeSala;

public class LabRobotica extends Sala {
    private boolean robos = true;
    private int quantRobos = 0;
    private TiposDeSala tipo;

     public void CriarSala(String identificacao, int capacidade,boolean mesa, boolean quadroBranco,
        boolean dataShow, boolean arCondicionado,int quantRobos){
        super.CriarSala(identificacao, capacidade, mesa, quadroBranco, dataShow, arCondicionado);
        robos = true;
        this.quantRobos = quantRobos;
        this.tipo = TiposDeSala.LAB_ROBOTICA;
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
