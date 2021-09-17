package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Contato obj_contato = new Contato("Raquel", "1234567", "raquel@raquel", 36);

        System.out.println(obj_contato.nome);
        System.out.println(obj_contato.email);

        Bola quadrada = new Bola(2, "colorida", "Kiko", 3.5);
        System.out.println("Bola marca: " + quadrada.marca);
        System.out.println("Cor da bola: " + quadrada.cor);

        Pessoa Raquel = new Pessoa("Raquel", 36,1.61);
        Raquel.peso = 61.24;
        System.out.println("Nome: " + Raquel.nome + " Idade: " + Raquel.idade + " Peso: " + Raquel.peso + " Altura: " + Raquel.altura);
    }
}
