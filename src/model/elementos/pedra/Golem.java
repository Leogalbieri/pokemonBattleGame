package model.elementos.pedra;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Golem extends Pedra {
    private List<Ataque> ataques;
    private int estagio;

    public Golem(int estagio) {
        super("Golem", 128, 128);
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
            setNome("Geodude");
            setVidaMax(80);
            this.spritePath = "/res/sprites/geodude.png";
            ataques = List.of(
                    new Ataque("Tackle", "Normal", 40),
                    new Ataque("Rock Throw", "Pedra", 50),
                    new Ataque("Mud-Slap", "Terrestre", 20),
                    new Ataque("Rollout", "Pedra", 30)
            );
        } else if (estagio == 1) {
            setNome("Graveler");
            setVidaMax(120);
            this.spritePath = "/res/sprites/graveler.png";
            ataques = List.of(
                    new Ataque("Rock Blast", "Pedra", 25),
                    new Ataque("Magnitude", "Terrestre", 70),
                    new Ataque("Bulldoze", "Terrestre", 60),
                    new Ataque("Rock Slide", "Pedra", 75)
            );
        } else  if (estagio == 2) {
            setNome("Golem");
            setVidaMax(160);
            this.spritePath = "/res/sprites/golem.png";
            ataques = List.of(
                    new Ataque("Stone Edge", "Pedra", 100),
                    new Ataque("Earthquake", "Terrestre", 100),
                    new Ataque("Heavy Slam", "Aço", 80),
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