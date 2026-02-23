package model.elementos.pedra;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Steelix extends Pedra {
    private List<Ataque> ataques;
    private int estagio;

    public Steelix(int estagio) {
        super("Steelix", 128, 128);
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
            setNome("Onix");
            setVidaMax(100);
            this.spritePath = "/res/sprites/onix.png";
            ataques = List.of(
                    new Ataque("Tackle", "Normal", 40),
                    new Ataque("Rock Throw", "Pedra", 50),
                    new Ataque("Smack Down", "Pedra", 50),
                    new Ataque("Rock Tomb", "Pedra", 60)
            );
        } else if (estagio == 1) {
            setNome("Steelix");
            setVidaMax(170);
            this.spritePath = "/res/sprites/steelix.png";
            ataques = List.of(
                    new Ataque("Iron Tail", "Aço", 100),
                    new Ataque("Earthquake", "Terrestre", 100),
                    new Ataque("Heavy Slam", "Aço", 80),
                    new Ataque("Stone Edge", "Pedra", 100)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}