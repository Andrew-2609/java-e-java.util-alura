package com.ndrewcoding.lessons.util;

import models.Conta;
import models.ContaCorrente;

import java.util.LinkedList;
import java.util.List;

public class TesteJavaUtilLinkedList {
    public static void main(String[] args) {

        List<Conta> listaDeContas = new LinkedList<>();

        ContaCorrente cc1 = new ContaCorrente(123, 323);
        ContaCorrente cc2 = new ContaCorrente(123, 323);

        listaDeContas.add(cc1);
        listaDeContas.add(cc2);

        listaDeContas.remove(0);

        for (Conta conta : listaDeContas) {
            System.out.println(conta);
        }

    }
}
