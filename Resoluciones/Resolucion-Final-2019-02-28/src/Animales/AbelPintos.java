package Animales;

import Acciones.Cantante;
import Acciones.Corredor;
import Superficies.*;

public class AbelPintos implements Cantante, Corredor {

    private static String canto = "vas a entrar sin pedirme la llave";
    private static int FACTOR_PISTA = 15;
    private static int FACTOR_BARRO = 2;
    private static int FACTOR_HIELO = 0;


    @Override
    public String cantar() {
        return this.canto;
    }

    @Override
    public int correr(Superficie superficie) { return superficie.correr(this);}

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
