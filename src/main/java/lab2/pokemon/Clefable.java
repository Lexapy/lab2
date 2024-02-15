package lab2.pokemon;

import lab2.move.ThunderWave;

public class Clefable extends Clefairy {
    public Clefable(String name, int level) {
        super(name, level);
        this.setStats(15, 3, 2, 5, 4, 4);
        this.addMove(new ThunderWave());
    }
}
