package champion;

import skills.DamageSkill;
import skills.DashSkill;
import skills.Skill;
import skills.StunSkill;

import static java.util.Objects.isNull;

public class Riven {

    private Skill firstSkill;
    private Skill secondSkill;
    private Skill thirdSkill;
    private Skill ultimateSkill;

    public Riven() {
        firstSkill = new DamageSkill();
        secondSkill = new StunSkill();
        thirdSkill = new DashSkill();
        ultimateSkill = new DamageSkill();
    }

    public Skill getFirstSkill() {
        return firstSkill;
    }

    public Skill getSecondSkill() {
        return secondSkill;
    }

    public Skill getThirdSkill() {
        return thirdSkill;
    }

    public Skill getUltimateSkill() {
        return ultimateSkill;
    }

    public void useSkill(Skill skill) {
        if(isNull(skill)) return;
        skill.doAction();
    }
}
