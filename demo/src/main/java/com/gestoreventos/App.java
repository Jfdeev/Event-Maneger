package com.gestoreventos;

public class App {
    public static void main( String[] args ){

        GestorEventos gestor = new GestorEventos();

        gestor.cadastrarEvento("Show de Rock", "25/10/2024", "Estádio Central", 5000, "VIP");
        gestor.cadastrarEvento("Conferência de TI", "15/11/2024", "Centro de Convenções", 300, "Camarote");

        gestor.gerarRelatorioCSV("relatorio_eventos.csv");
}
}

