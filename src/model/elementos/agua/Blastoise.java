package model.elementos.agua;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Blastoise extends Agua {
    private List<Ataque> ataques;
    private int estagio;

    public Blastoise(int estagio) {
        super("Blastoise", 127, 127);
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
            setNome("Squirtle");
            setVidaMax(127);
            this.spritePath = "/res/sprites/squirtle.png";
            ataques = List.of(
                    new Ataque("Tackle", "Normal", 40),
                    new Ataque("Water Gun", "Agua", 40),
                    new Ataque("Bubble", "Agua", 30),
                    new Ataque("Aqua Tail", "Agua", 35)
            );
        } else if (estagio == 1) {
            setNome("Wartortle");
            setVidaMax(153);
            this.spritePath = "/res/sprites/wartortle.png";
            ataques = List.of(
                    new Ataque("Water Gun", "Agua", 60),
                    new Ataque("Water Pulse", "Agua", 80),
                    new Ataque("Aqua Jet", "Agua", 55),
                    new Ataque("Dig", "Terrestre", 100)
            );
        } else  if (estagio == 2) {
            setNome("Blastoise");
            setVidaMax(238);
            this.spritePath = "/res/sprites/blastoise.png";
            ataques = List.of(
                    new Ataque("Hydro Pump", "Agua", 130),
                    new Ataque("Flash Cannon", "Aço", 110),
                    new Ataque("Surf", "Agua", 90),
                    new Ataque("Hydro Cannon", "Agua", 80)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}