package Strategy.character;

import Strategy.weapon.BowWeapon;

public class Persival extends Character{

    private final int characterHp = 20;

    public Persival() {
        weapon = new BowWeapon();
        name = "Persival";
    }
}
