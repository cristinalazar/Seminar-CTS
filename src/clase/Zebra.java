package clase;

public class Zebra extends Animal{

    private int varsta;

    public int getVarsta() {
        return varsta;
    }

    public Zebra(String name, int varsta) {
        super(name);
        this.varsta = varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Zebra(String name) {
        super(name);
        this.varsta = 5;
    }
}