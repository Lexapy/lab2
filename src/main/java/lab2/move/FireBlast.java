package lab2.move;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends PhysicalMove {

    public FireBlast() {
        super(Type.FIRE, 50, 99);
    }

    @Override
    protected String describe() {
        return "выпустил огненный шар";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.burn(pokemon);
    }
}