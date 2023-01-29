

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        System.out.println("ADO1 Ex2");
        System.out.println("Digite seu nome e sobrenome");
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        String[] chama = nome(nome);
        //System.out.println(chama);
    }

    public static String[] nome(String nome) {
        String novo = nome;
        String[] parts = new String[nome.length()];

        if (novo == null || novo.isEmpty()) {
            System.out.println("Opção invalida");

        } else {
            parts = novo.split(" ");
            System.out.println("Bem Vindo ");
            for( int i =0; i<parts.length;i++){
                System.out.print(parts[i]);
            }
        }
        return parts;
    }
}
