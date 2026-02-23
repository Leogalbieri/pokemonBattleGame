package model.elementos.planta;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Venusaur extends Planta {
    private List<Ataque> ataques;
    private int estagio;

    public Venusaur(int estagio) {
        super("Venusaur", 128, 128);
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
            setNome("Bulbasaur");
            setVidaMax(118);
            this.spritePath = "/res/sprites/bulbasaur.png";
            ataques = List.of(
                    new Ataque("Tackle", "Normal", 40),
                    new Ataque("Growl", "Normal", 35),
                    new Ataque("Vine Whip", "Planta", 45),
                    new Ataque("Seed Bomb", "Planta", 55)
            );
        } else if (estagio == 1) {
            setNome("Ivysaur");
            setVidaMax(148);
            this.spritePath = "/res/sprites/ivysaur.png";
            ataques = List.of(
                    new Ataque("Tackle", "Normal", 60),
                    new Ataque("Power Ship", "Planta", 90),
                    new Ataque("Razor Leaf", "Planta", 55),
                    new Ataque("Sludge Bomb", "Veneno", 80)
            );
        } else  if (estagio == 2) {
            setNome("Venusaur");
            setVidaMax(270);
            this.spritePath = "/res/sprites/venusaur.png";
            ataques = List.of(
                    new Ataque("Petal Dance", "Planta", 120),
                    new Ataque("Sludge Bomb", "Veneno", 110),
                    new Ataque("Petal Blizzard", "Planta", 90),
                    new Ataque("Earthquake", "Terrestre", 75)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}