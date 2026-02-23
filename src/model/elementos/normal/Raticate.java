package model.elementos.normal;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Raticate extends Normal {
    private List<Ataque> ataques;
    private int estagio;

    public Raticate(int estagio) {
        super("Raticate", 140, 140);
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
            setNome("Rattata");
            setVidaMax(90);
            this.spritePath = "/res/sprites/rattata.png";
            ataques = List.of(
                    new Ataque("Tackle", "Normal", 30),
                    new Ataque("Quick Attack", "Normal", 40),
                    new Ataque("Bite", "Noturno", 60),
                    new Ataque("Hyper Fang", "Normal", 80)
            );
        } else if (estagio == 1) {
            setNome("Raticate");
            setVidaMax(130);
            this.spritePath = "/res/sprites/raticate.png";
            ataques = List.of(
                    new Ataque("Quick Attack", "Normal", 40),
                    new Ataque("Hyper Fang", "Normal", 80),
                    new Ataque("Sucker Punch", "Noturno", 70),
                    new Ataque("Crunch", "Noturno", 80)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}