/*
Classe Carro: Crie uma classe para modelar um carro.
Todo carro tem quantidade de portas, modelo, marca e potência.
No construtor, a potência é opcional, com valor default (padrão) 2.0 e os demais atributos são
obrigatórios.
*/
package br.com.zup;

public class Carro {
    int quantidadePortas;
    String modelo;
    String marca;
    double potencia = 2;

    public Carro(int quantidadePortas, String modelo, String marca) {
        this.quantidadePortas = quantidadePortas;
        this.modelo = modelo;
        this.marca = marca;
    }
}
