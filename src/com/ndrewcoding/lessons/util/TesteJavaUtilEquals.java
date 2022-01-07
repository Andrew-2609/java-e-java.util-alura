package com.ndrewcoding.lessons.util;

import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

import java.util.ArrayList;

public class TesteJavaUtilEquals {
    public static void main(String[] args) {

        ArrayList<Conta> listaDeContas = new ArrayList<>(2);

        ContaCorrente contaCorrente = new ContaCorrente(123, 321);
        contaCorrente.depositar(1000.0);
        listaDeContas.add(contaCorrente);

        ContaPoupanca contaPoupanca = new ContaPoupanca(456, 654);
        contaPoupanca.depositar(2000.0);
        listaDeContas.add(contaPoupanca);

        for (Conta conta : listaDeContas) {
            System.out.println(conta);
        }

    }
}
