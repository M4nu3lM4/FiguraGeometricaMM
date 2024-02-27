package org.example;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiguraTest {
    @Test
    public void tipoFiguraTest() {
        assertEquals("cuadrado", Figura.tipoFigura(5, 5));
        assertEquals("rectángulo", Figura.tipoFigura(4, 6));
    }

    @Test
    public void calculoPerimetroTest() {
        assertEquals(20, Figura.CalculoPerimetro(5, 5));
        assertEquals(20, Figura.CalculoPerimetro(4, 6));
    }
}