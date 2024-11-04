package com.gestoreventos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
    private GestorEventos gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorEventos();
        gestor.cadastrarEvento("Show de Rock", "25/10/2024", "Estádio Central", 5000, "VIP");
        gestor.cadastrarEvento("Conferência de TI", "15/11/2024", "Centro de Convenções", 300, "Camarote");
    }

    @Test
    public void testCadastrarEvento() {
        // Teste se o evento foi cadastrado corretamente
        assertEquals(2, gestor.getEventos());// Você precisará de um método getTotalEventos()
    }

    @Test
    public void testInscreverParticipante() {
        // Testa a inscrição em um evento com vagas disponíveis
        boolean inscricao = gestor.inscreverEmEvento("Show de Rock");
        assertTrue("Inscrição deve ser bem-sucedida", inscricao);
        
        // Testa se a vaga foi reduzida
        assertEquals(4999, gestor.getEventos()[0].getVagasDisponiveis()); // Supondo que você tenha um método getEventos()
    }

    @Test
    public void testInscricaoEventoEsgotado() {
        // Inscrever participantes até esgotar as vagas
        for (int i = 0; i < 5000; i++) {
            gestor.inscreverEmEvento("Show de Rock");
        }
        
        // Tentativa de inscrição quando o evento está esgotado
        boolean inscricao = gestor.inscreverEmEvento("Show de Rock");
        assertFalse("Inscrição não deve ser bem-sucedida, evento esgotado", inscricao);
    }

    @Test
    public void testBuscarEvento() {
        // Teste a busca por evento
        Eventos evento = gestor.buscarEventoPorNome("Evento Inexistente");
        assertNull("O evento não deve ser encontrado", evento);
    }
}

