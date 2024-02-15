package lab2.pokemon;

import lab2.move.SwordsDance;
import ru.ifmo.se.pokemon.Type;

public class Ariados extends Spinarak {
    public Ariados(String name, int level) {
        super(name, level);
        this.setStats(10, 3, 2, 6, 4, 4);
        this.addMove(new SwordsDance());
    }

}