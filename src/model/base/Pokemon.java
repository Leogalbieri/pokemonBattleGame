package model.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Pokemon {

    protected String nome;
    protected String elemento;
    protected int vida, vidaMax;
    protected String spritePath;

    public Pokemon(String nome, String elemento, int vida, int vidaMax) {
        this.nome = nome;
        this.elemento = elemento;
        this.vida = vida;
        this.vidaMax = vidaMax;
    }

    public abstract void evoluir();
    public abstract List<Ataque> getAtaques();
    public abstract List<String> fraquezas();
    public abstract List<String> resistencias();

    public void receberDano(int dano) {
        this.vida -= dano;

        if (this.vida <= 0) {
            this.vida = 0;
        }
    }

    public boolean desmaiado() {
        return this.vida <= 0;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getElemento() { return elemento; }
    public void setElemento(String elemento) { this.elemento = elemento; }

    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }

    public int getVidaMax() { return vidaMax; }
    public void setVidaMax(int vidaMax) { this.vidaMax = vidaMax; }

    public String getSpritePath() { return spritePath; }
}