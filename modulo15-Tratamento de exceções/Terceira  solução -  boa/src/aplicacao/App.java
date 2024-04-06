package aplicacao;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import modelExc.TratativasPersonalizadas;
import modelEntidade.Reserva;


public class App {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat confParaDataApp = new SimpleDateFormat("dd/MM/yyyy");

        try{

            System.out.println("Número do quarto: ");
            int numero = entrada.nextInt();
    
            System.out.println("Data de Check-in: (dd/MM/yyyy)");
            Date deCheckin = confParaDataApp.parse(entrada.next());
    
            System.out.println("Data de Check-out: (dd/MM/yyyy)");
            Date deCheckout = confParaDataApp.parse(entrada.next());

            Reserva reserva = new Reserva(numero, deCheckin, deCheckout);
            System.out.println("Reserva: " + reserva);

            System.out.println();

            System.out.println("Entre com os dados para atualizar a reserva: ");
            System.out.println("Data de Check-in: (dd/MM/yyyy)");
            deCheckin = confParaDataApp.parse(entrada.next());
            System.out.println("Data de Check-out: (dd/MM/yyyy)");
            deCheckout = confParaDataApp.parse(entrada.next());

            reserva.atualizacaoData(deCheckin, deCheckout);
            System.err.println("Reserva: " + reserva);


        }catch(ParseException e){
            System.out.println("Erro: formato de dado inválido...");
        }
        catch(TratativasPersonalizadas e){
            System.out.println("Erro na reserva " + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Erro inesperado ");
        }

        entrada.close();
    }
}
