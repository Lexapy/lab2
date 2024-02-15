package lab2.move;

import ru.ifmo.se.pokemon.*;

public class Pound extends PhysicalMove {

    public Pound() {
        super(Type.NORMAL, 80, 80);
    }

    @Override
    protected String describe() {
        return "бьет";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, 4);
    }
}

