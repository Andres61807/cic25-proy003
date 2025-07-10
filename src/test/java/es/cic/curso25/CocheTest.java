package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CocheTest {

    private Coche cut;

    @BeforeEach
    private void setUp(){
        cut=new Coche();
    }

    @Test
    void testAcelerar() {
        cut.acelerar(10);
        cut.acelerar(90);
        
        int velocidadFinal=cut.getVelocidad();
        assertEquals(100, velocidadFinal);
    }

    @Test
    void testFrenar() {
        cut.acelerar(10);
        cut.acelerar(90);

        cut.frenar(50);
        int velocidadFinal=cut.getVelocidad();

        assertEquals(50, velocidadFinal);
    }

    @Test
    void testGetConsumo() {
        cut.acelerar(50);

        double consumoActual=cut.getConsumo();

        assertEquals(2.15, consumoActual);
    }

    
}
