package ex4;
import java.util.Scanner;

//Faça um Programa que recebe o quanto você ganha por hora e o número de
// horas trabalhadas no mês. Calcule e mostre o total do seu salário no
// referido mês.//

public class resp4 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual valor da sua hora trabalhada?");
        double valorHoras = sc.nextDouble();

        System.out.println("Quanta horas trabalhada?");
        double horas = sc.nextDouble();


        double salarioMes = (valorHoras * horas);


        System.out.println("Salário no final do mês é:  "+ salarioMes);

        sc. close();
    }
}
