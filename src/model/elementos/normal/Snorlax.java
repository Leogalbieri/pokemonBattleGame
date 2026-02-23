package model.elementos.normal;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Snorlax extends Normal {
    private List<Ataque> ataques;
    private int estagio;

    public Snorlax(int estagio) {
        super("Snorlax", 140, 140);
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
            setNome("Munchlax");
            setVidaMax(120);
            this.spritePath = "/res/sprites/munchlax.png";
            ataques = List.of(
                    new Ataque("Tackle", "Normal", 40),
                    new Ataque("Lick", "Fantasma", 40),
                    new Ataque("Body Slam", "Normal", 85),
                    new Ataque("Stomp", "Normal", 65)
            );
        } else if (estagio == 1) {
            setNome("Snorlax");
            setVidaMax(200);
            this.spritePath = "/res/sprites/snorlax.png";
            ataques = List.of(
                    new Ataque("Body Slam", "Normal", 85),
                    new Ataque("Heavy Slam", "Aço", 80),
                    new Ataque("Crunch", "Noturno", 80),
                    new Ataque("Giga Impact", "Normal", 150)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}