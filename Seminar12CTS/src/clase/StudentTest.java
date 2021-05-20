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

        assertNotNull("Atributul note nu a fost initializat",student.getNote());
        assertNotNull("Atributul nume nu a fost initializat",student.getNume());
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

    @Test
    public void testGetNotaExceptie(){
        Student student= new Student();
        student.adaugaNota(8);
        student.adaugaNota(5);

        try{
            student.getNota(5);
            fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie");
        } catch(IndexOutOfBoundsException e){

        }
        catch (Exception e){
            fail("Metoda arunca o alta exceptie");
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNotaExceptieV5(){
        Student student= new Student();
        student.adaugaNota(8);
        student.adaugaNota(5);

       // assertThrows(IndexOutOfBoundsException.class ()->{student.getNota(5)});

    }




}