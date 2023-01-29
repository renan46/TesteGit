
import java.util.Scanner;

/*
A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários públicos. O valor máximo da prestação não poderá ultrapassar 30% do salario bruto. 
Fazer um programa que permita entrar com o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido.
 */
public class Ex04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu salrio bruto!");
        double salario = input.nextDouble();
        System.out.println("Digite o valor do seu emprestimo");
        double emprestimo = input.nextDouble();
        System.out.println("Digite em quantas parcelas deseja pagar seu emprestimo!");
        int prestacoes = input.nextInt();
        boolean entrar = emprestimo(salario, emprestimo, prestacoes);
        System.out.println(entrar);
    }

    public static boolean emprestimo(double salario, double emprestimo, int prestacoes) {
        boolean resultado = true;
        double valorLimiteDaPrestacao = salario * 0.3;
        double valorDaParcela = emprestimo / prestacoes;
        if (valorLimiteDaPrestacao >= valorDaParcela) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }
}
