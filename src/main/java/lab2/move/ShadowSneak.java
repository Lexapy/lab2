package lab2.move;

import ru.ifmo.se.pokemon.*;

public class ShadowSneak extends PhysicalMove {
    public ShadowSneak() {
        super(Type.DARK, 50, 99);
    }

    @Override
    protected String describe() {
        return "скрылся";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.75).turns(2).stat(Stat.DEFENSE, -2).stat(Stat.ACCURACY, -2);
        pokemon.addEffect(e);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().turns(2).stat(Stat.DEFENSE, 2).stat(Stat.EVASION , 2).stat(Stat.SPEED, 2);
        pokemon.addEffect(e);
    }
}
