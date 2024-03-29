package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        try{
            String[] vect = entrada.nextLine().split(" ");
            int posicao = entrada.nextInt();
            System.out.println(vect[posicao]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posição não existe!");
        }
        catch(InputMismatchException e){
            System.out.println("Dado de entrada inválido!");
        };

        System.out.println("Fim do nosso programa!");

        entrada.close();
    }
}
