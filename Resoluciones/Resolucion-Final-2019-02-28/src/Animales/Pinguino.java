package Animales;

import Acciones.Corredor;
import Acciones.Nadador;
import Superficies.Barro;
import Superficies.Hielo;
import Superficies.Pista;
import Superficies.Superficie;

public class Pinguino implements Corredor, Nadador {


    private static int FACTOR_HIELO = 5;
    private static int FACTOR_NADO = 20;

    @Override
    public int correr(Superficie superficie) {
        return superficie.correr(this);
    }

    @Override
    public int correr(Pista superficie) {
        return 0;
    }

    @Override
    public int correr(Barro superficie) {
        return 0;
    }

    @Override
    public int correr(Hielo superficie) {
        return FACTOR_HIELO;
    }

    @Override
    public int nadar() {
        return FACTOR_NADO;
    }


}
