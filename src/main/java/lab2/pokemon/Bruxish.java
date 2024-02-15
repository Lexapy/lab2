package lab2.pokemon;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import lab2.move.ShadowClaw;
import lab2.move.ShadowSneak;
import lab2.move.WoodHammer;
import lab2.move.DazzlingGleam;

public class Bruxish extends Pokemon {
    public Bruxish(String name, int level) {
        super(name, level);
        this.setStats(8, 2, 2.5, 4, 5, 5);
        this.setType(Type.BUG);
        this.setMove(new ShadowClaw(), new ShadowSneak(), new WoodHammer(), new DazzlingGleam());
    }
}
