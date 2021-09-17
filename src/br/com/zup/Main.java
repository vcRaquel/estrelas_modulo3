package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Contato obj_contato = new Contato("Raquel", "1234567", "raquel@raquel", 36);

        System.out.println(obj_contato.nome);
        System.out.println(obj_contato.email);

        Bola quadrada = new Bola(2, "colorida", "Kiko", 3.5);
        System.out.println("Bola marca: " + quadrada.marca);
        System.out.println("Cor da bola: " + quadrada.cor);

        Pessoa raquel = new Pessoa("Raquel", 36,1.61);
        raquel.peso = 61.24;
        System.out.println("Nome: " + raquel.nome + " Idade: " + raquel.idade + " Peso: " + raquel.peso + " Altura: " + raquel.altura);

        ContaCorrente raquelItau = new ContaCorrente(789, "Raquel");
        System.out.println("Número da conta: " + raquelItau.numeroDaConta + " Nome do correntista: " + raquelItau.nomeCorrentista + " Saldo: " + raquelItau.saldo);

        Carro marquinhos = new Carro(2,"esportivo", "pixar");
        System.out.println("Potência padrão: " + marquinhos.potencia);
        marquinhos.potencia = 300;
        System.out.println("Potência de corrida: " + marquinhos.potencia);


    }
}
