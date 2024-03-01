import java.util.Locale;
import java.util.Scanner;

import entidade.Hospede;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Hospede[] hospedes = new Hospede[10];

        System.out.print("Quantos quartos serão alugados? ");
        int qntquartos = sc.nextInt();

        //Hospede[] hospedes = new Hospede[qntquartos];//

        for (int i = 1; i <= qntquartos; i++) {
            System.out.println("Hospede " + i + " :");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email:");
            String email = sc.next();
            System.out.print("Quarto ");
            int numquarto = sc.nextInt();

            hospedes[numquarto] = new Hospede(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        
        for (int i = 0; i < 10; i++) {
            if (hospedes[i] != null) {
                System.out.println(i + ":" + hospedes[i]);
            }
        } 
        sc.close();
        
        
    }
}
