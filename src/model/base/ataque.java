package model.base;

public class Ataque {

    private String elemento;
    private String nome;
    private int dano;

    public Ataque(String nome, String elemento, int dano) {
        this.nome = nome;
        this.elemento = elemento;
        this.dano = dano;
    }

    public String getElemento() {
        return elemento;
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }
}