

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

import arquivosTeste;

public class Principal {
    public static void main(String[] args) throws Exception {
        File file = new File("/home/alves/Imagens/teste/arquivo.txt");
        Scanner entrada = null;

        try{
            entrada = new Scanner(file);
            while (entrada.hasNextLine()) {
                System.out.println(entrada.nextLine());
            }
        }
        catch(IOException e){
            System.out.println("Erro :" + e.getMessage());
        }
        finally{
            if(entrada!= null){
                entrada.close();
            }
        }
    }
}
