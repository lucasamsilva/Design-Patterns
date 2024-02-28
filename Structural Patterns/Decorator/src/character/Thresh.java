package character;

import interfaces.HasStats;

public class Thresh implements HasStats {

    private int damage;
    private int abilityPower;
    private int armor;
    private int magicResistance;
    private int moveSpeed;

    public Thresh() {
        this.damage = 45;
        this.abilityPower = 0;
        this.armor = 30;
        this.magicResistance = 33;
        this.moveSpeed = 335;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public int getAbilityPower() {
        return abilityPower;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getMagicResistance() {
        return magicResistance;
    }

    @Override
    public int getMoveSpeed() {
        return moveSpeed;
    }
}
