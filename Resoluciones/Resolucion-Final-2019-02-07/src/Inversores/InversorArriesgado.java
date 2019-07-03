package Inversores;

import TipoInversion.TipoInversion;

public class InversorArriesgado implements Inversionista {


    @Override
    public int calcularPlata(int monto, TipoInversion tipoInversion) {

        return tipoInversion.obtenerInversion(this,monto);

    }

}
