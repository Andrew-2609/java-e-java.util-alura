package com.ndrewcoding.lessons.util;

import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

import java.util.ArrayList;

public class TesteJavaUtil {
    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        ContaCorrente contaCorrente = new ContaCorrente(123, 321);
        contaCorrente.depositar(1000.0);

        lista.add(contaCorrente);

        ContaPoupanca contaPoupanca = new ContaPoupanca(456, 654);
        contaPoupanca.depositar(2000.0);

        lista.add(contaPoupanca);

        System.out.println("Tamanho atual da lista: " + lista.size());

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref);

        lista.remove(1);

        System.out.println("Tamanho atual da lista: " + lista.size());

        lista.add(contaPoupanca);

        System.out.println("-----");

        for (Object obj : lista) {
            System.out.println(obj);
        }

    }
}
