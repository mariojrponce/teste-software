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
        boolean obtido = conta.isContaCorrente();

        assertEquals(esperado, obtido, "A conta deve ser instanciada como conta corrente");

    }

    @Test
    void getSaldoTotalAlto(){
        final double saldo = 1000, limite = 1000;
        final double esperado = 2000;
        conta.setSaldo(saldo);
        conta.setLimite(limite);
        final double obtido = conta.getSaldoTotal();
        assertEquals(esperado, obtido);
    }

    @Test
    void getSaldoTotalBaixo(){
        final double saldo = 0.1, limite = 0.2;
        final double esperado = 0.3;
        conta.setSaldo(saldo);
        conta.setLimite(limite);
        final double obtido = conta.getSaldoTotal();
        assertEquals(esperado, obtido, 0.0001);
    }

    @Test
    void getNumeroConta(){
        final String esperado = "999999";
        conta.setNumero(esperado);
        final String obtido = conta.getNumero();
        assertEquals(esperado, obtido);
    }

}
