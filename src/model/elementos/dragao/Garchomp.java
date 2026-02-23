package model.elementos.dragao;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Garchomp extends Dragao {
    private List<Ataque> ataques;
    private int estagio;

    public Garchomp(int estagio) {
        super("Garchomp", 140, 140);
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
            setNome("Gible");
            setVidaMax(90);
            this.spritePath = "/res/sprites/gible.png";
            ataques = List.of(
                    new Ataque("Tackle", "Normal", 40),
                    new Ataque("Sand Attack", "Terrestre", 40),
                    new Ataque("Dragon Rage", "Dragao", 60),
                    new Ataque("Take Down", "Normal", 90)
            );
        } else if (estagio == 1) {
            setNome("Gabite");
            setVidaMax(130);
            this.spritePath = "/res/sprites/gabite.png";
            ataques = List.of(
                    new Ataque("Dragon Claw", "Dragao", 80),
                    new Ataque("Dig", "Terrestre", 80),
                    new Ataque("Sand Tomb", "Terrestre", 55),
                    new Ataque("Dual Chop", "Dragao", 40)
            );
        } else  if (estagio == 2) {
            setNome("Garchomp");
            setVidaMax(190);
            this.spritePath = "/res/sprites/garchomp.png";
            ataques = List.of(
                    new Ataque("Dragon Claw", "Dragao", 80),
                    new Ataque("Earthquake", "Terrestre", 100),
                    new Ataque("Outrage", "Dragao", 120),
                    new Ataque("Stone Edge", "Pedra", 100)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}