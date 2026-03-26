
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

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;
        int contador = 0;

        System.out.println("Digite números inteiros e para encerrar digite 0:");
        
        numero = scanner.nextInt();

        while (numero != 0) {
            soma += numero;
            contador++;    

            numero = scanner.nextInt();
        }

        System.out.println("\nResultado:");

        System.out.println("Soma: " + soma);

        System.out.println("Quantidade: " + contador);

        if (contador > 0) {

            double media = (double) soma / contador;

            System.out.println("Média: " + media);
        }
	else {
            System.out.println("Média: não é possível calcular (nenhum número válido).");
        }
    }
}


