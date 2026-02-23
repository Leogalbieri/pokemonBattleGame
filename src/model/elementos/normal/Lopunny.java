package model.elementos.normal;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Lopunny extends Normal {
    private List<Ataque> ataques;
    private int estagio;

    public Lopunny(int estagio) {
        super("Lopunny", 140, 140);
        this.estagio = estagio;
        configurarEstagio(this.estagio);
    }

    @Override
    public void evoluir() {
        if (this.estagio < 1) {
            this.estagio++;
            configurarEstagio(this.estagio);
        }
    }

    private void configurarEstagio(int estagio) {
        if (estagio == 0) {
            setNome("Buneary");
            setVidaMax(70);
            this.spritePath = "/res/sprites/buneary.png";
            ataques = List.of(
                    new Ataque("Pound", "Normal", 40),
                    new Ataque("Quick Attack", "Normal", 40),
                    new Ataque("Jump Kick", "Lutador", 70),
                    new Ataque("Double Kick", "Lutador", 30)
            );
        } else if (estagio == 1) {
            setNome("Lopunny");
            setVidaMax(130);
            this.spritePath = "/res/sprites/lopunny.png";
            ataques = List.of(
                    new Ataque("Quick Attack", "Normal", 40),
                    new Ataque("High Jump Kick", "Lutador", 130),
                    new Ataque("Dizzy Punch", "Normal", 70),
                    new Ataque("Close Combat", "Lutador", 120)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}