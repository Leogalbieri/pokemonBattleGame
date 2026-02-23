package model.elementos.fogo;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Charizard extends Fogo {
    private List<Ataque> ataques;
    private int estagio;

    public Charizard(int estagio) {
        super("Charizard", 118, 118);
        this.estagio = estagio;
        configurarEstagio(this.estagio);
    }

    @Override
    public void evoluir() {
        if (this.estagio < 2) {
            this.estagio++;
            configurarEstagio(this.estagio);
        }
    }

    private void configurarEstagio(int estagio) {
        if (estagio == 0) {
            setNome("Charmander");
            setVidaMax(128);
            this.spritePath = "/res/sprites/charmander.png";
            ataques = List.of(
                    new Ataque("Scratch", "Normal", 40),
                    new Ataque("Ember", "Fogo", 40),
                    new Ataque("Fire Fang", "Fogo", 50),
                    new Ataque("Dragon Rage", "Dragao", 60)
            );
        } else if (estagio == 1) {
            setNome("Charmeleon");
            setVidaMax(151);
            this.spritePath = "/res/sprites/charmeleon.png";
            ataques = List.of(
                    new Ataque("Slash", "Normal", 70),
                    new Ataque("Flamethrower", "Fogo", 90),
                    new Ataque("Fire Spin", "Fogo", 60),
                    new Ataque("Smokescreen", "Fogo", 45)
            );
        } else  if (estagio == 2) {
            setNome("Charizard");
            setVidaMax(275);
            this.spritePath = "/res/sprites/charizard.png";
            ataques = List.of(
                    new Ataque("Fire Blast", "Fogo", 100),
                    new Ataque("Air Slash", "Voador", 85),
                    new Ataque("Flamethrower", "Fogo", 110),
                    new Ataque("Dragon Claw", "Dragao", 75)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}