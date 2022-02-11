package Strategy.character;

import Strategy.weapon.Weapon;

public abstract class Character {

    protected Weapon weapon;
    protected String name;

    public Weapon getWeapon() {
        return weapon;
    }

    public String getName() {
        return name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setName(String name) {
        this.name = name;
    }
}
