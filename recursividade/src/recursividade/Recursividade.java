
package recursividade;

import java.util.Scanner;

/**
 *
 * @author Renan
 */
public class Recursividade {

   
    public static void main(String[] args) {
       
        System.out.println("Digite o valor do fatorial que deseja calcualr");
        Scanner input = new Scanner(System.in);
        int recebe = input.nextInt();
        int chama = fatorial(recebe);
        
    }
    public static int fatorial(int valor){
        
        if(valor == 0){
            return 1;
        } else{
            valor = (valor*fatorial(valor -1));
            System.out.println(valor);
            return valor;
        }        
    }
}
