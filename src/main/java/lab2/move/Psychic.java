package lab2.move;

import ru.ifmo.se.pokemon.*;

public class Psychic extends StatusMove {
    public Psychic() {
        super(Type.DRAGON, 5, 99);
    }

    @Override
    protected String describe() {
        return "читает мысли";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION, 2);
        pokemon.setMod(Stat.SPEED, 2);
        pokemon.setMod(Stat.ATTACK, 2);
    }
}
