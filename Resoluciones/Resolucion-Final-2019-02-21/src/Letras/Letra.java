package Letras;

import Reglas.IRegla;

import java.util.List;

public abstract class Letra {

    private int peso;
    private String letra;

    public Letra(String letra, int peso, List<IRegla> reglas){

        for(IRegla regla : reglas){

            regla.verificar(letra,peso);

        }
        this.peso = peso;
        this.letra = letra;

    }


    public int getPeso(){

        return this.peso;

    }

}
