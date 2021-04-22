package Clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> clienti;

    public FlyweightFactory() {
        this.clienti =new HashMap<>();
    }


    public Flyweight getFlyweight(String nrTelefon) {
        if(clienti.containsKey(nrTelefon)) {
            return clienti.get(nrTelefon);
        } else {
            Client client=new Client("Sasha", nrTelefon, "sasha@protonmail.com");
            clienti.put(nrTelefon,client);
            return client;

        }


    }

}
