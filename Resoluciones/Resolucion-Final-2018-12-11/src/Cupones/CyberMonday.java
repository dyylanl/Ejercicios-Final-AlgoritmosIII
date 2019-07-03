package Cupones;

public class CyberMonday implements Cupon {

    private static double DESCUENTO_CYBERMONDAY =  0.5;


    @Override
    public double obtenerDescuento() {
        return DESCUENTO_CYBERMONDAY;
    }


}
