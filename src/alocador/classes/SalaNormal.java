package alocador.classes;

import alocador.enuns.TiposDeSala;

public class SalaNormal extends Sala {
        private TiposDeSala tipo;
    
    /**
     *
     * @param identificacao
     * @param capacidade
     * @param mesa
     * @param quadroBranco
     * @param dataShow
     * @param arCondicionado
     */
    @Override
    public void CriarSala(String identificacao, int capacidade,boolean mesa, boolean quadroBranco,
        boolean dataShow, boolean arCondicionado){
        super.CriarSala(identificacao, capacidade, mesa, quadroBranco, dataShow, arCondicionado);
        this.tipo = TiposDeSala.NORMAL; //pode dar erro aqui, eu acho
    };
}
