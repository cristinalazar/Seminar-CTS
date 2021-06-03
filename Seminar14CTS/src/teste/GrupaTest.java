package teste;

import clase.Grupa;
import clase.IStudent;
import clase.Student;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrupaTest {

    @Test
    public void testConstructorNumarGrupaCorect() {
        Grupa grupa=new Grupa(1081);
        assertEquals(1081, grupa.getNrGrupa());

    }

    @Test
    public void testConstructor() {
        Grupa grupa=new Grupa(1081);
        assertNotNull(grupa.getStudenti());

    }

    @Test(expected = IllegalArgumentException.class)
    public void TestExceptieConstructorInferior(){
        Grupa grupa = new Grupa(900);

    }


    @Test(expected = IllegalArgumentException.class)
    public void TestExceptieConstructorSuperior(){
        Grupa grupa = new Grupa(1200);

    }

    @Test(timeout = 500)
    public void testConstructorPerformance(){
        Grupa grupa=new Grupa(1081);
    }

    @Test
    public void testGetPromovabilitateRight(){
        Grupa grupa= new Grupa(1081);
        for(int i=0;i<10;i++){
            IStudent student=new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        for(int i=0;i<5;i++){
            IStudent student=new Student();
            student.adaugaNota(3);
            student.adaugaNota(6);
            grupa.adaugaStudent(student);
        }

        assertEquals(0.66f,grupa.getPromovabilitate(),0.1);

    }

    @Test
    public void testGetPromovabilitateLimitaInf(){
        Grupa grupa= new Grupa(1001);
        for(int i=0;i<5;i++) {
        IStudent student=new Student();
        student.adaugaNota(4);
        student.adaugaNota(7);
        grupa.adaugaStudent(student);
        }
        assertEquals(0, grupa.getPromovabilitate(),0.01);

    }

    @Test
    public void testGetPromovabilitateLimitaSup(){
        Grupa grupa= new Grupa(1001);
        for(int i=0;i<5;i++) {
            IStudent student=new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }
        assertEquals(1, grupa.getPromovabilitate(),0.01);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetPromovabilitateErrorCondition(){
        Grupa grupa=new Grupa(1050);
        grupa.getPromovabilitate();
    }


    //@Test(timeout = 500)
   // public void testGetPromovabilitatePerformance(){
    //    grupa.getPromovabilitate();

   // }


}