package model.elementos.normal;

import java.util.List;
import model.base.Pokemon;

public abstract class Normal extends Pokemon {

    private static final List<String> FRAQUEZAS = List.of("Lutador"); // Fraquezas
    private static final List<String> RESISTENCIAS = List.of("Fantasma"); // Resistências

    @Override
    public List<String> fraquezas(){
        return FRAQUEZAS;
    }

    @Override
    public List <String> resistencias(){
        return RESISTENCIAS;
    }

    public Normal(String nome,int vida,int vidaMax){
        super(nome, "Normal",vida,vidaMax);
    }
}