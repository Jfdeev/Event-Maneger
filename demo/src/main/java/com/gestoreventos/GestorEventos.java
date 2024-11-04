package com.gestoreventos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class GestorEventos {
    private List<Eventos> eventos;
    private int quantidadeEventos;

    public GestorEventos() {
        eventos = new ArrayList<>();
        quantidadeEventos = 0;
    }

    public void cadastrarEvento(String nome, String data, String local, int capacidadeMaxima, String categoria) {
        eventos.add(new Eventos(nome, data, local, capacidadeMaxima, categoria));
        quantidadeEventos++;
    }

    public void listarEventos() {
        for (int i = 0; i < quantidadeEventos; i++) {
            System.out.println(eventos.get(i));
            System.out.println("-----------"); 
        }
    }

    public Eventos buscarEventoPorNome(String nome) {
        for (Eventos evento : eventos) {
            if (evento.getNome().equals(nome)) {
                return evento;
            }
        }
        return null;
    }

    public boolean inscreverEmEvento(String nome) {
        for (Eventos evento : eventos) {
            if (evento.getNome().equals(nome) && evento.getVagasDisponiveis() > 0) {
                evento.inscreverParticipante();
                return true;
            }
        }
        return false;
    }

    public int getTotalEventos() {
        return quantidadeEventos;
    }

    public Eventos[] getEventos() {
        return eventos.toArray(new Eventos[0]);
    }

    // Novo método para gerar o relatório CSV
    public void gerarRelatorioCSV(String caminhoArquivo) {
        try (FileWriter fw = new FileWriter(caminhoArquivo);
             PrintWriter pw = new PrintWriter(fw)) {
            
            // Cabeçalho do CSV
            pw.println("Nome do Evento,Data,Local,Capacidade Máxima,Inscritos,Vagas Disponíveis,Categoria");
            
            // Adicionando os dados dos eventos
            for (Eventos evento : eventos) {
                pw.println(evento.getNome() + "," + 
                           evento.getData() + "," + 
                           evento.getLocal() + "," + 
                           evento.getVagasDisponiveis() + "," + 
                           evento.getCategoria());
            }
            System.out.println("Relatório CSV gerado com sucesso: " + caminhoArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao gerar o relatório CSV: " + e.getMessage());
        }
    }
}