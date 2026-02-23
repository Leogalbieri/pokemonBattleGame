package model.elementos.planta;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Victreebel extends Planta {
    private List<Ataque> ataques;
    private int estagio;

    public Victreebel(int estagio) {
        super("Victreebel", 128, 128);
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
            setNome("Bellsprout");
            setVidaMax(70);
            this.spritePath = "/res/sprites/bellsprout.png";
            ataques = List.of(
                    new Ataque("Vine Whip", "Planta", 45),
                    new Ataque("Acid", "Veneno", 40),
                    new Ataque("Wrap", "Normal", 15),
                    new Ataque("Tackle", "Normal", 40)
            );
        } else if (estagio == 1) {
            setNome("Weepinbell");
            setVidaMax(100);
            this.spritePath = "/res/sprites/weepinbell.png";
            ataques = List.of(
                    new Ataque("Razor Leaf", "Planta", 55),
                    new Ataque("Acid Spray", "Veneno", 40),
                    new Ataque("Slam", "Normal", 60),
                    new Ataque("Leaf Blade", "Planta", 80)
            );
        } else  if (estagio == 2) {
            setNome("Victreebel");
            setVidaMax(140);
            this.spritePath = "/res/sprites/victreebel.png";
            ataques = List.of(
                    new Ataque("Leaf Storm", "Planta", 130),
                    new Ataque("Sludge Bomb", "Veneno", 90),
                    new Ataque("Power Whip", "Planta", 120),
                    new Ataque("Poison Jab", "Veneno", 80)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}