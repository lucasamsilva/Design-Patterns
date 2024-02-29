import player.proxy.PlayerProxy;

public class ProxyApplication {

    public static void main(String[] args) {
        var player = new PlayerProxy("Summoner123");

        player.login();
        player.playGame();
    }

}
