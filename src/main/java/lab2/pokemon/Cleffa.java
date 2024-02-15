package lab2.pokemon;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import lab2.move.FireBlast;
import lab2.move.Psychic;

public class Cleffa extends Pokemon {
    public Cleffa(String name, int level) {
        super(name, level);
        this.setStats(10, 2.1,1, 4, 2, 5);
        this.setType(Type.FAIRY, Type.FIGHTING);
        this.setMove(new FireBlast(), new Psychic());
    }
}
