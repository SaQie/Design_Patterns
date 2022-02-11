package Strategy.weapon;

public class BowWeapon implements Weapon{

    private final int weaponDmg = 5;

    @Override
    public void useWeapon() {
        System.out.println("Used bow weapon and took " + weaponDmg + " dmg to victim");
    }

    @Override
    public int getWeaponDmg() {
        return weaponDmg;
    }
}
