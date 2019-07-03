package Acciones;

import Superficies.*;

public interface Corredor {

    public int correr(Superficie superficie);
    public int correr(Pista superficie);
    public int correr(Barro superficie);
    public int correr(Hielo superficie);

}
