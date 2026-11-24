package com.teste.guarda_roupa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

public class GuardaRoupaTest {
    @InjectMocks
    private GuardaRoupa guardaRoupa;
    private double orcamento;

    @BeforeEach
    void setUp(){
        orcamento = 1000;
        guardaRoupa = new GuardaRoupa(orcamento);
    }


    @Test
    void precoComDesconto(){
        assertEquals(guardaRoupa.precoComDesconto(100, 10), 90);
    }

    @Test
    void descontoComPorcentagemNegativa(){

        assertFalse(100 < guardaRoupa.precoComDesconto(100, -100));
    }

    @Test
    void cabeNoOrcamento(){
        assertFalse(guardaRoupa.cabeNoOrcamento(10000));
        assertTrue(guardaRoupa.cabeNoOrcamento(100));
    }

    @Test
    void CabeNoOrcamentoComValorDoOrcamento(){
        assertTrue(guardaRoupa.cabeNoOrcamento(1000));
    }

    @Test
    void ehDeGala(){
        assertTrue(guardaRoupa.ehDeGala(500));
        assertFalse(guardaRoupa.ehDeGala(100));
    }

    @Test
    void ehDeGalaComValorLimite(){
        assertFalse(guardaRoupa.ehDeGala(200));
    }

    @Test
    void registraCompra(){
        double valor = 500;
        guardaRoupa.registrarCompra(valor);

        assertEquals(guardaRoupa.getOrcamento(), 500);
    }

    @Test
    void registrarCompraComValorMaiorOrcamento(){
        double valor = 5000;
        guardaRoupa.registrarCompra(valor);

        assertTrue(guardaRoupa.getOrcamento() >= 0);
    }
}
