package Cupones;


public class MerryChristmas implements Cupon {

    private static double DESCUENTO_MERRYCHRISTMAS = 0.75;


    @Override
    public double obtenerDescuento() {
        return DESCUENTO_MERRYCHRISTMAS;
    }


}
