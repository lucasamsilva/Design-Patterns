import champion.Riven;
import skills.Skill;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class CommandApplication {

    private static Map<Character, Skill> skillButtons = new HashMap<>();

    public static void main(String[] args) {
        var riven = new Riven();
        mapButtonToSkill('Q', riven.getFirstSkill());
        mapButtonToSkill('W', riven.getSecondSkill());
        mapButtonToSkill('E', riven.getThirdSkill());
        mapButtonToSkill('R', riven.getUltimateSkill());
        mapButtonToSkill('Z', riven.getFirstSkill());
        mapButtonToSkill('X', riven.getSecondSkill());
        mapButtonToSkill('C', riven.getThirdSkill());
        mapButtonToSkill('V', riven.getUltimateSkill());
        riven.useSkill(pressButton('Q'));
        riven.useSkill(pressButton('W'));
        riven.useSkill(pressButton('E'));
        riven.useSkill(pressButton('P'));
        riven.useSkill(pressButton('V'));
    }

    private static void mapButtonToSkill(Character button, Skill skill) {
        skillButtons.put(button, skill);
    }

    private static Skill pressButton(Character button) {
        var skill = skillButtons.get(button);
        if(isNull(skill)) {
            System.out.println("Button not associated with a skill");
            return null;
        } else {
            return skill;
        }
    }
}
