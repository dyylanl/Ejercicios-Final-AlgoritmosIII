package Envios;

public class EnvioLocal implements Envio {


    private static double RECARGO_LOCAL = 1.1;


    @Override
    public double obtenerCostoEnvio() {
        return RECARGO_LOCAL;
    }
}
