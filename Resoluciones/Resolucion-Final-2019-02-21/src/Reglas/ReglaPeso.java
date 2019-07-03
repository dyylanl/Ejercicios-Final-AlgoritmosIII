package Reglas;

import Excepciones.PesoInvalidoException;

public class ReglaPeso implements IRegla{


    @Override
    public boolean verificar(String letra, int peso) throws RuntimeException {

        if(peso < 0){

            throw new PesoInvalidoException();

        }
        return true;
    }

}
