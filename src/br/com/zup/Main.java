package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Contato obj_contato = new Contato("Raquel", "1234567", "raquel@raquel", 36);
//
//        System.out.println(obj_contato.nome);
//        System.out.println(obj_contato.email);
//
//        Bola quadrada = new Bola(2, "colorida", "Kiko", 3.5);
//        System.out.println("Bola marca: " + quadrada.marca);
//        System.out.println("Cor da bola: " + quadrada.cor);
//
//        Pessoa raquel = new Pessoa("Raquel", 36,1.61);
//        raquel.peso = 61.24;
//        System.out.println("Nome: " + raquel.nome + " Idade: " + raquel.idade + " Peso: " + raquel.peso + " Altura: " + raquel.altura);
//
//        ContaCorrente raquelItau = new ContaCorrente(789, "Raquel");
//        System.out.println("Número da conta: " + raquelItau.numeroDaConta + " Nome do correntista: " + raquelItau.nomeCorrentista + " Saldo: " + raquelItau.saldo);
//
//        Carro marquinhos = new Carro(2,"esportivo", "pixar");
//        System.out.println("Potência padrão: " + marquinhos.potencia);
//        marquinhos.potencia = 300;
//        System.out.println("Potência de corrida: " + marquinhos.potencia);

        List<Pais> continente = new ArrayList<>();

        Pais pais1 = new Pais("Brasil", 8516,211000000);
        continente.add(pais1);

        Pais pais2 = new Pais("Venezuela", 916.445,28052000);
        continente.add(pais2);

        Pais pais3 = new Pais("Uruguai", 176215,3462000);
        continente.add(pais3);

        Pais pais4 = new Pais("Colombia", 1143,50034000);
        continente.add(pais4);

        Scanner leitor = new Scanner(System.in);
        int seletor = 1;

        while (seletor > 0 && seletor < 2){
            System.out.println("Digite 1 para listar os países do Continente");
            System.out.println("Digite 2 para sair do programa");

            seletor = leitor.nextInt();
            leitor.nextLine();

            switch (seletor){
                case 1:
//                    System.out.println(continente);
                    for (Pais referencia: continente) {
                        System.out.println("Nome: " + referencia.nome);
                        System.out.println("Território: " + referencia.territorio);
                        System.out.println("População" + referencia.populacao);
                    }
                    break;
                case 2:
                    System.out.println("Obrigado por usar o programa, até a próxima!");
            }
        }




    }
}
