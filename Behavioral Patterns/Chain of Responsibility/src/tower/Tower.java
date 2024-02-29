package tower;

public class Tower {

    private int life;
    private int damage;
    private String sprite;

    public Tower() {
        this.life = 2000;
        this.damage = 50;
        this.sprite = "Regular Sprite";
    }

    protected void setSprite(String sprite) {
        this.sprite = sprite;
    }
}
