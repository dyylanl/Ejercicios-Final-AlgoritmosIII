package Celdas;

import Estados.Estado;
import Estados.Disponible;
import Letras.Letra;

public class Celda {


    private Estado estado;
    private Letra letra;


    public Celda(Letra letra){

        this.estado = new Disponible();
        this.letra = letra;

    }

    public int getPeso(){

        return this.letra.getPeso();

    }

    public void setEstado(Estado estado){

        this.estado = estado;

    }


}
