package TipoInversion;

import Excepciones.InversionInvalidaException;
import Inversores.Inversionista;
import Inversores.InversorAgresivo;
import Inversores.InversorArriesgado;
import Inversores.InversorConservador;

public class Lebac implements TipoInversion {


    private static int FACTOR_INVERSION_ARRIESGADO = 3;
    private static int FACTOR_INVERSION_CONSERVADOR = 1;

    @Override
    public int obtenerInversion(Inversionista inversionista, int monto) {
        return 0; //inversionista.calcularPlata();
    }

    @Override
    public int obtenerInversion(InversorArriesgado inversionista, int monto) {
        return FACTOR_INVERSION_ARRIESGADO*monto;
    }

    @Override
    public int obtenerInversion(InversorConservador inversionista, int monto) {
        return FACTOR_INVERSION_CONSERVADOR*monto;
    }

    @Override
    public int obtenerInversion(InversorAgresivo inversionista, int monto) { throw new InversionInvalidaException(); }

}
