package lab2.pokemon;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import lab2.move.Psychic;
import lab2.move.ShadowSneak;
import lab2.move.Swagger;

public class Spinarak extends Pokemon {
    public Spinarak(String name, int level) {
        super(name, level);
        this.setStats(10, 1.5, 3, 5, 1, 6);
        this.setType(Type.POISON, Type.DRAGON);
        this.setMove(new Psychic(), new ShadowSneak(), new Swagger());
    }

}
