package teste;

import clase.Grupa;
import clase.IStudent;
import clase.Student;
import org.junit.Test;
import teste.mock.DummyStudent;
import teste.mock.FakeStudent;

import static org.junit.Assert.*;

public class TesteGrupaMock {

    @Test
    public void testAdaugaStudenti(){
        IStudent student=new DummyStudent();
        Grupa grupa=new Grupa(1022);

        grupa.adaugaStudent(student);

        assertEquals(1, grupa.getStudenti().size());

    }
    @Test
    public void testGetPromovabilitate(){
        IStudent student= new Student();
        Grupa gr= new Grupa(1080);
        gr.adaugaStudent(student);

        assertEquals(1,gr.getPromovabilitate(), 0.01);
    }


    @Test
    public void testGetPromovabilitateFakeStudent(){
        Grupa grupa= new Grupa(1081);
        for(int i=0;i<10;i++){
            FakeStudent student =new FakeStudent();
            student.setAreRestante(false);
            grupa.adaugaStudent(student);
        }

        for(int i=0;i<2;i++){
            FakeStudent student =new FakeStudent();
            student.setAreRestante(true);
            grupa.adaugaStudent(student);
        }


        assertEquals(0.8f,grupa.getPromovabilitate(), 0.01);
    }

}