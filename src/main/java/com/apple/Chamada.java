package com.apple;

public class Chamada {
    private String numero;
    private int duracao;

    public Chamada() {

    }

    public Chamada(String numero, int duracao) {
        this.numero = numero;
        this.duracao = duracao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


}
