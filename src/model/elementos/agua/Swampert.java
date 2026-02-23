package model.elementos.agua;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Swampert extends Agua {
    private List<Ataque> ataques;
    private int estagio;

    public Swampert(int estagio) {
        super("Swampert", 137, 137);
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
            setNome("Mudkip");
            setVidaMax(137);
            this.spritePath = "/res/sprites/mudkip.png";
            ataques = List.of(
                    new Ataque("Tackle", "Normal", 40),
                    new Ataque("Water Gun", "Agua", 40),
                    new Ataque("Bubble", "Agua", 30),
                    new Ataque("Mud Bomb", "Terrestre", 55)
            );
        } else if (estagio == 1) {
            setNome("Marshtomp");
            setVidaMax(172);
            this.spritePath = "/res/sprites/marshtomp.png";
            ataques = List.of(
                    new Ataque("Surf", "Agua", 90),
                    new Ataque("Water Pulse", "Agua", 80),
                    new Ataque("Muddy Water", "Agua", 90),
                    new Ataque("Mud Shot", "Terrestre", 65)
            );
        } else  if (estagio == 2) {
            setNome("Swampert");
            setVidaMax(225);
            this.spritePath = "/res/sprites/swampert.png";
            ataques = List.of(
                    new Ataque("Hydro Pump", "Agua", 130),
                    new Ataque("Earthquake", "Terrestre", 110),
                    new Ataque("Surf", "Agua", 110),
                    new Ataque("Ice Punch", "Gelo", 80)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}