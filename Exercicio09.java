package Exercicio02;

import java.util.Scanner;


public class Exercicio02 {

    public static void main(String[] args) {
        
         Scanner teclado;
       teclado = new Scanner(System.in);
        int i = 0;
        double num = 0;
       
       while(3>i){
        System.out.println("digite um numero: ");
        num = num + teclado.nextDouble();
        
        i++;
       }
       
      double media = num/3;
       
       System.out.printf("Média: %.2f",media);
      
    }
    
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
package Exercicio3;
import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args) {

        String nome, idade, cidade, profissao;

        nome = JOptionPane.showInputDialog("Digite seu nome:");
        idade = JOptionPane.showInputDialog("Digite sua idade:");
        cidade = JOptionPane.showInputDialog("Digite sua cidade:");
        profissao = JOptionPane.showInputDialog("Digite sua cidade:");
        
        Integer.parseInt(idade);
       

        JOptionPane.showMessageDialog(null,"Sua ficha de cadastro:\nNome: " + nome +"\nIdade: " + idade + "\nCidade: " + cidade + "\nProfissão: "+ profissao );
    }
}


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Exercicio04 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double c, f, k;

        System.out.print("Digite a temperatura em Celsius: ");
        c = teclado.nextDouble();

        f = (c * 9.0/5.0) + 32;
        k = c + 273.15;

        System.out.printf("Celsius: %.1f °C\n", c);
        System.out.printf("Fahrenheit: %.1f °F\n", f);
        System.out.printf("Kelvin: %.1f K\n", k);

        teclado.close();
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package Exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);
    int idade;
    System.out.println("Digite sua idade: "); 
    idade = scnr.nextInt();
    
    while (idade < 0){
        System.out.println("Idade invalida.\nPor favor digite novamente: " );
        idade = scnr.nextInt();
    }
        if (idade <= 11){
            System.out.println("Você possui "+idade+" anos\nE você é uma criança" );
        }
        else{ 
			if (idade <=17 ){
            System.out.println("Você possui "+idade+" anos\nE você é um adolescente" );
        }
		else {
			if (idade <= 28){
            System.out.println("Você possui "+idade+" anos\nE você é um jovem adulto" );
        }
		else { 
			if (idade <= 59){
            System.out.println("Você possui "+idade+" anos\nE você é um adulto" );
        }
		else {
            System.out.println("Você possui "+idade+" anos\nE você é um idoso" );
        
        }
        
        
        
        }
        
        
        }
        
        }

    }
    
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {

        String operador = JOptionPane.showInputDialog("Escolha operação (+, -, *, /):");

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = n1 + n2
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                if (n2 == 0) {
                    JOptionPane.showMessageDialog(null, "Erro: divisão por zero");
                    return;
                }
                resultado = n1 / n2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida");
                return;
		}

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


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
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
package Exercicio11;

import javax.swing.JOptionPane;

public class Exercicio11 {

    public static void main(String[] args) {
        final String senha_c = "Java2025";
        String senha = "";
        int tentativa = 3;
        do {
            
            senha = JOptionPane.showInputDialog("Digite a senha (você possui " + tentativa + " chances)");
            tentativa--;
        }while (!senha.equals(senha_c) && tentativa > 0);
        
        if (senha.equals(senha_c)){
            JOptionPane.showMessageDialog(null, "Acesso concedido!");
        
        }else {
            JOptionPane.showMessageDialog(null, "Conta bloqueada!");
        
        }
    }
    
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.print("Digite a quantidade de termos: ");
        n = teclado.nextInt();

        if (n <= 0) {

            System.out.println("Valor inválido");

        } else {

            int a = 0, b = 1;

            for (int i = 1; i <= n; i++) {
                
                System.out.print(a + " ");

                int proximo = a + b;
                a = b;
                b = proximo;
            }
        }

        teclado.close();
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
package Exercicio13;

import java.util.Scanner;

public class Exercicio13{

    public static void main(String[] args) {
        Scanner digito = new Scanner(System.in);
        int valorAleatorio = (int) (Math.random() * 100);
        int num = 0;
        System.out.println("Tente adivinhar o número: ");
        num = digito.nextInt();
        int tentativa = 1;
        while (num != valorAleatorio) {

            if (num > valorAleatorio) {
                System.out.println("O número é menor");
                System.out.println("Tente novamente:");
                num = digito.nextInt();
            } else {
                System.out.println("O número é maior");
                System.out.println("Tente novamente: ");
                num = digito.nextInt();

            }
            tentativa++;
        }

        System.out.println("Você acertou em " + tentativa + " tentativas!");
    }

}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

