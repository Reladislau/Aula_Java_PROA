package aulasjava;
import java.util.Scanner;

public class TesteJava {
    public static void main(String[] args){

        int numero1 = 10; /* Declarando Váriaves */
        int numero2 = 20;
        int soma = numero1 + numero2; /* Soma de Variavel*/ /* Instanciar é atribuit valor em uma variavel*/
        int numero3;
        int numero4;
        int resultado;

        System.out.println("hello World!!!");
        System.out.println("a professora é maravilhosa! <3");
        System.out.println("O primeiro numero declarado foi: " + numero1);
        System.out.println("O segundo numero declarado foi: " + numero2);
        System.out.println ("A Soma de " + numero1 + " com " + numero2 + " é igual a: " + soma);


        System.out.println("Agora digite a sua soma");
        System.out.println("Digite o Primeiro Valor: ");

        Scanner valor1 = new Scanner(System.in);
        numero3 = valor1.nextInt();

        System.out.println("Digite o Segundo Valor: ");

        Scanner valor2 = new Scanner(System.in);
        numero4 = valor2.nextInt();

        resultado  = numero3 + numero4;

        System.out.println ("A Soma de " + numero3 + " com " + numero4 + " é igual a: " + resultado);


    }
}
