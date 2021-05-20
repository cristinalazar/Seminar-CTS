package clase;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testConstructorCuParametru(){
        String nume="Costel";
        Student student=new Student(nume) ;

    assertEquals(nume, student.getNume());
    assertNotNull(student.getNote());
    }

    @Test
    public void testConstructorFaraParametri(){
        Student student= new Student();

        assertNotNull(student.getNote());
        assertNotNull(student.getNume());
    }


    @Test
    public void testAdaugaNota(){
        Student student=new Student();

        int nota=5;
        student.adaugaNota(nota);
        assertEquals(nota, student.getNota(0));
    }

    @Test
    public void testAdaugaNotaDimensiune(){

        Student student=new Student();

        student.adaugaNota(7);

        student.adaugaNota(8);

        assertEquals(2,student.getNote().size());
    }


    @Test
    public void testCalculeazaMedieNote(){
        Student student=new Student();
        student.adaugaNota(7);
        student.adaugaNota(8);

        assertEquals(7.5,student.calculeazaMedie(),0.1);
    }

    @Test
    public void testCalculeazaMedieFaraNote(){
        Student student=new Student();

        assertEquals(0,student.calculeazaMedie(),0.1);
    }

    @Test
    public void testCalculeazaMedieONota(){
        Student student=new Student();
        student.adaugaNota(7);

        assertEquals(7,student.calculeazaMedie(),0.1);
    }

    @Test
    public void testAreRestante(){
        Student student=new Student();
        student.adaugaNota(2);
        student.adaugaNota(3);

        assertTrue(student.areRestante());
    }

    public void testNuAreRestante(){
        Student student=new Student();
        student.adaugaNota(2);
        student.adaugaNota(3);

        assertFalse(student.areRestante());
    }


}