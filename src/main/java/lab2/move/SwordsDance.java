package lab2.move;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends PhysicalMove {

    public SwordsDance() {
        super(Type.DRAGON, 55, 99);
    }

    @Override
    protected String describe() {
        return "использовал танец мечей";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.5).turns(2).stat(Stat.DEFENSE, -1).stat(Stat.HP, -1);
        pokemon.addEffect(e);
        Effect.paralyze(pokemon);
    }
}
