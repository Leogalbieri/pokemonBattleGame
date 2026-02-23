package model.elementos.fogo;

import java.util.List;
import model.base.Ataque;
import model.base.Pokemon;

public class Delphox extends Fogo {
    private List<Ataque> ataques;
    private int estagio;

    public Delphox(int estagio) {
        super("Delphox", 116, 116);
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
            setNome("Fennekin");
            setVidaMax(116);
            this.spritePath = "/res/sprites/fennekin.png";
            ataques = List.of(
                    new Ataque("Scratch", "Normal", 40),
                    new Ataque("Ember", "Fogo", 40),
                    new Ataque("Fire Fang", "Fogo", 50),
                    new Ataque("Flame Charge", "Dragao", 50)
            );
        } else if (estagio == 1) {
            setNome("Braixen");
            setVidaMax(153);
            this.spritePath = "/res/sprites/braixen.png";
            ataques = List.of(
                    new Ataque("Psyshock", "Psiquico", 80),
                    new Ataque("Flamethrower", "Fogo", 90),
                    new Ataque("Fire Spin", "Fogo", 60),
                    new Ataque("Smokescreen", "Fogo", 45)
            );
        } else  if (estagio == 2) {
            setNome("Delphox");
            setVidaMax(260);
            this.spritePath = "/res/sprites/delphox.png";
            ataques = List.of(
                    new Ataque("Psyshock", "Psiquico", 110),
                    new Ataque("Mystical Fire", "Fogo", 85),
                    new Ataque("Flamethrower", "Fogo", 110),
                    new Ataque("Shadow Ball", "Fantasma", 80)
            );
        }
        setVida(getVidaMax());
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }
}