package Transporte;

import Telepase.*;

public class Camion implements Transporte{

    private Telepase telepase;
    public int ruedas = 18;


    public Camion(){

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
