package com.ndrewcoding.lessons.util;

import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenandoListas {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(24, 33);
        cc1.depositar(333.0);

        Conta cc2 = new ContaPoupanca(23, 44);
        cc2.depositar(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.depositar(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.depositar(222.0);

        List<Conta> listaDeContas = new ArrayList<>();
        listaDeContas.add(cc1);
        listaDeContas.add(cc2);
        listaDeContas.add(cc3);
        listaDeContas.add(cc4);

        for (Conta conta : listaDeContas) {
            System.out.println(conta);
        }

        System.out.println("----- Após ordenação das contas por *agência* -----");

        listaDeContas.sort(new ComparadorDeContasPorAgencia());

        for (Conta conta : listaDeContas) {
            System.out.println(conta);
        }

    }
}

class ComparadorDeContasPorTitular implements Comparator<Conta> {

    @Override
    public int compare(Conta primeiraConta, Conta segundaConta) {
        String primeiroTitular = primeiraConta.getTitular().getNome();
        String segundoTitular = segundaConta.getTitular().getNome();

        return primeiroTitular.compareTo(segundoTitular);
    }

}

class ComparadorDeContasPorAgencia implements Comparator<Conta> {

    @Override
    public int compare(Conta primeiraConta, Conta segundaConta) {
        if (primeiraConta.getAgencia() == segundaConta.getAgencia()) {
            return 0;
        }

        return primeiraConta.getAgencia() < segundaConta.getAgencia() ? -1 : 1;
    }

}