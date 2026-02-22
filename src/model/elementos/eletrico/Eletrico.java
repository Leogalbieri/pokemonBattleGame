package model.elementos.eletrico;

import java.util.List;
import model.base.Pokemon;

public abstract class Eletrico extends Pokemon {

    private static final List<String> FRAQUEZAS = List.of("Terrestre"); // Fraquezas
    private static final List<String> RESISTENCIAS = List.of("Aço", "Eletrico", "Voador"); // Resistências

    @Override
    public List<String> fraquezas(){
        return FRAQUEZAS;
    }

    @Override
    public List <String> resistencias(){
        return RESISTENCIAS;
    }

    public Eletrico(String nome,int vida,int vidaMax){
        super(nome, "Eletrico",vida,vidaMax);
    }
}