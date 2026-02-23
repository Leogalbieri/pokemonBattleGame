package model.elementos.agua;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Greninja extends Agua {
    private List<Ataque> ataques;
    private int estagio;

    public Greninja(int estagio) {
        super("Greninja", 121, 121);
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
            setNome("Froakie");
            setVidaMax(121);
            this.spritePath = "/res/sprites/froakie.png";
            ataques = List.of(
                    new Ataque("Pound", "Normal", 40),
                    new Ataque("Water Gun", "Agua", 50),
                    new Ataque("Bubble", "Agua", 40),
                    new Ataque("Aqua Tail", "Agua", 35)
            );
        } else if (estagio == 1) {
            setNome("Frogadier");
            setVidaMax(146);
            this.spritePath = "/res/sprites/frogadier.png";
            ataques = List.of(
                    new Ataque("Lick", "Fantasma", 40),
                    new Ataque("Water Pulse", "Agua", 80),
                    new Ataque("Aqua Jet", "Agua", 55),
                    new Ataque("Surf", "Agua", 90)
            );
        } else  if (estagio == 2) {
            setNome("Greninja");
            setVidaMax(254);
            this.spritePath = "/res/sprites/greninja.png";
            ataques = List.of(
                    new Ataque("Hydro Pump", "Agua", 130),
                    new Ataque("Dark Pulse", "Sombrio", 80),
                    new Ataque("Surf", "Agua", 110),
                    new Ataque("Ice Beam", "Gelo", 95)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}