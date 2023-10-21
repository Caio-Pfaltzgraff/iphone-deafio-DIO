package com.apple;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {
    private boolean ligado;
    private Musica musicaAtual;
    private Chamada chamadaAtual;
    private List<Aba> abasNavegador = new ArrayList<>(); // Inicialize a lista aqui

    public void ligar() {
        ligado = true;
        System.out.println("iPhone ligado");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void selecionarMusica(Musica musica) {
        musicaAtual = musica;
        System.out.println("Música selecionada: " + musica.getTitulo());
    }

    @Override
    public void tocarMusica() {
        if (musicaAtual != null) {
            System.out.println("Tocando música: " + musicaAtual.getTitulo());
        } else {
            System.out.println("Nenhuma música selecionada para tocar");
        }
    }

    @Override
    public void adicionarNovaAba(Aba aba) {
        abasNavegador.add(aba);
        System.out.println("Aba adicionada: " + aba.getTitulo());
    }

    @Override
    public void atualizarPagina(Aba aba) {
        System.out.println("Página atualizada: " + aba.getUrl());
    }

    @Override
    public void desligar() {
        System.out.println("iPhone desligado");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada");
    }
}
