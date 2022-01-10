package com.ndrewcoding.lessons.util;

import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenandoComCollections {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(24, 33);
        cc1.depositar(333.0);

        Conta cc2 = new ContaPoupanca(23, 44);
        cc2.depositar(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.depositar(111.0);

        List<Conta> listaDeContas = new ArrayList<>();
        listaDeContas.add(cc1);
        listaDeContas.add(cc2);
        listaDeContas.add(cc3);

        System.out.println("\n----- Após ordenação das contas por saldo (padrão) -----\n");

        //

        for (Conta conta : listaDeContas) {
            System.out.println(conta);
        }

    }
}