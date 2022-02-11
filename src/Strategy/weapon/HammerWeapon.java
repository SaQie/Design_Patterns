package Strategy.weapon;

public class HammerWeapon implements Weapon{

    private final int weaponDmg = 8;

    @Override
    public void useWeapon() {
        System.out.println("Used hammer weapon and took " + weaponDmg + " dmg to victim");
    }

    @Override
    public int getWeaponDmg() {
        return weaponDmg;
    }
}
