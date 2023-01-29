
import java.util.Scanner;

/*
Entre com dois números, imprima a faixa de números e identifique quais são pares e impares.

Explique qual instrução de laço foi escolhida e o por que da escolha.
 */

public class Ex03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int numeroUm = input.nextInt();
        System.out.println("Digite o segundo numero");
        int numeroDois = input.nextInt();
        int chama = ex03(numeroUm,numeroDois);

    }

    public static int ex03(int a, int b) {

        if (a == b) {
            //imprimir opcao invalida
            System.out.println("Opção invalida!");
        } else if (a < b) {
            // Seguir com o laço
            for (int i = a; i <= b; i++) {
                if (i == 0) {
                    System.out.println(i + " Esse numero eh indefinido");
                    i++;
                }
                if (i % 2 == 0) {
                    System.out.println(i + " -> Esse numero eh par");
                } else {
                    System.out.println(i + " -> Esse numero eh impar");
                }
            }

        } else {
            //Inverter precedencia de B para A
            int aux = 0;
            aux = a;
            a = b;
            b = aux;
            for (int i = a; i <= b; i++) {
                if (i == 0) {
                    System.out.println(i + " Esse numero eh indefinido");
                    i++;
                }
                if (i % 2 == 0) {
                    System.out.println(i + " -> Esse numero eh par");
                } else {
                    System.out.println(i + " -> Esse numero eh impar");
                }
            }

        }

        return 0;
    }

}
