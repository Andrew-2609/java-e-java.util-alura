package com.ndrewcoding.lessons.util;

import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

import java.util.ArrayList;

public class TesteJavaUtilArrayList {
    public static void main(String[] args) {

        ArrayList<Conta> listaDeContas = new ArrayList<>();

        ContaCorrente contaCorrente = new ContaCorrente(123, 321);
        contaCorrente.depositar(1000.0);

        listaDeContas.add(contaCorrente);

        ContaPoupanca contaPoupanca = new ContaPoupanca(456, 654);
        contaPoupanca.depositar(2000.0);

        listaDeContas.add(contaPoupanca);

        System.out.println("Tamanho atual da lista: " + listaDeContas.size());

        Conta ref = listaDeContas.get(0);
        System.out.println(ref);

        listaDeContas.remove(1);

        System.out.println("Tamanho atual da lista: " + listaDeContas.size());

        listaDeContas.add(contaPoupanca);

        System.out.println("-----");

        for (Conta conta : listaDeContas) {
            System.out.println(conta);
        }

    }
}
