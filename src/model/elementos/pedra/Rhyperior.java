package model.elementos.pedra;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Rhyperior extends Pedra {
    private List<Ataque> ataques;
    private int estagio;

    public Rhyperior(int estagio) {
        super("Rhyperior", 128, 128);
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
            setNome("Rhyhorn");
            setVidaMax(110);
            this.spritePath = "/res/sprites/rhyhorn.png";
            ataques = List.of(
                    new Ataque("Tackle", "Normal", 40),
                    new Ataque("Rock Blast", "Pedra", 25),
                    new Ataque("Stomp", "Normal", 65),
                    new Ataque("Bulldoze", "Terrestre", 60)
            );
        } else if (estagio == 1) {
            setNome("Rhydon");
            setVidaMax(150);
            this.spritePath = "/res/sprites/rhydon.png";
            ataques = List.of(
                    new Ataque("Drill Peck", "Voador", 80),
                    new Ataque("Drill Run", "Terrestre", 80),
                    new Ataque("Rock Slide", "Pedra", 75),
                    new Ataque("Megahorn", "Inseto", 120)
            );
        } else  if (estagio == 2) {
            setNome("Rhyperior");
            setVidaMax(190);
            this.spritePath = "/res/sprites/rhyperior.png";
            ataques = List.of(
                    new Ataque("Rock Wrecker", "Pedra", 150),
                    new Ataque("Earthquake", "Terrestre", 100),
                    new Ataque("Stone Edge", "Pedra", 100),
                    new Ataque("High Horsepower", "Terrestre", 95)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}