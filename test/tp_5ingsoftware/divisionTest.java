/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_5ingsoftware;

import static jdk.nashorn.internal.objects.NativeRegExp.test;
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
public class divisionTest {
    private final calculador calculador = new calculador();

    @Test (expected = ArithmeticException.class)
    public void testDivisionCero() {
        System.out.println("Dividiendo por 0");
        calculador.dividir(0, 0);
    }
}
