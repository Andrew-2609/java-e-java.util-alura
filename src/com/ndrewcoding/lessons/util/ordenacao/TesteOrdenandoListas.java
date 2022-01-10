package com.ndrewcoding.lessons.util.ordenacao;

import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenandoListas {
    public static void main(String[] args) {

        Cliente primeiroCliente = new Cliente();
        Cliente segundoCliente = new Cliente();
        Cliente terceiroCliente = new Cliente();
        Cliente quartoCliente = new Cliente();

        primeiroCliente.setNome("Andrew Monteiro");
        segundoCliente.setNome("Pedro Lucas");
        terceiroCliente.setNome("Marco Isaías");
        quartoCliente.setNome("Marco Ian");

        Conta cc1 = new ContaCorrente(24, 33);
        cc1.setTitular(primeiroCliente);
        cc1.depositar(333.0);

        Conta cc2 = new ContaPoupanca(23, 44);
        cc2.setTitular(segundoCliente);
        cc2.depositar(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.setTitular(terceiroCliente);
        cc3.depositar(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.setTitular(quartoCliente);
        cc4.depositar(222.0);

        List<Conta> listaDeContas = new ArrayList<>();
        listaDeContas.add(cc1);
        listaDeContas.add(cc2);
        listaDeContas.add(cc3);
        listaDeContas.add(cc4);

        for (Conta conta : listaDeContas) {
            System.out.println(conta);
        }

        System.out.println("\n----- Após ordenação das contas por *agência* -----\n");

        listaDeContas.sort(new ComparadorDeContasPorAgencia());

        for (Conta conta : listaDeContas) {
            System.out.println(conta);
        }

        System.out.println("\n----- Após ordenação das contas por *titular* -----\n");

        listaDeContas.sort(new ComparadorDeContasPorTitular());

        for (Conta conta : listaDeContas) {
            System.out.println(conta + "; Titular: " + conta.getTitular().getNome());
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
        return Integer.compare(primeiraConta.getAgencia(), segundaConta.getAgencia());
    }

}