
package exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();
        
        System.out.println("\nTabuada do " + numero + ":\n");
        for(int i = 1; i <= 10; i++){
        
        System.out.printf("%d x %2d = %3d%n", numero, i, numero * i);
        
        }
            
        
        

        
    }
    
}
