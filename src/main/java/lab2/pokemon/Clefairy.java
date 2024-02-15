package lab2.pokemon;

import lab2.move.Pound;

public class Clefairy extends Cleffa {
    public Clefairy(String name, int level) {
        super(name, level);
        this.setStats(12, 2.1, 1.5, 5, 2, 4);
        this.addMove(new Pound());
    }
}
