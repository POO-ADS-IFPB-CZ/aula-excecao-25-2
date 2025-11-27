package model;

import exceptions.LimiteExcedidoException;
import exceptions.SaldoInsuficienteException;

public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(float valor) throws LimiteExcedidoException{
        if(valor > 10000){
            throw new LimiteExcedidoException(
                    "Limite de transação excedido");
        }
        saldo += valor;
        return true;
    }

    public boolean sacar(float valor) throws LimiteExcedidoException,
            SaldoInsuficienteException{
        if(valor > 10000){
            throw new LimiteExcedidoException(
                    "Limite de transação excedido");
        }
        if(valor > saldo){
            throw new SaldoInsuficienteException(
                    "Saldo insuficiente"
            );
        }
        saldo -= valor;
        return true;
    }

}
