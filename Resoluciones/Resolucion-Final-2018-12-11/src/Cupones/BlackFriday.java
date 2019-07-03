package Cupones;

public class BlackFriday implements Cupon {

    private static double DESCUENTO_BLACKFRIDAY = 0.15;


    @Override
    public double obtenerDescuento() {
        return DESCUENTO_BLACKFRIDAY;
    }


}
