package ro.ase.cts.Builder.clase;

public class RezervareBuilder implements AbstractBuilder {
    private Rezervare rezervare;

    public RezervareBuilder() {
        this.rezervare = new Rezervare(0,false,false,false,false,"N/A");
    }

    public RezervareBuilder(int codRezervare) {
        this.rezervare = new Rezervare(codRezervare,false,false,false,false,"N/A");
    }

    public RezervareBuilder setCodRezervare(int codRezervare){
        rezervare.setCodRezervare(codRezervare);
        return this;

    }

    public RezervareBuilder setAreMancare(boolean areMancare){
        rezervare.setAreMancare(areMancare);
        return this;

    }

    public RezervareBuilder setAreScaun(boolean areScaun){
        rezervare.setAreScaunErgonomic(areScaun);
        return this;

    }

    public RezervareBuilder setAreBautura(boolean areBautura){
        rezervare.setAreBautura(areBautura);
        return this;

    }

    public RezervareBuilder setAreMuzica(boolean areMuzica){
        rezervare.setAreMuzicaAmbientala(areMuzica);
        return this;

    }

    public RezervareBuilder setgenMuzica(String genMuzica){
        rezervare.setGenMuzica(genMuzica);
        return this;

    }

    public Rezervare build() {
        return this.rezervare;
    }
}
