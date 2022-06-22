package ex7;
import java.util.Scanner;
public class resp7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o valor da sua horas trabalhadas?");
        double valorHoras = sc.nextDouble();

        System.out.println("Quantidade de horas trabalhadas?");
        double quantHoras = sc.nextDouble();

        double salárioMensal = (valorHoras*quantHoras);
        System.out.println("Total do Salário Bruto " + salárioMensal);


        double inss = salárioMensal * 0.11;
        double irrf  = salárioMensal *.08;
        double sindicato = salárioMensal* .05;
        double salarioLiq = salárioMensal-inss-irrf-sindicato;

        System.out.println("Desconto do INSS  " + inss );
        System.out.println("Desconto do Sindicato   " + sindicato );
        System.out.println("Salário líquido " + salarioLiq );



        sc.close();
    }

}
