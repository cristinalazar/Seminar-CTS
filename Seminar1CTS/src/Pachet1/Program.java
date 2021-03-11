package Pachet1;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Program {
    public static void main(String[] args){

        Zoo zoo = new Zoo();

        Girafa girafa1 = new Girafa("Girafa 1");
        Girafa girafa2 = new Girafa("Girafa 2");

        zoo.adaugaAnimal(girafa1);
        zoo.adaugaAnimal(girafa2);


        Zebra zebra1 = new Zebra("Zebra 1",4 );
        Zebra zebra2 = new Zebra("Zebra 2",4 );

        zoo.adaugaAnimal(zebra1);
        zoo.adaugaAnimal(zebra2);


        zoo.feedAllAnimals();

    }
}
