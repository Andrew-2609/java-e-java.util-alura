package com.ndrewcoding.lessons;

import com.ndrewcoding.models.GuardadorDeContas;
import models.ContaCorrente;
import models.ContaPoupanca;

public class TesteGuardadorDeContas {
    public static void main(String[] args) {

        GuardadorDeContas guardadorDeContas = new GuardadorDeContas();

        ContaCorrente contaCorrente = new ContaCorrente(123, 321);
        contaCorrente.depositar(4000.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca(456, 654);
        contaPoupanca.depositar(6000.0);

        guardadorDeContas.guardar(contaCorrente);
        guardadorDeContas.guardar(contaPoupanca);

        int tamanhoAtualDoGuardador = guardadorDeContas.getQuantidadeDeElementos();

        System.out.println(tamanhoAtualDoGuardador);

    }
}
