package Telepase;


import Excepciones.CobroInvalidoPeajeException;
import Transporte.*;

public class ConTelepase implements Telepase {


    @Override
    public int cobrarPeaje(Transporte transporte, int ruedas) { return transporte.cobrarPeaje(); }

    @Override
    public int cobrarPeaje(Auto transporte, int ruedas) { return (PRECIO_POR_RUEDAS*ruedas)/2; }

    @Override
    public int cobrarPeaje(Moto transporte, int ruedas) {
        throw new CobroInvalidoPeajeException();
    }

    @Override
    public int cobrarPeaje(Camion transporte, int ruedas) { return (PRECIO_POR_RUEDAS*ruedas)/4; }

}
