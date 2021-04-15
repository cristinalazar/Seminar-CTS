package Decorator.clase;

public class DecoratorPasteFericit extends DecoratorAbstract {

    public DecoratorPasteFericit(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felicitare: Paste Fericit!");
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("Paste Fericit!");
    }
}
