package model.elementos.pedra;

import java.util.List;
import model.base.Pokemon;

public abstract class Pedra extends Pokemon {

    private static final List<String> FRAQUEZAS = List.of("Aço", "Agua", "Lutador", "Planta", "Terrestre"); // Fraquezas
    private static final List<String> RESISTENCIAS = List.of("Fogo", "Normal", "Venenoso", "Voador"); // Resistências

    @Override
    public List<String> fraquezas(){
        return FRAQUEZAS;
    }

    @Override
    public List <String> resistencias(){
        return RESISTENCIAS;
    }

    public Pedra(String nome,int vida,int vidaMax){
        super(nome, "Pedra",vida,vidaMax);
    }
}