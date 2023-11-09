package aulasjava;
import java.util.Scanner;


public class Calculo {
    public static void main (String[] agrs){

        float valor1;
        float valor2;
        float divisao;
        float multiplicacao;
        float subtracao;
        float adicao;

        Scanner numero = new Scanner(System.in);

        System.out.println("digite o primeiro valor: ");
        valor1 = numero.nextFloat();

        System.out.println("digite o segundo valor: ");
        valor2 = numero.nextFloat();

        divisao = valor1 / valor2;
        multiplicacao = valor1 * valor2;
        subtracao = valor1 - valor2;
        adicao = valor1 + valor2;

        System.out.println("A Soma dos numeros é: " + adicao);
        System.out.println("A Subtracao dos numeros é: " + subtracao);
        System.out.println("A Multiplicacao dos numeros é: " + multiplicacao);
        System.out.println("A Divisao dos numeros é: " + divisao);

    }

}
