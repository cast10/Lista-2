package exe6;

import java.util.Scanner;
public class resp6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o número digitado?");
        int n = sc.nextInt();

        int antecessor = n - 1;
        int sucesor = n + 1;


        System.out.println("Número antecessor é:  " + antecessor);
        System.out.println("Número sucessor é:  " + sucesor);
        sc.close();

    }
}