package Reglas;

import Excepciones.LargoInvalidoException;

public class ReglaLargo implements IRegla {


    private static int LARGO_PERMITIDO = 1;

    @Override
    public boolean verificar(String letra, int peso) throws RuntimeException {

        if(letra.length() > LARGO_PERMITIDO){

            throw new LargoInvalidoException();

        }
        return true;

    }

}
