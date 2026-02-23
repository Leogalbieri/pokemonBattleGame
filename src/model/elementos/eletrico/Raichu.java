package model.elementos.eletrico;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Raichu extends Eletrico {
    private List<Ataque> ataques;
    private int estagio;

    public Raichu(int estagio) {
        super("Raichu", 140, 140);
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
            setNome("Pichu");
            setVidaMax(70);
            this.spritePath = "/res/sprites/pichu.png";
            ataques = List.of(
                    new Ataque("Quick Attack", "Normal", 30),
                    new Ataque("Thunder Shock", "Eletrico", 40),
                    new Ataque("Thunderbolt", "Eletrico", 55),
                    new Ataque("Disarming Voice", "Fada", 40)
            );
        } else if (estagio == 1) {
            setNome("Pikachu");
            setVidaMax(120);
            this.spritePath = "/res/sprites/pikachu.png";
            ataques = List.of(
                    new Ataque("Wild Charge", "Eletrico", 80),
                    new Ataque("ThunderBolt", "Eletrico", 90),
                    new Ataque("Slam", "Normal", 55),
                    new Ataque("Volt Tackle", "Eletrico", 120)
            );
        } else  if (estagio == 2) {
            setNome("Raichu");
            setVidaMax(160);
            this.spritePath = "/res/sprites/raichu.png";
            ataques = List.of(
                    new Ataque("Thunderbolt", "Eletrico", 120),
                    new Ataque("Focus Blast", "Lutador", 120),
                    new Ataque("Volt Tackle", "Eletrico", 115),
                    new Ataque("Volt Switch", "Eletrico", 70)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}