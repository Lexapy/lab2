package lab2.move;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends SpecialMove {

    public ThunderWave() {
        super(Type.ELECTRIC, 90, 50, 0, 3);
    }

    @Override
    protected String describe() {
        return "использовал громовой удар";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ACCURACY, -3);
        pokemon.setMod(Stat.SPECIAL_DEFENSE, -2);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_DEFENSE, -2);
    }
}
