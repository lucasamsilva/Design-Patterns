import facade.CreateGameFacade;

public class FacadeApplication {

    public static void main(String[] args) {
        var createGameFacade = new CreateGameFacade();
        createGameFacade.createGame("192.168.0.1", "192.168.0.2", "192.168.0.3", "192.168.0.4");
    }

}
