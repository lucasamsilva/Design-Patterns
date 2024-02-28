package character;

import color.Color;

public class Riven implements Character {

    private Color color;

    public Riven(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String firstSkill() {
        return "Broken Wings";
    }

    @Override
    public String secondSkill() {
        return "Ki Burst";
    }

    @Override
    public String thirdSkill() {
        return "Valor";
    }

    @Override
    public String ultimateSkill() {
        return "Blade of the Exile";
    }
}
