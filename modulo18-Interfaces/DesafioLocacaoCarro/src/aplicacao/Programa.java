package aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
//import java.util.Date;//LocalDateTime é uma opção mais avançada e nova;
import java.util.Scanner;
import java.text.ParseException;

import entidade.AluguelCarro;
import entidade.Veiculo;
import servicos.ServicoDeAluguel;
import servicos.TaxaServicoBrasil;

public class Programa {
    public static void main(String[] args) throws ParseException {
       
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("\n\nEntre com os dados do aluguel: \n\n");

        System.out.print("Modelo do veículo: ");
        String modeloVeiculo = ler.nextLine();

        System.out.print("Data da retirada do veículo (dd/MM/yyyy hh:mm): ");
        LocalDateTime inicio = LocalDateTime.parse(ler.nextLine(), fmt);

        System.out.print("Data da devolução do veículo (dd/MM/yyyy hh:mm): ");
        LocalDateTime fim = LocalDateTime.parse(ler.nextLine(), fmt);

        AluguelCarro aluguelCarro = new AluguelCarro(inicio, fim, new Veiculo(modeloVeiculo)); 

        System.out.print("Entre com o valor por hora: " );
        double precoPorHora = ler.nextDouble();
        System.out.print("Entre com o valor por dia: " );
        double precoPorDia = ler.nextDouble();

        ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel( precoPorHora,precoPorDia, new TaxaServicoBrasil());

        servicoDeAluguel.processarFatura(aluguelCarro);

        System.out.println("==== FATURA =====");

        System.out.println("\nPagamento básico: " + String.format("%.2f", aluguelCarro.getFatura().getPagamentoBasico()));  
        System.out.println("\nTaxa de serviço: " + String.format("%.2f", aluguelCarro.getFatura().getPagamentoImposto()));
        System.out.println("\nValor total: " + String.format("%.2f", aluguelCarro.getFatura().getTotalpagamento())); 


        ler.close();

    }
}
