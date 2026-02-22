package model.elementos.fogo;

import java.util.List;
import model.base.Pokemon;

public abstract class Fogo extends Pokemon {

    private static final List<String> FRAQUEZAS = List.of("Agua", "Pedra", "Terrestre"); // Fraquezas
    private static final List<String> RESISTENCIAS = List.of("Aço", "Fada", "Gelo", "Fogo", "Inseto", "Planta"); // Resistências

    @Override
    public List<String> fraquezas(){
        return FRAQUEZAS;
    }

    @Override
    public List <String> resistencias(){
        return RESISTENCIAS;
    }

    public Fogo(String nome,int vida,int vidaMax){
        super(nome, "Fogo",vida,vidaMax);
    }
}