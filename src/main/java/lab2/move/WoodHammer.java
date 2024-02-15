package lab2.move;
import ru.ifmo.se.pokemon.*;

public class WoodHammer extends SpecialMove {
    public WoodHammer() {
        super(Type.BUG, 60, 60);
    }
    @Override
    protected String describe() {
        return "использовал деревянный молот";
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.sleep(pokemon);
    }
}