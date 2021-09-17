package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Contato obj_contato = new Contato("Raquel", "1234567", "raquel@raquel", 36);

        System.out.println(obj_contato.nome);
        System.out.println(obj_contato.email);
    }
}
