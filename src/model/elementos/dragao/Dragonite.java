package model.elementos.dragao;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Dragonite extends Dragao {
    private List<Ataque> ataques;
    private int estagio;

    public Dragonite(int estagio) {
        super("Dragonite", 140, 140);
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
            setNome("Dratini");
            setVidaMax(80);
            this.spritePath = "/res/sprites/dratini.png";
            ataques = List.of(
                    new Ataque("Wrap", "Normal", 40),
                    new Ataque("Thunder Wave", "Eletrico", 40),
                    new Ataque("Dragon Breath", "Dragao", 60),
                    new Ataque("Aqua Jet", "Agua", 40)
            );
        } else if (estagio == 1) {
            setNome("Dragonair");
            setVidaMax(120);
            this.spritePath = "/res/sprites/dragonair.png";
            ataques = List.of(
                    new Ataque("Aqua Tail", "Agua", 90),
                    new Ataque("Dragon Rush", "Dragao", 100),
                    new Ataque("Iron Tail", "Aço", 80),
                    new Ataque("Slam", "Normal", 80)
            );
        } else  if (estagio == 2) {
            setNome("Dragonite");
            setVidaMax(180);
            this.spritePath = "/res/sprites/dragonite.png";
            ataques = List.of(
                    new Ataque("Outrage", "Dragao", 120),
                    new Ataque("Fire Punch", "Fogo", 75),
                    new Ataque("Hurricane", "Voador", 110),
                    new Ataque("Draco Meteor", "Dragao", 130)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}