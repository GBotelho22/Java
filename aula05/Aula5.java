package aula_05;

import java.util.Scanner;

public class Aula5 {

    public static void main(String args[]){

        PJ pj = new PJ();
        PF pf = new PF();

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome=sc.next();
        System.out.println("Endereço: ");
        String endereço=sc.next();
        System.out.println("Rendimento Mensal: ");
        double rendimentos=sc.nextDouble();


    }
}
