package Transporte;

import Telepase.*;

public class Auto implements Transporte{

    private Telepase telepase;
    public int ruedas = 4;

    public Auto(){
        this.telepase = new SinTelepase();
    }

    @Override
    public int cobrarPeaje() {
        return this.telepase.cobrarPeaje(this,this.ruedas);
    }

    @Override
    public void registrarTelepase() {
        this.telepase = new ConTelepase();
    }
}
