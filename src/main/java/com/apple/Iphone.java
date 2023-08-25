package com.apple;

public class Iphone extends AparelhoTelefonico implements ReprodutorMusical, Navegador {

    public Iphone() {
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página sendo exibida!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música!");
    }

    @Override
    public void pausar() {
        System.out.println("Pause da música!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada!");
    }
}
