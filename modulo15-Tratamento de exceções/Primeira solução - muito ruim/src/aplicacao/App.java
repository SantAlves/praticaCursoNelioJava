import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class App {
    public static void main(String[] args) throws ParseException {
        
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat confParaDataApp = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Número do quarto: ");
        int numero = entrada.nextInt();

        System.out.println("Data de Check-in: (dd/MM/yyyy)");
        Date deCheckin = confParaDataApp.parse(entrada.next());

        System.out.println("Data de Check-out: (dd/MM/yyyy)");
        Date deCheckout = confParaDataApp.parse(entrada.next());

        if(!deCheckout.after(deCheckin)){
            System.out.println("Data de Check-out deve ser depois de Data Check-in");
        }else{
            Reserva reserva = new Reserva(numero, deCheckin, deCheckout);
            System.out.println("Reserva: " + reserva);
        }
    }
}
