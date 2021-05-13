package clase;

public class Spectator extends SpectatorAbstract{
    private String nume;

    public Spectator(String nume) {
        super();
        this.nume = nume;
    }

    @Override
    public void asezareLaCoada() {

        System.out.println("Spectatorul" +this.nume+ "s a asezat la coada");
    }

    @Override
    public void prezentareBilet() {
        System.out.println("Spectatorul" +this.nume+ "a prezentatbiletul");

    }

    @Override
    public void realizareControlCorporal() {
        System.out.println("Spectatorul" +this.nume+ "a facut controlul");

    }

    @Override
    public void ocupareLoc() {
        System.out.println("Spectatorul" +this.nume+ "a ocupat loc");

    }
}
