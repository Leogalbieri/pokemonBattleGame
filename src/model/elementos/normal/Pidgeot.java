package model.elementos.normal;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Pidgeot extends Normal {
    private List<Ataque> ataques;
    private int estagio;

    public Pidgeot(int estagio) {
        super("Pidgeot", 121, 121);
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
            setNome("Pidgey");
            setVidaMax(90);
            this.spritePath = "/res/sprites/pidgey.png";
            ataques = List.of(
                    new Ataque("Tackle", "Normal", 40),
                    new Ataque("Gust", "Voador", 40),
                    new Ataque("Quick Attack", "Normal", 40),
                    new Ataque("Wing Attack", "Voador", 60)
            );
        } else if (estagio == 1) {
            setNome("Pidgeotto");
            setVidaMax(120);
            this.spritePath = "/res/sprites/pidgeotto.png";
            ataques = List.of(
                    new Ataque("Quick Attack", "Normal", 40),
                    new Ataque("Wing Attack", "Voador", 60),
                    new Ataque("Air Slash", "Voador", 75),
                    new Ataque("Wing Attack", "Voador", 60)
            );
        } else  if (estagio == 2) {
            setNome("Pidgeot");
            setVidaMax(150);
            this.spritePath = "/res/sprites/pidgeot.png";
            ataques = List.of(
                    new Ataque("Air Slash", "Voador", 75),
                    new Ataque("Hurricane", "Voador", 110),
                    new Ataque("Quick Attack", "Normal", 40),
                    new Ataque("Sky Attack", "Voador", 140)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}