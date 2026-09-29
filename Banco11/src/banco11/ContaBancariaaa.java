/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco11;

/**
 *
 * @author augusto62977786
 */
public class ContaBancariaaa {

    private String titular;
    private double saldo;

    
    public ContaBancariaaa(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    
    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    
    public double getSaldo() {
        return saldo;
    }

    
    public void verificarSaldo() {

        if (saldo == 0) {
            System.out.println("Conta sem saldo.");

        } else if (saldo <= 500) {
            System.out.println("Saldo baixo.");

        } else if (saldo <= 2000) {
            System.out.println("Saldo normal.");

        } else {
            System.out.println("Saldo elevado.");
        }
    }

    
    public void exibirExtratoSimples() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Operação " + i);
        }
    }

    
    public void exibirOperacoes(int quantidade) {

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Operação " + i);
        }
    }

    public String getTitular() {
        return titular;
    }
}
