package model.elementos.fogo;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Arcanine extends Fogo {
    private List<Ataque> ataques;
    private int estagio;

    public Arcanine(int estagio) {
        super("Arcanine", 140, 140);
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
            setNome("Growlithe");
            setVidaMax(100);
            this.spritePath = "/res/sprites/growlithe.png";
            ataques = List.of(
                    new Ataque("Bite", "Sombrio", 60),
                    new Ataque("Ember", "Fogo", 40),
                    new Ataque("Flame Wheel", "Fogo", 60),
                    new Ataque("Take Down", "Normal", 90)
            );
        } else if (estagio == 1) {
            setNome("Arcanine");
            setVidaMax(150);
            this.spritePath = "/res/sprites/arcanine.png";
            ataques = List.of(
                    new Ataque("Flame Wheel", "Fogo", 60),
                    new Ataque("Flamethrower", "Fogo", 90),
                    new Ataque("Extremespeed", "Normal", 80),
                    new Ataque("Flare Blitz", "Fogo", 120)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}