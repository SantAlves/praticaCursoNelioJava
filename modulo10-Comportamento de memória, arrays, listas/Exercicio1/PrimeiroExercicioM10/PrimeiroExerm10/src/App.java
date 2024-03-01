import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do seu vetor: ");
        int n = sc.nextInt();
        double [] vect = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite o número:");
            vect[i] = sc.nextDouble();
        }
        double som = 0.0;
        for (int i = 0; i < n; i++){
            som += vect[i];
        }

        double resul = som/n;

        System.out.printf("Media dos valores: %.2f%n",resul);


        sc.close();
    }
}
