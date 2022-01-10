package com.ndrewcoding.lessons.util.ordenacao;

import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("DuplicatedCode")
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

        for (Conta conta : listaDeContas) {
            System.out.println(conta);
        }

        System.out.println("\n----- Após ordenação das contas por *saldo* -----\n");

        //

        for (Conta conta : listaDeContas) {
            System.out.println(conta);
        }

        System.out.println("\n----- Após ordenação das contas por *agencia* -----\n");

        //

        for (Conta conta : listaDeContas) {
            System.out.println(conta);
        }

    }
}