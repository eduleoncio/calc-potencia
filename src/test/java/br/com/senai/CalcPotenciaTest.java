package br.com.senai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalcPotenciaTest {
    private final CalcPotencia calculadora = new CalcPotencia();

    @Test
    void calculaPotenciaComTensaoECorrenteValidas() {
        assertEquals(1100.0, calculadora.calcularPotencia(220, 5), 0.001);
    }

    @Test
    void rejeitaCorrenteNegativa() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.calcularPotencia(220, -1));
    }
}
