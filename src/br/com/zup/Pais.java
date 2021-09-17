//Crie uma classe que modele um país, contendo nome,extensão territorial e tamanho da população.
// No método main, crie uma lista chamada continente, onde teremos uma lista de países.
// Adicione 4 países na lista do continente (Países de sua escolha)
// e crie um menu para o usuário, que deverá decidir se vai listar os países do continente ou sair do programa.
package br.com.zup;

public class Pais {
    String nome;
    double territorio;
    int populacao;

    public Pais(String nome, double territorio, int populacao){
        this.nome = nome;
        this.territorio = territorio;
        this.populacao = populacao;
    }
}
