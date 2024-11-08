package tp_5ingsoftware;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class parameterTest  {

    private final calculador calculador = new calculador();

    private double x;
    private double y;
    private double expected;
                     
    public parameterTest (double x, double y, double expected) {
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][]{
            {8.0, 7.0, 15.0},
            {2.0, 0.0, 20.0},
            {10.0, 1.0, 11.0},
            {10.0, -1, -9}
        });
    }

    @Test
    public void testSuma() {
        Assert.assertEquals(expected, calculador.sumar(x, y), 0.001);
    }
}
