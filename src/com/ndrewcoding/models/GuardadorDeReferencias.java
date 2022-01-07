package com.ndrewcoding.models;

public class GuardadorDeReferencias {

    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencias() {
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }

    public void guardar(Object Object) {
        this.referencias[this.posicaoLivre] = Object;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferenciaNaPosicao(int posicao) {
        return this.referencias[posicao];
    }

}
