//Classe Bola: Crie uma classe que modele uma bola, toda bola contém uma
//circunferência, cor, marca e velocidade. Após a modelagem, instancie objetos
//diferentes no método main para testes.
package br.com.zup;

public class Bola {
    double circunferencia;
    String cor;
    String marca;
    double velocidade;

    public Bola(double circunferencia,String cor, String marca, double velocidade) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.velocidade = velocidade;
    }
}
