package ro.ase.cts.clase;

public class Medic extends PersonalSpital{

    public Medic(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append(getNume());
        return sb.toString();
    }
}
