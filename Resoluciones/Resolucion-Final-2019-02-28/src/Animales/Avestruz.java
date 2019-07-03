package Animales;

import Acciones.Corredor;
import Superficies.Barro;
import Superficies.Hielo;
import Superficies.Pista;
import Superficies.Superficie;

public class Avestruz implements Corredor {

    private static int FACTOR_PISTA = 70;
    private static int FACTOR_BARRO = 70;
    private static int FACTOR_HIELO = 0;

    @Override
    public int correr(Superficie superficie) {
        return superficie.correr(this);
    }

    @Override
    public int correr(Pista superficie) {
        return FACTOR_PISTA;
    }

    @Override
    public int correr(Barro superficie) {
        return FACTOR_BARRO;
    }

    @Override
    public int correr(Hielo superficie) {
        return FACTOR_HIELO;
    }


}
