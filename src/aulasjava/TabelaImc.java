package aulasjava;
import java.util.Scanner;


public class TabelaImc {
    public static void main(String[] agrs){
        float peso;
        float altura;
        float imc;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite o Seu peso: ");
        peso = valor.nextFloat();
        System.out.print("Digite o Sua altura: ");
        altura = valor.nextFloat();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5){
            System.out.print("Pessoa abaixo do Peso (Magreza)");
        } else if ( imc >=18.5 && imc <=24.9){
            System.out.print("Pessoa com peso normal");
        }  else if ( imc >=25.0 && imc <=29.9){
            System.out.print("Pessoa com sobrepeso");
        }  else if ( imc >=30.0 && imc <=34.9){
            System.out.print("Pessoa com obesidade grau 1");
        } else if ( imc >=35.0 && imc <=39.9){
            System.out.print("Pessoa com obesidade grau 2");
        } else if (imc >= 40.0){
            System.out.print("Pessoa Com obesidade grau 3");
        }
    }
}
