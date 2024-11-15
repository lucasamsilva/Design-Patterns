package item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComposedItem extends BasicItem {

    private List<Item> itemsToBuild;

    public ComposedItem(String name, int attackDamage, int abilityPower, int armor, int magicResistance, int health, int abilityHaste) {
        super(name, attackDamage, abilityPower, armor, magicResistance, health, abilityHaste);
        itemsToBuild = new ArrayList<>();
    }

    public List<Item> getItemsToBuild() {
        return itemsToBuild;
    }

    public void add(Item... item) {
        itemsToBuild.addAll(Arrays.stream(item).toList());
    }

    @Override
    public int getAttackDamage() {
        return itemsToBuild.stream()
                .map(Item::getAttackDamage)
                .reduce(0, Integer::sum) + super.getAttackDamage();
    }

    @Override
    public int getAbilityPower() {
        return itemsToBuild.stream()
                .map(Item::getAbilityPower)
                .reduce(0, Integer::sum) + super.getAbilityPower();
    }

    @Override
    public int getArmor() {
        return itemsToBuild.stream()
                .map(Item::getArmor)
                .reduce(0, Integer::sum) + super.getArmor();
    }

    @Override
    public int getMagicResistance() {
        return itemsToBuild.stream()
                .map(Item::getMagicResistance)
                .reduce(0, Integer::sum) + super.getMagicResistance();
    }

    @Override
    public int getHealth() {
        return itemsToBuild.stream()
                .map(Item::getHealth)
                .reduce(0, Integer::sum) + super.getHealth();
    }

    @Override
    public int getAbilityHaste() {
        return itemsToBuild.stream()
                .map(Item::getAbilityHaste)
                .reduce(0, Integer::sum) + super.getAbilityHaste();
    }
}
