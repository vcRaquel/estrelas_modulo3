//Classe Conta Corrente: Crie uma classe para construir uma conta corrente.
//A classe deve possuir os seguintes atributos: número da conta, nome do
//correntista e saldo. No construtor, o saldo é opcional, com valor default
//(padrão) zero e os demais atributos são obrigatórios.
package br.com.zup;

public class ContaCorrente {
    int numeroDaConta;
    String nomeCorrentista;
    double saldo;

    public ContaCorrente(int numeroDaConta, String nomeCorrentista){
        this.numeroDaConta = numeroDaConta;
        this.nomeCorrentista = nomeCorrentista;
    }
}
