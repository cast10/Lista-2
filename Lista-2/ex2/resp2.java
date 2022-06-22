package ex2;
import java.util.Scanner;


//Faça um programa que receba 4 notas bimestrais e mostre a média aritmética//

public class resp2 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeira nota bimestral é ");
        double nota1 = sc.nextDouble();
        System.out.println("Segunda nota bimestral é ");
        double nota2 = sc.nextDouble();
        System.out.println("Terceira nota bimestral é ");
        double nota3 = sc.nextDouble();
        System.out.println("Quarta nota bimestral é ");
        double nota4 = sc.nextDouble();

        double somaTotal = nota1+nota2+nota3+nota4;
        double mediasNotas = somaTotal/4;
        System.out.println("Soma de todas as notas  "+ somaTotal);
        System.out.println("M<dia final das 4 notas é " + mediasNotas);
        sc. close();
    }
}
