package model.elementos.dragao;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Salamence extends Dragao {
    private List<Ataque> ataques;
    private int estagio;

    public Salamence(int estagio) {
        super("Salamence", 140, 140);
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
            setNome("Bagon");
            setVidaMax(90);
            this.spritePath = "/res/sprites/bagon.png";
            ataques = List.of(
                    new Ataque("Bite", "Sombrio", 60),
                    new Ataque("Ember", "Fogo", 40),
                    new Ataque("Headbutt", "Normal", 70),
                    new Ataque("Dragon Breath", "Dragao", 60)
            );
        } else if (estagio == 1) {
            setNome("Shelgon");
            setVidaMax(130);
            this.spritePath = "/res/sprites/shelgon.png";
            ataques = List.of(
                    new Ataque("Dragon Claw", "Dragao", 80),
                    new Ataque("Rock Slide", "Pedra", 75),
                    new Ataque("Crunch", "Sombrio", 80),
                    new Ataque("Dual Wingbeat", "Voador", 40)
            );
        } else  if (estagio == 2) {
            setNome("Salamence");
            setVidaMax(180);
            this.spritePath = "/res/sprites/salamence.png";
            ataques = List.of(
                    new Ataque("Dragon Claw", "Dragao", 80),
                    new Ataque("Fly", "Voador", 90),
                    new Ataque("Outrage", "Dragao", 120),
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