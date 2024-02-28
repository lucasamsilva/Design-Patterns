package items;

import interfaces.HasStats;

public abstract class ItemsDecorator implements HasStats {

    private HasStats statsObject;

    private int damage;
    private int abilityPower;
    private int armor;
    private int magicResistance;
    private int moveSpeed;

    protected ItemsDecorator(HasStats statsObject, int damage, int abilityPower, int armor, int magicResistance, int moveSpeed) {
        this.statsObject = statsObject;
        this.damage = damage;
        this.abilityPower = abilityPower;
        this.armor = armor;
        this.magicResistance = magicResistance;
        this.moveSpeed = moveSpeed;
    }

    @Override
    public int getDamage() {
        return damage + statsObject.getDamage();
    }

    @Override
    public int getAbilityPower() {
        return abilityPower + statsObject.getAbilityPower();
    }

    @Override
    public int getArmor() {
        return armor + statsObject.getArmor();
    }

    @Override
    public int getMagicResistance() {
        return magicResistance + statsObject.getMagicResistance();
    }

    @Override
    public int getMoveSpeed() {
        return moveSpeed + statsObject.getMoveSpeed();
    }

    public void showStats() {
        System.out.println("Damage: " + getDamage());
        System.out.println("Ability Power: " + getAbilityPower());
        System.out.println("Armor: " + getArmor());
        System.out.println("Magic Resistance: " + getMagicResistance());
        System.out.println("Move Speed: " + getMoveSpeed());
    }
}
