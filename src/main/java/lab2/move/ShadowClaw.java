package lab2.move;

import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw() {
        super(Type.DARK, 70, 90);
    }

    @Override
    protected String describe() {
        return "применил коготь тени";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.paralyze(pokemon);
        Effect.confuse(pokemon);
    }
}
