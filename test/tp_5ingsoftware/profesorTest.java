/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_5ingsoftware;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gonza
 */
public class profesorTest {
   static profesor  profe;
    static ArrayList<Materia> materias;
    public profesorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        profe = new profesor("Ricardo");
        materias= new ArrayList<>();
        Materia m1 = new Materia("Ing. software", 5);
        Materia m2 = new Materia("Matematicas", 3);
        Materia m3 = new Materia("Laboratorio", 7);
        materias.add(m1);
        materias.add(m2);
        materias.add(m3);
        profe.setMaterias(materias);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCalcularCarga() {
        System.out.println("Calcular carga del profesor...");
        int exResult=15;
        int result= profe.calcularCarga(materias);
        assertEquals(exResult, result);
    }
    @Test
    public void testRepartirGrupo(){
        System.out.println("Repartir grupo");
        int alumnos=32;
        int profesores=4;
        int expResult=8;
        int result = profe.repartirGrupo(alumnos, profesores);
        assertEquals(expResult,result);
    }
    
}
