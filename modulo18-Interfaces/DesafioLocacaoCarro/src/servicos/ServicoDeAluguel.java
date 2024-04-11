package servicos;

import java.time.Duration;

import entidade.AluguelCarro;
import entidade.Fatura;

public class ServicoDeAluguel {
  
  private double precoPorDia;
  private double precoPorHora;
  private TaxaServico taxaServico;

  public ServicoDeAluguel (double precoPorHora, double precoPorDia, TaxaServico taxaServico){
    this.precoPorHora = precoPorHora;
    this.precoPorDia = precoPorDia;
    this.taxaServico = taxaServico;
  }

  public void processarFatura(AluguelCarro aluguelCarro){

    double minutos = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim()).toMinutes();
    double horas = minutos/60.0;

    double pagamentoBasico;

    if(horas <= 12.0){
      pagamentoBasico = precoPorHora * Math.ceil(horas);
    }else{
      pagamentoBasico = precoPorDia * Math.ceil(horas/24);
    }

    double taxa = taxaServico.taxa(pagamentoBasico);

    aluguelCarro.setFatura(new Fatura(pagamentoBasico, taxa));

  }

  
  
}
