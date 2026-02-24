package model.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.elementos.agua.*;
import model.elementos.dragao.*;
import model.elementos.eletrico.*;
import model.elementos.fogo.*;
import model.elementos.normal.*;
import model.elementos.pedra.*;
import model.elementos.planta.*;

public class Oponentes {
    private Random gerador = new Random();

    public Pokemon gerarPokemon(int estagio) {

        int limitePokemons;
        limitePokemons = (estagio < 2) ? 25 : 19;

        int sorteio = gerador.nextInt(limitePokemons);
        return switch (sorteio) {

            // Pokémons

            case 0 -> new Blastoise(estagio);
            case 1 -> new Greninja(estagio);
            case 2 -> new Swampert(estagio);
            case 3 -> new Dragonite(estagio);
            case 4 -> new Garchomp(estagio);
            case 5 -> new Salamence(estagio);
            case 6 -> new Electivire(estagio);
            case 7 -> new Raichu(estagio);
            case 8 -> new Blaziken(estagio);
            case 9 -> new Charizard(estagio);
            case 10 -> new Delphox(estagio);
            case 11 -> new Pidgeot(estagio);
            case 12 -> new Golem(estagio);
            case 13 -> new Rhyperior(estagio);
            case 14 -> new Tyranitar(estagio);
            case 15 -> new Chesnaught(estagio);
            case 16 -> new Sceptile(estagio);
            case 17 -> new Venusaur(estagio);
            case 18 -> new Victreebel(estagio);

            // Condicionais

            case 19 -> new Gyarados(estagio);
            case 20 -> new Arcanine(estagio);
            case 21 -> new Lopunny(estagio);
            case 22 -> new Snorlax(estagio);
            case 23 -> new Raticate(estagio);
            case 24 -> new Steelix(estagio);

            // Fallback

            default -> new Raichu(estagio);

        };
    }

    // Gerador do time inimigo
    public List<Pokemon> getTimeInimigo(int estagio) {
        List<Pokemon> timeInimigo = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            timeInimigo.add(gerarPokemon(estagio));
        }
        return timeInimigo;
    }

    // Rayquaza
    public List<Pokemon> getBossFinal() {
        return List.of(new Rayquaza());
    }
}