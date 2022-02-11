package Strategy.weapon;

public class SwordWeapon implements Weapon{

    private final int weaponDmg = 6;

    @Override
    public void useWeapon() {
        System.out.println("Used sword weapon and took " + weaponDmg + " dmg to victim");
    }

    @Override
    public int getWeaponDmg() {
        return weaponDmg;
    }
}
