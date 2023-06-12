package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    private Cliente cliente;

    //Para ficar obvio de que vai ser criado um novo cliente a cada teste
    @BeforeEach
    void beforeEach(){//O nome do metodo não importa, muitos utilizam
        cliente = new Cliente();
    }

    @Test
    void setCpfNaoNulo() {
        //cpf gerador de cpf
        final String esperado = "91124374094";
        cliente.setCpf(esperado);
        final String obtido = cliente.getCpf();
        assertEquals(esperado, obtido);
    }

    @Test
    void setCpfNulo() {
        final String esperado = "";
        cliente.setCpf(esperado);

        assertThrows(NullPointerException.class, () -> cliente.setCpf(null));

        final var obtido = cliente.getCpf();
        assertEquals(esperado, obtido);

    }

    @Test
    void setCpfDigitosIgual() {
        final String esperado = "1111";

        assertThrows(IllegalArgumentException.class, () -> cliente.setCpf(esperado));

        final var obtido = cliente.getCpf();
        assertNotEquals(esperado, obtido);
    }

    @Test
    void setNomeVazioR3() {
        final String invalido = "";

        assertThrows(IllegalArgumentException.class, () -> cliente.setNome(invalido));

        assertNotEquals(invalido, cliente.getNome());
    }

    @Test
    void setNomeSemSobrenomeR4() {
        final String invalido = "";

        assertThrows(IllegalArgumentException.class, () -> cliente.setNome(invalido));

        assertNotEquals(invalido, cliente.getNome());
    }

}