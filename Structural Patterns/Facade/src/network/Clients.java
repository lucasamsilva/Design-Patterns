package network;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clients {

    private List<String> clientsIps;

    public Clients() {
        this.clientsIps = new ArrayList<>();
    }

    public void add(String... ips) {
        clientsIps.addAll(Arrays.stream(ips).toList());
    }

    public List<String> getClientsIps() {
        return clientsIps;
    }
}
