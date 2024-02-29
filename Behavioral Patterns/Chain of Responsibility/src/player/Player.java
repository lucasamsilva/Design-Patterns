package player;

import java.util.Random;

public class Player {

    private String name;
    private String ip;

    public Player(String name, String ip) {
        this.name = name;
        this.ip = ip;
    }

    public void connect() {
        System.out.println("Connecting Player");
        var randomValue = new Random().nextDouble();
        if(randomValue <= 0.05) {
            throw new RuntimeException("Error connecting player: " + name);
        }
    }
}
