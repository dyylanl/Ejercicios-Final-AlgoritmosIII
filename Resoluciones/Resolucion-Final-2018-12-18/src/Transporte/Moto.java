package Transporte;

import Excepciones.RegistroInvalidoDeTelepaseException;
import Telepase.SinTelepase;
import Telepase.Telepase;

public class Moto implements Transporte {


    private Telepase telepase;
    public int ruedas = 2;

    public Moto(){
        this.telepase = new SinTelepase();
    }

    @Override
    public int cobrarPeaje() {
        return this.telepase.cobrarPeaje(this,this.ruedas);
    }

    @Override
    public void registrarTelepase() {
        throw new RegistroInvalidoDeTelepaseException();
    }
}
