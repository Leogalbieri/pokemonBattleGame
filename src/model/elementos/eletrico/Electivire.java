package model.elementos.eletrico;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Electivire extends Eletrico {
    private List<Ataque> ataques;
    private int estagio;

    public Electivire(int estagio) {
        super("Electivire", 140, 140);
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
            setNome("Elekid");
            setVidaMax(70);
            this.spritePath = "/res/sprites/elekid.png";
            ataques = List.of(
                    new Ataque("Quick Attack", "Normal", 40),
                    new Ataque("Thunder Shock", "Eletrico", 40),
                    new Ataque("Low Kick", "Lutador", 60),
                    new Ataque("Ice Punch", "Gelo", 75)
            );
        } else if (estagio == 1) {
            setNome("Electrabuzz");
            setVidaMax(120);
            this.spritePath = "/res/sprites/electrabuzz.png";
            ataques = List.of(
                    new Ataque("Quick Attack", "Normal", 40),
                    new Ataque("Thunder Punch", "Eletrico", 75),
                    new Ataque("Fire Punch", "Fogo", 75),
                    new Ataque("Psychic", "Psiquico", 90)
            );
        } else  if (estagio == 2) {
            setNome("Electivire");
            setVidaMax(160);
            this.spritePath = "/res/sprites/electivire.png";
            ataques = List.of(
                    new Ataque("Wild Charge", "Eletrico", 90),
                    new Ataque("Cross Chop", "Lutador", 100),
                    new Ataque("Thunder", "Eletrico", 110),
                    new Ataque("Ice Punch", "Gelo", 75)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}