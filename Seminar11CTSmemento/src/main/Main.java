package main;

import clase.ManagerMemento;
import clase.Meci;

public class Main {


    public static void main(String[] args) {

        Meci meci=new Meci("cfr","otelu", 67,65,0,5);
        ManagerMemento managerMemento= new ManagerMemento();
        managerMemento.adaugaMemento(meci.creeazaMemento());


        meci.setNrSpectatori(54);
        managerMemento.adaugaMemento(meci.creeazaMemento());

        System.out.println(meci.toString());
        meci.seteazaMemento(managerMemento.cereUnMemento(0));
        meci.seteazaMemento(managerMemento.cereUltimulMemento());
        System.out.println(meci.toString());

    }

}