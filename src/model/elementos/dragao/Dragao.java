package model.elementos.dragao;

import java.util.List;
import model.base.Pokemon;

public abstract class Dragao extends Pokemon {

    private static final List<String> FRAQUEZAS = List.of("Gelo", "Dragao", "Fada"); // Fraquezas
    private static final List<String> RESISTENCIAS = List.of("Agua", "Eletrico", "Fogo", "Planta"); // Resistências

    @Override
    public List<String> fraquezas(){
        return FRAQUEZAS;
    }

    @Override
    public List <String> resistencias(){
        return RESISTENCIAS;
    }

    public Dragao(String nome,int vida,int vidaMax){
        super(nome, "Dragao",vida,vidaMax);
    }
}