
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas: ");
        int n = sc.nextInt();

        String nome [] = new String[n];
        int idade [] = new int[n];
        double altura [] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome da " + (i + 1) + "pessoa: ");
            System.out.print("Nome:");
            nome[i] = sc.next();
            System.out.print("Idade:");
            idade[i] = sc.nextInt();
            System.out.print("Altura:");
            altura[i] = sc.nextDouble();  

        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += altura[i];
        }

        double mediaAlt = soma / n;
        System.out.println();
        System.out.printf("Altura média: %.2f%n", mediaAlt);

        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16 ) {
                cont++;
            }
        }

        double percet = cont * 100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percet);
        
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16){
                System.out.println(nome[i] + " tem menos de 16 anos");
            }else{
                System.out.println("Ninguém menor de 16!");
            }
            
        }
        
        sc.close();
        
    }
}
