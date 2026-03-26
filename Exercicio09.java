
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

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o lado C: ");
        double c = sc.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo válido.");
        }
    }
}



