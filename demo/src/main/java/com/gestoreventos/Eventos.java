package com.gestoreventos;

public class Eventos {
    private String nome;
    private String data;
    private String local;
    private int capacidadeMaxima;
    private int inscritos;
    private String categoria;

    public Eventos(String nome, String data, String local, int capacidadeMaxima, String categoria) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidadeMaxima = capacidadeMaxima;
        this.inscritos = 0;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public int getVagasDisponiveis() {
        return capacidadeMaxima - inscritos;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public int getInscritos() {
        return inscritos;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean inscreverParticipante() {
        if (inscritos < capacidadeMaxima) {
            inscritos++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nData: " + data + "\nLocal: " + local +
               "\nVagas Disponíveis: " + getVagasDisponiveis() + "\nCategoria: " + categoria;
    }
}