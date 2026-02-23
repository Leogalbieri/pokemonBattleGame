package model.elementos.planta;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Sceptile extends Planta {
    private List<Ataque> ataques;
    private int estagio;

    public Sceptile(int estagio) {
        super("Sceptile", 128, 128);
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
            setNome("Treecko");
            setVidaMax(120);
            this.spritePath = "/res/sprites/treecko.png";
            ataques = List.of(
                    new Ataque("Tackle", "Normal", 40),
                    new Ataque("Pound", "Normal", 40),
                    new Ataque("Bullet Seed", "Planta", 45),
                    new Ataque("Energy Ball", "Planta", 60)
            );
        } else if (estagio == 1) {
            setNome("Grovyle");
            setVidaMax(147);
            this.spritePath = "/res/sprites/grovyle.png";
            ataques = List.of(
                    new Ataque("Slam", "Normal", 80),
                    new Ataque("Leafe Blade", "Planta", 90),
                    new Ataque("Razor Leaf", "Planta", 55),
                    new Ataque("Bullet Seed", "Planta", 80)
            );
        } else  if (estagio == 2) {
            setNome("Sceptile");
            setVidaMax(264);
            this.spritePath = "/res/sprites/sceptile.png";
            ataques = List.of(
                    new Ataque("Focus Blast", "Planta", 120),
                    new Ataque("Leaf Storm", "Planta", 130),
                    new Ataque("Giga Drain", "Planta", 90),
                    new Ataque("Dragon Pulse", "Dragao", 95)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}