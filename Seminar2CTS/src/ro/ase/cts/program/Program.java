package ro.ase.cts.program;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.IReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {


	public static List<Aplicant> citesteAplicanti(IReader readAplicant) throws FileNotFoundException{
		return readAplicant.readAplicants();
	}

	public static void main(String[] args) {
		System.out.println("Suma finantare pt angajati "+Angajat.getSumaFinantare());
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new AngajatiReader("angajati.txt"));
			Proiect proiect=new Proiect(81);
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantata());

				aplicant.statut(proiect);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}