package Aula_06;

import java.util.Scanner;

public class Aula_06 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Produto[] p = new Produto[3];

        for(int i=0; i<3; i++) {
            System.out.println("Qual produto será Colocado");
            System.out.println("1 - Livro");
            System.out.println("2 - DVD");
            int op = sc.nextInt();

            System.out.print("Nome: ");
            sc = new Scanner(System.in);
            String nome = sc.nextLine();
            System.out.print("Valor: ");
            sc = new Scanner(System.in);
            double valor = sc.nextDouble();

            if(op == 1) {
                System.out.print("Entre com ISBN: ");
                sc = new Scanner(System.in);
                String ISBN = sc.nextLine();
                Livro l = new Livro();
                p[i] = l;
            }
            else {
                System.out.print("Entre com SN: ");
                sc = new Scanner(System.in);
                sc.next();
                String SN = sc.nextLine();
                DVD d = new DVD();
                p[i] = d;
            }
        }

        double soma = 0;

        for(Produto prod : p) {
            System.out.println();
            System.out.println("Nome: "+prod.getNome());
            System.out.println("Valor: "+prod.getValor());
            System.out.println("Valor Liq "+prod.getValorliquido());
            soma += prod.getValorliquido();
        }

        System.out.println("Total do valor Liquido dos produtos");
        System.out.println("R$ "+soma);


    }

}

    }

}
