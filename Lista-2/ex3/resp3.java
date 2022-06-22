package ex3;
import java.util.Scanner;


//Faça um programa que converta metros para centímetros.//

public class resp3 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos metros?");
        double metro = sc.nextDouble();

        double centimetros = metro*100;

        System.out.println("Quantos centimetros tem o metro digitado?  "+ centimetros);

        sc. close();
    }
}
