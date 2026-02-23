package model.elementos.dragao;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Rayquaza extends Dragao {
    private List<Ataque> ataques;

    public Rayquaza() {
        super("Rayquaza", 500, 500);
        this.spritePath = "/res/sprites/rayquaza.png";

        ataques = List.of(
                new Ataque("Draco Meteor", "Dragao", 130),
                new Ataque("Air Slash", "Voador", 75),
                new Ataque("Outrage", "Dragao", 120),
                new Ataque("Extreme Speed", "Normal", 80)
        );
        setVida(getVidaMax());
    }

    @Override
    public void evoluir() {
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}