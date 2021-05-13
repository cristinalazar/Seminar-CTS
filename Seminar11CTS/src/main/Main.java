package main;

import clase.Client;
import clase.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager= new Manager();
        Client client1= new Client("Dan");
        Client client2= new Client("Dana");
        Client client3= new Client("Danut");

        manager.adaugaObservator(client1);
        manager.adaugaObservator(client2);
        manager.adaugaObservator(client3);

        manager.anuntaMeci("handbal");

        manager.stergeObservator(client3);

        manager.anuntaMeci("baschet");

    }
}
