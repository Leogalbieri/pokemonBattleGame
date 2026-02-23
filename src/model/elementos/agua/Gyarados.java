package model.elementos.agua;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Gyarados extends Agua {
    private List<Ataque> ataques;
    private int estagio;

    public Gyarados(int estagio) {
        super("Gyarados", 140, 140);
        this.estagio = estagio;
        configurarEstagio(this.estagio);
    }

    @Override
    public void evoluir() {
        if (this.estagio < 1) {
            this.estagio++;
            configurarEstagio(this.estagio);
        }
    }

    private void configurarEstagio(int estagio) {
        if (estagio == 0) {
            setNome("Magikarp");
            setVidaMax(60);
            this.spritePath = "/res/sprites/magikarp.png";
            ataques = List.of(
                    new Ataque("Hydro pump", "Agua", 40),
                    new Ataque("Tackle", "Normal", 30),
                    new Ataque("Flail", "Normal", 40),
                    new Ataque("Bubble", "Agua", 20)
            );
        } else if (estagio == 1) {
            setNome("Gyarados");
            setVidaMax(160);
            this.spritePath = "/res/sprites/gyarados.png";
            ataques = List.of(
                    new Ataque("Bite", "Noturno", 60),
                    new Ataque("Aqua Tail", "Agua", 90),
                    new Ataque("Dragon Tail", "Dragao", 60),
                    new Ataque("Hydro Pump", "Agua", 110)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}