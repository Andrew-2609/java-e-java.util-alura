package com.ndrewcoding.lessons;

import models.Cliente;
import models.ContaCorrente;
import models.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {
        Object[] referencias = new Object[5];

        ContaCorrente contaCorrente = new ContaCorrente(123, 321);
        referencias[0] = contaCorrente;

        ContaPoupanca contaPoupanca = new ContaPoupanca(567, 765);
        referencias[1] = contaPoupanca;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        ContaCorrente ref = (ContaCorrente) referencias[0];

        contaCorrente.depositar(2000.0);

        System.out.println(ref.getValorImposto());
    }
}
