package lab2;

import lab2.pokemon.*;
import ru.ifmo.se.pokemon.*;

public class lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();

        b.addAlly(new Clefairy("Славный", 2));
        b.addAlly(new Bruxish("Главный", 1));
        b.addAlly(new Spinarak("Опасный", 1));

        b.addFoe(new Ariados("Везучий", 2));
        b.addFoe(new Clefable("Сильнейший", 3));
        b.addFoe(new Cleffa("Могучий", 1));

        b.go();
    }
}
