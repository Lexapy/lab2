package lab2.move;

import java.util.Objects;
import java.lang.String;
import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends PhysicalMove {

    public DazzlingGleam() {
        super(Type.ELECTRIC, 65, 80);
    }

    @Override
    protected String describe() {
        return "использовал ослепительный блеск";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, -2);
        pokemon.setMod(Stat.DEFENSE, -2);
    }
}
