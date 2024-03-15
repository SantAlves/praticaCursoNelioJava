import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidade.ContratoHora;
import entidade.Departamento;
import entidade.Trabalhador;
import entidade_enum.NivelTrabalhador;

public class AppExercio {
    public static void main(String[] args) throws ParseException {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       
        System.out.println("Entre com o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Entre com os dados do trabalhador: ");
        System.out.print("Nome do trabalhador: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.print("Nivel: ");
        String nivelTrabalhador = sc.nextLine();
        System.out.print("Salário base: ");
        double baseSalarioTrabalhador = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), baseSalarioTrabalhador, new Departamento(nomeDepartamento) );
        
        System.out.println("Quantos contratos o trabalhador terá: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
           System.out.println("Entre com os dados do " + i + " contrato : ");
           System.out.print("DD/MM/YYYY");
           Date dataContrato = sdf.parse(sc.next());
           System.out.print("Valor por hora: ");
           double valorPorHora = sc.nextDouble();
           System.out.print("Duração horas: ");
           int horas = sc.nextInt();
           ContratoHora contrato = new ContratoHora(dataContrato,valorPorHora,horas); 
           trabalhador.addContrato(contrato);
        }
        System.out.println();
        System.out.print("Entre com mês e o ano para calcular o salário: ");
        String mesEano = sc.next();
        int mes = Integer.parseInt(mesEano.substring(0, 2));
        int ano = Integer.parseInt(mesEano.substring(3));
        System.out.println("Nome: " + trabalhador.getNome()); 
        System.out.println("Departamento: " + trabalhador.getDepartamento().getName()); 
        System.out.println("Salário: " + mesEano + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));
        sc.close();
    }
}
