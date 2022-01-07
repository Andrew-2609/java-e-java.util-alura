package com.ndrewcoding.lessons;

import com.ndrewcoding.models.GuardadorDeReferencias;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

public class TesteGuardadorDeReferencias {
    public static void main(String[] args) {

        GuardadorDeReferencias guardadorDeReferencias = new GuardadorDeReferencias();

        ContaCorrente contaCorrente = new ContaCorrente(444, 555);
        contaCorrente.depositar(2000.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca(999, 665);
        contaPoupanca.depositar(4000.0);

        guardadorDeReferencias.guardar(contaCorrente);
        guardadorDeReferencias.guardar(contaPoupanca);

        int tamanhoAtualDoGuardador = guardadorDeReferencias.getQuantidadeDeElementos();
        System.out.println("Tamanho atual do Guardador: " + tamanhoAtualDoGuardador);

        Conta ref = (Conta) guardadorDeReferencias.getReferenciaNaPosicao(0);
        System.out.println(ref);

    }
}
