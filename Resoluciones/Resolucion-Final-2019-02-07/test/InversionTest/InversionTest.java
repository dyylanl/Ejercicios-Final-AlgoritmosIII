package InversionTest;

import Excepciones.MontoInvalidoException;
import Inversion.Inversion;
import Inversores.InversorAgresivo;
import Inversores.InversorArriesgado;
import Inversores.InversorConservador;
import TipoInversion.Bitcoin;
import TipoInversion.Lebac;
import TipoInversion.PlazoFijo;
import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Test;

public class InversionTest {

    @Test
    public void inversionEnLebacPorUnConservador(){

        Lebac lebac = new Lebac();
        InversorConservador conservador = new InversorConservador();
        Inversion inversion = new Inversion(lebac);

        Assert.assertEquals(100, inversion.calcularPlata(100, conservador));

    }

    @Test
    public void inversionEnPlazoFijoPorUnConservador(){

        PlazoFijo plazoFijo = new PlazoFijo();
        InversorConservador conservador = new InversorConservador();
        Inversion inversion = new Inversion(plazoFijo);

        Assert.assertEquals(200,inversion.calcularPlata(100,conservador));

    }

    @Test
    public void inversionEnLebacPorUnArriesgado(){

        Lebac lebac = new Lebac();
        Inversion inversion = new Inversion(lebac);
        InversorArriesgado arriesgado = new InversorArriesgado();

        Assert.assertEquals(300,inversion.calcularPlata(100,arriesgado));

    }

    @Test
    public void inversionEnPlazoFijoPorUnArriesgado(){

        PlazoFijo plazoFijo = new PlazoFijo();
        Inversion inversion = new Inversion(plazoFijo);
        InversorArriesgado arriesgado = new InversorArriesgado();

        Assert.assertEquals(200,inversion.calcularPlata(100,arriesgado));

    }

    @Test
    public void inversionEnBitcoinPorUnAgresivo(){

        Bitcoin bitcoin = new Bitcoin();
        Inversion inversion = new Inversion(bitcoin);
        InversorAgresivo agresivo = new InversorAgresivo();

        Assert.assertEquals(400,inversion.calcularPlata(100,agresivo));

    }


}
