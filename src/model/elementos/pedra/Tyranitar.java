package model.elementos.pedra;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Tyranitar extends Pedra {
    private List<Ataque> ataques;
    private int estagio;

    public Tyranitar(int estagio) {
        super("Tyranitar", 128, 128);
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
            setNome("Larvitar");
            setVidaMax(90);
            this.spritePath = "/res/sprites/larvitar.png";
            ataques = List.of(
                    new Ataque("Bite", "Sombrio", 60),
                    new Ataque("Tackle", "Normal", 40),
                    new Ataque("Rock Throw", "Pedra", 50),
                    new Ataque("Stomping Tantrum", "Terrestre", 75)
            );
        } else if (estagio == 1) {
            setNome("Pupitar");
            setVidaMax(130);
            this.spritePath = "/res/sprites/pupitar.png";
            ataques = List.of(
                    new Ataque("Crunch", "Sombrio", 80),
                    new Ataque("Iron Head", "Aço", 80),
                    new Ataque("Rock Slide", "Pedra", 75),
                    new Ataque("Body Press", "Lutador", 80)
            );
        } else  if (estagio == 2) {
            setNome("Tyranitar");
            setVidaMax(180);
            this.spritePath = "/res/sprites/tyranitar.png";
            ataques = List.of(
                    new Ataque("Stone Edge", "Pedra", 100),
                    new Ataque("Dark Pulse", "Sombrio", 80),
                    new Ataque("Earthquake", "Terrestre", 100),
                    new Ataque("Crunch", "Sombrio", 80)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}