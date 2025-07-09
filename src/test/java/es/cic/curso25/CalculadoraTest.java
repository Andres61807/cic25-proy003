package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        // Preparo
        Calculadora cut = new Calculadora();

        // Ejecuto
        cut.sumar(5.6);
        cut.sumar(3.4);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(9, valorActual, 0.000001);
    }

    @Test
    public void testRestar(){
        Calculadora calc=new Calculadora();

        calc.restar(10);

        double resultado=calc.getTotal();

        assertEquals(-10,resultado,0.00001);
    }

    @Test
    public void testMultiplicar(){
        Calculadora calc=new Calculadora();

        calc.multiplicar(10);

        double resultado=calc.getTotal();

        assertEquals(0,resultado,0.00001);
    }

    @Test
    public void testDividir(){
        Calculadora calc=new Calculadora();

        calc.multiplicar(0);

        double resultado=calc.getTotal();

        assertEquals(0,resultado,0.00001);
    }
}
