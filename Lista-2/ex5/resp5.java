package ex5;
import java.util.Scanner;
public class resp5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é a temperatura ºF?");
        double valorFahrenheit = sc.nextDouble();
        int c = 32;
        double divisor = 1.8;
        double valorCelsius = ((valorFahrenheit-c)/divisor);


        System.out.println("Graus Césius é:  " + valorCelsius +"º");

        sc. close();
    }



}
