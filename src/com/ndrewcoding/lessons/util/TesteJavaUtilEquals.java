package com.ndrewcoding.lessons.util;

import models.Conta;
import models.ContaCorrente;

import java.util.ArrayList;

public class TesteJavaUtilEquals {
    public static void main(String[] args) {

        ArrayList<Conta> listaDeContas = new ArrayList<>(2);

        ContaCorrente cc1 = new ContaCorrente(123, 321);
        ContaCorrente cc2 = new ContaCorrente(123, 322);
        ContaCorrente cc3 = new ContaCorrente(123, 321);

        listaDeContas.add(cc1);
        listaDeContas.add(cc2);

        System.out.println("A conta 'cc3' é a mesma conta 'cc1'? Resposta: " + listaDeContas.contains(cc3));

    }
}
