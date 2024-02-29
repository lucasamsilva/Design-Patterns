package minion;

public class Minion {

    private int life;
    private int damage;
    private String sprite;

    public Minion() {
        this.life = 200;
        this.damage = 15;
        this.sprite = "regular sprite";
    }

    protected void setSprite(String sprite) {
        this.sprite = sprite;
    }
}
