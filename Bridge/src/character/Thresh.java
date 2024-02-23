package character;

import color.Color;

public class Thresh implements Character {

    private Color color;

    public Thresh(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String firstSkill() {
        return "Death Sentence";
    }

    @Override
    public String secondSkill() {
        return "Dark Passage";
    }

    @Override
    public String thirdSkill() {
        return "Flay";
    }

    @Override
    public String ultimateSkill() {
        return "The Box";
    }
}
