package item;

public class BasicItem implements Item {

    private String name;
    private int attackDamage;
    private int abilityPower;
    private int armor;
    private int magicResistance;
    private int health;
    private int abilityHaste;

    public BasicItem(String name, int attackDamage, int abilityPower, int armor, int magicResistance, int health, int abilityHaste) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.abilityPower = abilityPower;
        this.armor = armor;
        this.magicResistance = magicResistance;
        this.health = health;
        this.abilityHaste = abilityHaste;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAttackDamage() {
        return attackDamage;
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
    public int getHealth() {
        return health;
    }

    @Override
    public int getAbilityHaste() {
        return abilityHaste;
    }

    @Override
    public void printStats() {
        System.out.println("----------------------------------");
        System.out.println("Item name: " + this.getName());
        System.out.println("Damage: " + this.getAttackDamage());
        System.out.println("Ability Power: " + this.getAbilityPower());
        System.out.println("Armor: " + this.getArmor());
        System.out.println("Magic Resistance: " + this.getMagicResistance());
        System.out.println("Health: " + this.getHealth());
        System.out.println("Ability Haste: " + this.getAbilityHaste());
    }
}
