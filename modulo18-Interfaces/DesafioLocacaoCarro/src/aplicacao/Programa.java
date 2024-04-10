package aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import entidade.AluguelCarro;
import entidade.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
       
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")

        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do veículo: ");
        String modeloVei = ler.nextLine();
        System.out.println("Data da retirada do veículo (dd/MM/yyyy hh:mm): ");
        LocalDateTime inicio = LocalDateTime.parse(ler.nextLine(), fmt);
        System.out.println("Data da devolução do veículo (dd/MM/yyyy hh:mm): ");
        LocalDateTime fim = LocalDateTime.parse(ler.nextLine(), fmt);

        AluguelCarro aluguelCarro = new AluguelCarro(inicio, fim, new Veiculo(modeloVei)); 

        ler.close();

    }
}
