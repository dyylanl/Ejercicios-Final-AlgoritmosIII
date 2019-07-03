package PeajeTest;

import Peaje.Peaje;
import Transporte.*;
import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;

public class PeajeTest {


    @Test
    public void autoPagaPeajeSinTelepase(){

        Peaje peaje = new Peaje();
        Auto auto = new Auto();

        Assert.assertEquals(8, peaje.cobrarPeaje(auto));

    }

    @Test
    public void autoPagaPeajeConTelepase(){

        Peaje peaje = new Peaje();
        Auto auto = new Auto();
        auto.registrarTelepase();

        Assert.assertEquals(4,peaje.cobrarPeaje(auto));

    }

    @Test
    public void camionPagaPeajeSinTelepase(){

        Peaje peaje = new Peaje();
        Camion camion = new Camion();

        Assert.assertEquals(36,peaje.cobrarPeaje(camion));

    }

    @Test
    public void camionPagaPeajeConTelepase(){

        Peaje peaje = new Peaje();
        Camion camion = new Camion();
        camion.registrarTelepase();

        Assert.assertEquals(9,peaje.cobrarPeaje(camion));

    }

    @Test
    public void motoPagaPeaje(){

        Peaje peaje = new Peaje();
        Moto moto = new Moto();
        Assert.assertEquals(4,peaje.cobrarPeaje(moto));

    }
}
