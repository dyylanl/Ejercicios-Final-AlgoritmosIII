package TipoInversion;

import Inversores.Inversionista;
import Inversores.InversorAgresivo;
import Inversores.InversorArriesgado;
import Inversores.InversorConservador;

public interface TipoInversion {


    public int obtenerInversion(Inversionista inversionista,int monto);
    public int obtenerInversion(InversorArriesgado inversionista,int monto);
    public int obtenerInversion(InversorConservador inversionista, int monto);
    public int obtenerInversion(InversorAgresivo inversionista, int monto);


}
