package Strategy;

import Strategy.character.Character;
import Strategy.character.Lancelot;
import Strategy.character.Persival;
import Strategy.weapon.BowWeapon;
import Strategy.weapon.HammerWeapon;
import Strategy.weapon.SwordWeapon;
import Strategy.weapon.Weapon;

public class Strategy {
    public static void main(String[] args) {
        //Create a new characters
        Character lancelot = new Lancelot();
        Character persival = new Persival();
        //Create new weapons
        Weapon sword = new SwordWeapon();
        Weapon bow = new BowWeapon();
        Weapon hammer = new HammerWeapon();
        //Setting weapons to characters
        lancelot.setWeapon(sword);
        persival.setWeapon(bow);
        //show weapons
        lancelot.getWeapon().useWeapon();
        persival.getWeapon().useWeapon();
        lancelot.setWeapon(hammer);
        lancelot.getWeapon().useWeapon();
    }
}
