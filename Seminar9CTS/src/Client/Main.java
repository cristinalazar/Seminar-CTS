package Client;

import Clase.Client;
import Clase.Flyweight;
import Clase.FlyweightFactory;
import Clase.Rezervare;

public class Main {
    public static void main(String[] args) {

        Rezervare rezervare1=new Rezervare(10,5,15);
        Rezervare rezervare2=new Rezervare(11,2,16);
        Rezervare rezervare3=new Rezervare(12,3,17);
        Rezervare rezervare4=new Rezervare(13,4,17);


        FlyweightFactory flyweightFactory=new FlyweightFactory();
        Flyweight client1=flyweightFactory.getFlyweight("112");
        client1.printeazaRezervare(rezervare1);

        flyweightFactory.getFlyweight("112").printeazaRezervare(rezervare2);
        flyweightFactory.getFlyweight("911").printeazaRezervare(rezervare3);
        flyweightFactory.getFlyweight("911").printeazaRezervare(rezervare4);
    }
}
