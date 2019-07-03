package Superficies;

import Acciones.Corredor;

public class Pista implements Superficie{

    @Override
    public int correr(Corredor corredor) {
        return corredor.correr(this);
    }
}
