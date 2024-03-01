import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos: ");
        int n = sc.nextInt();

        Produto [] vect = new Produto[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Digite o nome do produto:");
            String name = sc.nextLine();
            System.out.println("Digite o preço do produto:");
            int price = sc.nextInt();
            vect[i] = new Produto(name, price);
        }
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i].getPrice();

        }

        double media = soma/n;

        System.out.printf("Media dos preço do produto: R$ %.2f%n", media);

        sc.close();
        
        
    }
}
