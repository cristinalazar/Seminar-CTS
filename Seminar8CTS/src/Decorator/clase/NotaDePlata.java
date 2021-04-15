package Decorator.clase;

public class NotaDePlata implements INota {
    private int sumaDePlata;

    public NotaDePlata(int sumaDePlata) {
        this.sumaDePlata=sumaDePlata;

    }


    public float getSumaDePlata() {
        return sumaDePlata;
    }

    public void printeaza() {
        System.out.println(String.format("S-a printat nota cu suma: %d",sumaDePlata));
    }
}
