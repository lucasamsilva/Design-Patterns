package facade;

import game.GameManager;
import network.Clients;
import network.Connection;
import network.Server;

public class CreateGameFacade {

    private GameManager gameManager;
    private Clients clients;
    private Connection connection;
    private Server server;

    public CreateGameFacade() {
        this.gameManager = new GameManager();
        this.clients = new Clients();
        this.connection = new Connection();
        this.server = new Server();
    }

    public void createGame(String... clientsIps) {
       clients.add(clientsIps);
       clients.getClientsIps().forEach(clientIp -> connection.createConnection(clientIp));
       server.connectToServer(clients);
       gameManager.createGame("Foo", server);
    }
}
