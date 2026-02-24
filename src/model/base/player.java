package model.base;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String nome;
    private int vitorias = 0;
    private int derrotas = 0;
    private List<Pokemon> time;

    public Player(String nome) {
        this.nome = nome;
        this.time = new ArrayList<>();
    }

    public void adicionarPokemon(Pokemon p) {
        if (time.size() < 3) {
            time.add(p);
        }
    }

    public String getNome() { return nome; }
    public int getVitorias() { return vitorias; }
    public void registrarVitoria() { this.vitorias++; }
    public int getDerrotas() { return derrotas; }
    public void registrarDerrota() { this.derrotas++; }
    public List<Pokemon> getTime() { return time; }
}