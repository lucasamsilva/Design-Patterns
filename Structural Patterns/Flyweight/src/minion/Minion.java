package minion;

public class Minion {

    private int damage;
    private int life;
    private MinionModel model;

    public Minion(MinionModel model) {
        this.damage = 15;
        this.life = 200;
        this.model = model;
    }


}
