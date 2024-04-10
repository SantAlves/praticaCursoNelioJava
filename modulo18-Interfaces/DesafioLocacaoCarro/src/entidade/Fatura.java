package entidade;

public class Fatura {
  
  private double pagamentoBasico;
  private double pagamentoImposto;

  public Fatura() {

  }

  public Fatura(double pagamentoBasico, double pagamentoImposto) {
    this.pagamentoBasico = pagamentoBasico;
    this.pagamentoImposto = pagamentoImposto;
  }

  public double getPagamentoBasico() {
    return pagamentoBasico;
  }

  public void setPagamentoBasico(double pagamentoBasico) {
    this.pagamentoBasico = pagamentoBasico;
  }

  public double getPagamentoImposto() {
    return pagamentoImposto;
  }

  public void setPagamentoImposto(double pagamentoImposto) {
    this.pagamentoImposto = pagamentoImposto;
  }

  public double getTotalpagamento() {
    return getPagamentoBasico() + getPagamentoImposto();
  }
  
}
