package minion;

public class MinionModel {

    private String color;
    private byte[] sprite;

    public MinionModel(String color) {
        this.color = color;
        this.sprite = new byte[(int) 1 * 1024 * 1024];
    }
}
