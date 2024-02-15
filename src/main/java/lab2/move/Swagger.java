package lab2.move;

import ru.ifmo.se.pokemon.*;

import java.util.Arrays;

import static ru.ifmo.se.pokemon.Status.*;

public class Swagger extends PhysicalMove {
    public Swagger() {
        super(Type.NORMAL, 50, 90);
    }

    @Override
    protected String describe() {
        return "создал иллюзию";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ACCURACY, -4);
        pokemon.setMod(Stat.SPEED, -4);
        pokemon.setMod(Stat.DEFENSE , -4);
    }
}
