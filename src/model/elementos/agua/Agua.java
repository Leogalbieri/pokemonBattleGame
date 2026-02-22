package model.elementos.agua;

import java.util.List;
import model.base.Pokemon;

public abstract class Agua extends Pokemon {

    private static final List<String> FRAQUEZAS = List.of("Planta", "Eletrico");
    private static final List<String> RESISTENCIAS = List.of("Aço", "Agua", "Fogo", "Gelo");

    @Override
    public List<String> fraquezas(){
        return FRAQUEZAS;
    }

    @Override
    public List <String> resistencias(){
        return RESISTENCIAS;
    }

    public Agua(String nome,int vida,int vidaMax){
        super(nome, "Agua",vida,vidaMax);
    }
}