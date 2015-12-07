package alocador.classes;

/**
 *
 * @author dione
 */
public class Horario {
    
    private int horarioInicial;
    private int horarioFinal;
    private int minutoInicial;
    private int minutoFinal;
    
    public Horario(){
        horarioInicial = 0;
        horarioFinal = 0;
        minutoInicial = 0;
        minutoFinal = 0;
        
    }
    
    public Horario(int horarioInicial, int horarioFinal,int minutoInicial,int minutoFinal){
        this.horarioInicial = horarioInicial;
        this.horarioFinal = horarioFinal;
        this.minutoInicial = minutoInicial;
        this.minutoFinal = minutoFinal;        
    }

    public int getHorarioInicial() {
        return horarioInicial;
    }

    public void setHorarioInicial(int horarioInicial) {
        this.horarioInicial = horarioInicial;
    }

    public int getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(int horarioFinal) {
        this.horarioFinal = horarioFinal;
    }    

    @Override
    public String toString() {
        return "Das" + horarioInicial+":"+minutoInicial+" ás "+horarioFinal+":"+minutoFinal;
    }
    
    
}
