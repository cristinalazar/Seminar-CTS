package teste.mock;

import clase.IStudent;

import java.util.List;

public class FakeStudent implements IStudent {
    private String nume;
    private List<Integer> listaNote;
    private float medie;
    private int nota;
    private boolean areRestante;

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return this.listaNote;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    public void setAreRestante(boolean areRestante) {
        this.areRestante= areRestante;
    }

    @Override
    public float calculeazaMedie() {
        return medie;
    }

    @Override
    public int getNota(int index) {
        return nota;
    }

    @Override
    public boolean areRestante() {
        return areRestante;
    }
}
