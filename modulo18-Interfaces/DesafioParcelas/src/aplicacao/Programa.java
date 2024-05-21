package aplicacao;

import java.util.Scanner;
import entidades.Contrato;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Programa {
  public static void main(String[] args) {
   
    Locale.setDefault(Locale.US);
    Scanner entrada = new Scanner(System.in);
    DateTimeFormatter configData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.println("Entre com o dados do contrato: ");
    System.out.print("Número: ");
    int numero = entrada.nextInt();
    System.out.print("Data (DD/MM/YYYY): ");
    LocalDate date = LocalDate.parse(entrada.next(), configData);
    System.out.print("Valor do contrato: ");
    double valorTotal = entrada.nextDouble();

    Contrato contrato = new Contrato(numero, date, valorTotal);

    System.out.println("Digite o número de parcelas: ");
    int numParcelas = entrada.nextInt();

    
    entrada.close();

  }

}
