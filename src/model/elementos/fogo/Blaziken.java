package model.elementos.fogo;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Blaziken extends Fogo {
    private List<Ataque> ataques;
    private int estagio;

    public Blaziken(int estagio) {
        super("Blaziken", 118, 118);
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
            setNome("Torchic");
            setVidaMax(128);
            this.spritePath = "/res/sprites/torchic.png";
            ataques = List.of(
                    new Ataque("Scratch", "Normal", 40),
                    new Ataque("Ember", "Fogo", 40),
                    new Ataque("Fire Fang", "Fogo", 50),
                    new Ataque("Flame Burst", "Fogo", 60)
            );
        } else if (estagio == 1) {
            setNome("Combusken");
            setVidaMax(155);
            this.spritePath = "/res/sprites/combusken.png";
            ataques = List.of(
                    new Ataque("Sky Uppercut", "Lutador", 75),
                    new Ataque("Flamethrower", "Fogo", 90),
                    new Ataque("Fire Spin", "Fogo", 60),
                    new Ataque("Double Kick", "Lutador", 40)
            );
        } else  if (estagio == 2) {
            setNome("Blaziken");
            setVidaMax(256);
            this.spritePath = "/res/sprites/blaziken.png";
            ataques = List.of(
                    new Ataque("Overheat", "Fogo", 130),
                    new Ataque("High Jump Kick", "Lutador", 130),
                    new Ataque("Flamethrower", "Fogo", 110),
                    new Ataque("Blaze Kick", "Lutador", 85)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}