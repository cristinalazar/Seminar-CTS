package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class IReader {

    public IReader(String filePath) {
        this.filePath = filePath;
    }

    protected String filePath;
    public abstract List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException;
}
