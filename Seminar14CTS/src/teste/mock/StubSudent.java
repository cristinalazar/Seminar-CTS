package teste.mock;

import clase.IStudent;

import java.util.List;

public class StubSudent implements IStudent {
    @Override
    public String getNume() {
        return null;
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return null;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return 0;
    }

    @Override
    public int getNota(int index) {
        return 9;
    }

    @Override
    public boolean areRestante() {
        return false;
    }
}