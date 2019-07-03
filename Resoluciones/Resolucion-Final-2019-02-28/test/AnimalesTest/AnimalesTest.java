package AnimalesTest;

import Animales.Avestruz;
import Superficies.Pista;
import org.junit.Assert;
import org.junit.Test;

public class AnimalesTest {

    @Test
    public void avestruzCorreEnPista(){

        Avestruz avestruz = new Avestruz();
        Pista pista = new Pista();
        Assert.assertEquals(70,avestruz.correr(pista));

    }

}
