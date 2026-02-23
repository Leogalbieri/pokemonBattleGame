package model.elementos.planta;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Chesnaught extends Planta {
    private List<Ataque> ataques;
    private int estagio;

    public Chesnaught(int estagio) {
        super("Chesnaught", 128, 128);
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
            setNome("Chespin");
            setVidaMax(128);
            this.spritePath = "/res/sprites/chespin.png";
            ataques = List.of(
                    new Ataque("Tackle", "Normal", 40),
                    new Ataque("Growl", "Normal", 35),
                    new Ataque("Vine Whip", "Planta", 45),
                    new Ataque("Seed Bomb", "Planta", 55)
            );
        } else if (estagio == 1) {
            setNome("Quilladin");
            setVidaMax(153);
            this.spritePath = "/res/sprites/quilladin.png";
            ataques = List.of(
                    new Ataque("Needle Arm", "Planta", 60),
                    new Ataque("Take Down", "Planta", 90),
                    new Ataque("Body Slam", "Planta", 50),
                    new Ataque("Dig", "Terrestre", 90)
            );
        } else  if (estagio == 2) {
            setNome("Chesnaught");
            setVidaMax(270);
            this.spritePath = "/res/sprites/chesnaught.png";
            ataques = List.of(
                    new Ataque("Wood Hammer", "Planta", 120),
                    new Ataque("Sludge Bomb", "Veneno", 110),
                    new Ataque("Frenzy Plant", "Planta", 100),
                    new Ataque("Earthquake", "Terrestre", 90)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}