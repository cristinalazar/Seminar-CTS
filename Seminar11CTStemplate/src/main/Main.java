package main;

import clase.Spectator;
import clase.SpectatorAbstract;
import clase.SpectatorVIP;

public class Main {
    public static void main(String[] args) {
        SpectatorAbstract spectator1=new Spectator("Ioan");
        SpectatorAbstract spectator2=new SpectatorVIP("iON");

        spectator1.intrareInStadion();
        spectator2.intrareInStadion();


    }
}
