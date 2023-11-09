package aulasjava;
import java.util.Scanner;

public class TesteMedia {

    public static void main(String[] agrs) {
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float resultado;

        System.out.println("Digite a Primeira nota: ");
        Scanner valor1 = new Scanner(System.in);
        nota1 = valor1.nextFloat();

        System.out.println("Digite a Segunda nota: ");
        Scanner valor2 = new Scanner(System.in);
        nota2 = valor2.nextFloat();

        System.out.println("Digite a terceira nota: ");
        Scanner valor3 = new Scanner(System.in);
        nota3 = valor3.nextFloat();

        System.out.println("Digite a quarta nota: ");
        Scanner valor4 = new Scanner(System.in);
        nota4 = valor4.nextFloat();

        resultado = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("A média é: " + resultado);

        if (resultado >5){
            System.out.println("Aluno Aprovado");
        } else if (resultado == 5){
            System.out.println("Aluno em Recuperação");
        } else {
            System.out.println("Aluno Reprovado");
        }




    }
}
