package clase;

public class SpectatorVIP extends SpectatorAbstract{

    private String nume;
    public SpectatorVIP(String nume) {
        super();
        this.nume=nume;
    }

    @Override
    public void asezareLaCoada() {

        System.out.println("Spectatorul" +this.nume+ "nu a mai stat  la coada");
    }

    @Override
    public void prezentareBilet() {
        System.out.println("Spectatorul" +this.nume+ "a prezentatbiletul VIP");

    }

    @Override
    public void realizareControlCorporal() {
        System.out.println("Spectatorul" +this.nume+ "a facut controlul");

    }

    @Override
    public void ocupareLoc() {
        System.out.println("Spectatorul" +this.nume+ "a ocupat loc pt VIP");

    }
}
