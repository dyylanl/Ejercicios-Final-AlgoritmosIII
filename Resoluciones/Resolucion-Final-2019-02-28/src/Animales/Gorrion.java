package Animales;

import Acciones.Cantante;
import Acciones.Volador;


public class Gorrion implements Volador, Cantante {


    private static String canto = "pio pio";
    private static int FACTOR_VUELO = 50;

    @Override
    public String cantar() {
        return this.canto;
    }

    @Override
    public int volar() {
        return this.FACTOR_VUELO;
    }


}
