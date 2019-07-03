package TipoInversion;

import Excepciones.InversionInvalidaException;
import Inversores.Inversionista;
import Inversores.InversorAgresivo;
import Inversores.InversorArriesgado;
import Inversores.InversorConservador;

public class Bitcoin implements TipoInversion {

    private static int FACTOR_INVERSION_BITCOIN = 4;

    @Override
    public int obtenerInversion(Inversionista inversionista, int monto) {
        throw new InversionInvalidaException();
    }

    @Override
    public int obtenerInversion(InversorArriesgado inversionista, int monto) {
        throw new InversionInvalidaException();
    }

    @Override
    public int obtenerInversion(InversorConservador inversionista, int monto) {
        throw new InversionInvalidaException();
    }

    public int obtenerInversion(InversorAgresivo inversionista, int monto){

        return FACTOR_INVERSION_BITCOIN*monto;

    }

}
