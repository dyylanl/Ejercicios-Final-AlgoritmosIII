package Envios;

public class EnvioInternacional implements Envio {

    private static double RECARGO_INTERNACIONAL = 1.2;

    @Override
    public double obtenerCostoEnvio() {
        return RECARGO_INTERNACIONAL;
    }


}
