package Telepase;

import Transporte.*;

public class SinTelepase implements Telepase {


    @Override
    public int cobrarPeaje(Transporte transporte, int ruedas) {
        return transporte.cobrarPeaje();
    }

    @Override
    public int cobrarPeaje(Auto transporte, int ruedas) {
        return PRECIO_POR_RUEDAS*ruedas;
    }

    @Override
    public int cobrarPeaje(Camion transporte, int ruedas) {
        return PRECIO_POR_RUEDAS*ruedas;
    }

    @Override
    public int cobrarPeaje(Moto transporte, int ruedas){ return PRECIO_POR_RUEDAS*ruedas; }

}
