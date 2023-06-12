package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    private Conta conta;

    @BeforeEach
    void inicializar(){
        conta = new Conta();
    }

    @Test
    void contaCriadaComoContaCorrenteR02() {
        boolean esperado = true;
        Conta conta = new Conta();
        boolean obtido = conta.isContaCorrente();

        assertEquals(esperado, obtido, "A conta deve ser instanciada como conta corrente");

    }
}