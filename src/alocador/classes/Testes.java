package alocador.classes;

import alocador.enuns.TiposDeSala;

public class Testes {
    
    public static void main(String args[]){
        Sala salas[] = new Sala[11];
        
        salas[0] = new SalaNormal();
        salas[1] = new SalaNormal();
        salas[2] = new SalaNormal();
        salas[3] = new LabEletronica();
        salas[4] = new LabEletronica();
        salas[5] = new LabComputacao();
        salas[6] = new LabComputacao();
        salas[7] = new LabRobotica();
        salas[8] = new LabRobotica();
        salas[9] = new SalaDeVideoConferencia();
        salas[10] = new SalaDeVideoConferencia();
        
        
        salas[0].CriarSala("CAD110", 50, true, true, false, true,TiposDeSala.NORMAL);
        salas[1].CriarSala("LAB21", 50,true, true, true, true,TiposDeSala.NORMAL);
        salas[2].CriarSala("LAB22", 50,true, true, true, true,TiposDeSala.NORMAL);
        salas[3].CriarSala("LAB23", 30,true, true, true, true,TiposDeSala.LAB_ELETRONICA);
        salas[4].CriarSala("LAB24", 30,true, true, true, true,TiposDeSala.LAB_ELETRONICA);
        salas[5].CriarSala("LAB25", 30,true, true, true, true,TiposDeSala.LAB_COMPUTACAO);
        salas[6].CriarSala("LAB26", 30,true, true, true, true,TiposDeSala.LAB_COMPUTACAO);
        salas[7].CriarSala("LAB27", 30,true, true, true, true,TiposDeSala.LAB_ROBOTICA);
        salas[8].CriarSala("LAB28", 30,true, true, true, true,TiposDeSala.LAB_ROBOTICA);
        salas[9].CriarSala("LAB30", 30,true, true, true, true,TiposDeSala.VIDEO_CONFERENCIA); 
        salas[10].CriarSala("LAB30", 30,true, true, true, true,TiposDeSala.VIDEO_CONFERENCIA); 
        
        System.out.println(salas[0].toString());
        System.out.println(salas[1].toString());
        System.out.println(salas[2].toString());
        System.out.println(salas[3].toString());
        System.out.println(salas[4].toString());
        System.out.println(salas[5].toString());
        System.out.println(salas[6].toString());
        System.out.println(salas[7].toString());
        System.out.println(salas[8].toString());
        System.out.println(salas[9].toString());
        System.out.println(salas[10].toString());
        
        System.out.println("----------------------------------");
        
        //retorna tempo decorrido em milisegundos a partir de 1970
       System.currentTimeMillis();
        
    }
    
}
