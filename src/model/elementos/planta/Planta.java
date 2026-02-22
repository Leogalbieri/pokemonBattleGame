package model.elementos.planta;

import java.util.List;
import model.base.Pokemon;

public abstract class Planta extends Pokemon {

    private static final List<String> FRAQUEZAS = List.of("Fogo", "Gelo", "Inseto", "Venenoso", "Voador"); // Fraquezas
    private static final List<String> RESISTENCIAS = List.of("Agua", "Eletrico", "Terrestre", "Planta"); // Resistências

    @Override
    public List<String> fraquezas(){
        return FRAQUEZAS;
    }

    @Override
    public List <String> resistencias(){
        return RESISTENCIAS;
    }

    public Planta(String nome,int vida,int vidaMax){
        super(nome, "Planta",vida,vidaMax);
    }
}