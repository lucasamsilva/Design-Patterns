package player;

public class PlayerImpl implements Player{

    private String name;

    public PlayerImpl(String name) {
        this.name = name;
    }

    @Override
    public void playGame() {
        System.out.println(name + " is playing a game.");
    }

    @Override
    public void login() {
        System.out.println(name + " logged in to the game.");
    }

}
