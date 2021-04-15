package Decorator.clase;

public class DecoratorCuLaMultiAni extends DecoratorAbstract {

    public DecoratorCuLaMultiAni(INota nota) {
        super(nota);
    }

    public void printeazaFelicitare(){
        System.out.println("Felicitare: La multi ani");
    }


    public void printeaza() {
        super.printeaza();
        System.out.println("La multi ani");
    }
}
