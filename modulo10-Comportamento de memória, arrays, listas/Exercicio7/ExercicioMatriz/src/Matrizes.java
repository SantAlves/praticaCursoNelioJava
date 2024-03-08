import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da matriz (nXn)");
        int n = sc.nextInt();
        int [][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("Digite o valor da posição (" + i + "," + j + "): ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Números da diagonal: ");

        for (int i = 0; i < n; i++) {

            System.out.print(matriz[i][i] + " ");
                
        }

        System.out.println();

       
        System.out.println("Valor negativo(s): ");

        int Contador = 0;

        for (int i = 0; i < n; i++) {

           for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    System.out.print(matriz[i][j]);
                    Contador++;
                }
            }
        }
        System.out.println();
        System.out.println("Quantidade negativos: " + Contador);

        sc.close();
    }
    
}
