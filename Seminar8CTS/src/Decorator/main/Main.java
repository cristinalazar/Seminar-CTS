package Decorator.main;

import Decorator.clase.DecoratorAbstract;
import Decorator.clase.DecoratorCuLaMultiAni;
import Decorator.clase.DecoratorPasteFericit;
import Decorator.clase.NotaDePlata;

public class Main {

    public static void main(String[] args) {
        NotaDePlata notaInitiala=new NotaDePlata(55);
        notaInitiala.printeaza();

        DecoratorAbstract decoLMA=new DecoratorCuLaMultiAni(notaInitiala);
        decoLMA.printeazaFelicitare();
        decoLMA.printeaza();

        DecoratorAbstract decoPaste= new DecoratorPasteFericit(notaInitiala);
        decoPaste.printeaza();

        NotaDePlata notaDePlata= new NotaDePlata(150);



        DecoratorAbstract decoLMA2=new DecoratorCuLaMultiAni(notaDePlata);
        DecoratorAbstract decoPaste2= new DecoratorPasteFericit(decoLMA2);
        decoPaste2.printeaza();
    }
}
