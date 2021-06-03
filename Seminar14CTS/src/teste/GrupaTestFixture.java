package teste;

import clase.Grupa;
import clase.IStudent;
import clase.Student;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GrupaTestFixture {

    private Grupa grupa;

    @Before
    public void setup() {

        grupa = new Grupa(1001);
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }


    }
}