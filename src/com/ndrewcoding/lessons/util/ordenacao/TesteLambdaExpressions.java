package com.ndrewcoding.lessons.util.ordenacao;

import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"DuplicatedCode", "ComparatorCombinators"})
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

        listaDeContas.forEach((conta) -> System.out.println(conta));

        System.out.println("\n----- Após ordenação das contas por *saldo* -----\n");

        listaDeContas.sort((x1, x2) -> Double.compare(x1.getSaldo(), x2.getSaldo()));

        listaDeContas.forEach((conta) -> System.out.println(conta));

        System.out.println("\n----- Após ordenação das contas por *agencia* -----\n");

        listaDeContas.sort((x1, x2) -> Integer.compare(x1.getAgencia(), x2.getAgencia()));

        listaDeContas.forEach((conta) -> System.out.println(conta));

    }
}