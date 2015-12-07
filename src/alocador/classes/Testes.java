package alocador.classes;

import alocador.enuns.TiposDeSala;
import java.util.Calendar;
import java.util.Date;

public class Testes {
    
    public static void main(String args[]){
        Sala salas[] = new Sala[4];
        Evento eventos[] = new Evento[4];
        
        salas[0] = new SalaNormal();
        salas[1] = new SalaNormal();
        salas[2] = new SalaNormal();
        salas[3] = new SalaNormal();
        
        //criando data inicial e final do evento repetitivo
        Calendar dataI = Calendar.getInstance(); //data inicial
        dataI.set(2015, 12, 10);
        Calendar dataF = Calendar.getInstance(); //data final
        dataI.set(2016, 1, 30);
        Date data1 = new Date();
        Date data2 = new Date();
        data1 = dataI.getTime();
        data2 = dataF.getTime();
        
        salas[0].CriarSala("CAD110", 50, true, true,true,true);
        salas[1].CriarSala("LAB21", 50,true, true,true,true);
        salas[2].CriarSala("CAD111", 60, true, true, true, true);
        salas[3].CriarSala("CAD112", 70, true, true, true, true);
        
        eventos[0] = new EventoRepetitivo();
        eventos[0].CriarEvento("Portugues I", "Diones Dutra", salas[0], data1, data2, 8, 10,0,0);
        eventos[1] = new EventoUnico();
        eventos[1].CriarEvento("Cálculo I", "Diones Dutra", salas[1], data1, data1, 8, 10,0,30);
        
        System.out.println("-------------Salas Cadastrados---------------------");
        System.out.println(salas[0].toString());
        System.out.println(salas[1].toString());
        System.out.println(salas[2].toString());
        System.out.println(salas[3].toString());
        System.out.println("-------------Eventos Cadastrados---------------------");
        System.out.println(eventos[0].toString());
        System.out.println(eventos[1].toString());

    }
}
