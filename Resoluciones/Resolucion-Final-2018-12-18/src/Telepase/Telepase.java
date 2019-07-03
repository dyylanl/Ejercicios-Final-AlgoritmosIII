package Telepase;

import Transporte.*;

public interface Telepase {

    public static int PRECIO_POR_RUEDAS = 2;
    public static int RUEDAS_MOTO = 2;
    public static int RUEDAS_AUTO = 4;
    public static int RUEDAS_CAMION = 18;

    public int cobrarPeaje(Transporte transporte, int ruedas);
    public int cobrarPeaje(Camion transporte, int ruedas);
    public int cobrarPeaje(Auto transporte, int ruedas);
    public int cobrarPeaje(Moto transporte, int ruedas);

}
