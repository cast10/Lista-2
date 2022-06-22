package ex7;
import java.util.Scanner;
public class resp7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o valor da sua horas trabalhadas?");
        double valorHoras = sc.nextDouble();

        System.out.println("Quantidade de horas trabalhadas?");
        double quantHoras = sc.nextDouble();

        double salarioMensal = (valorHoras*quantHoras);
        System.out.println("Total do Salário Bruto " + salarioMensal);


        double inss = salarioMensal * 0.08;
        double irrf  = salarioMensal * 0.11;
        double sindicato = salarioMensal* 0.05;
        double salarioLiq = salarioMensal-inss-irrf-sindicato;

        System.out.println("Desconto do INSS  " + inss );
        System.out.println("Desconto do IRRF  " + irrf );
        System.out.println("Desconto do Sindicato   " + sindicato );
        System.out.println("Salário líquido " + salarioLiq );



        sc.close();
    }

}
