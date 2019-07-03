package Inversion;

import Excepciones.MontoInvalidoException;
import Inversores.Inversionista;
import TipoInversion.TipoInversion;

public class Inversion {

    public TipoInversion tipoInversion;


    public Inversion(TipoInversion tipoInversion){

        this.tipoInversion = tipoInversion;

    }

    public int calcularPlata(int monto, Inversionista inversionista){

        if(monto < 0){ throw new MontoInvalidoException(); }

        return inversionista.calcularPlata(monto,this.tipoInversion);

    }


}
