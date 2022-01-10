package com.ndrewcoding.lessons.util.ordenacao;

import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings({"DuplicatedCode"})
public class TesteLambdaExpressions {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(24, 33);
        cc1.depositar(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.depositar(444.0);

        Conta cc3 = new ContaCorrente(23, 11);
        cc3.depositar(110.0);

        List<Conta> listaDeContas = new ArrayList<>();
        listaDeContas.add(cc1);
        listaDeContas.add(cc2);
        listaDeContas.add(cc3);

        listaDeContas.forEach(System.out::println);

        System.out.println("\n----- Após ordenação das contas por *saldo* -----\n");

        listaDeContas.sort(Comparator.comparingDouble(Conta::getSaldo));

        listaDeContas.forEach(System.out::println);

        System.out.println("\n----- Após ordenação das contas por *agencia* -----\n");

        listaDeContas.sort(Comparator.comparingInt(Conta::getAgencia));

        listaDeContas.forEach(System.out::println);

    }
}