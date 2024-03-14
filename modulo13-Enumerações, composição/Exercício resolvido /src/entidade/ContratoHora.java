package entidade;

import java.util.Date;

public class ContratoHora {
  
  private Date data;
  private double valorporhora;
  private Integer horas;

  public ContratoHora() {
    
  }

  public ContratoHora(Date data, double valorporhora, Integer horas) {
    this.data = data;
    this.valorporhora = valorporhora;
    this.horas = horas;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public double getValorporhora() {
    return valorporhora;
  }

  public void setValorporhora(double valorporhora) {
    this.valorporhora = valorporhora;
  }

  public Integer getHoras() {
    return horas;
  }

  public void setHoras(Integer horas) {
    this.horas = horas;
  }
  
  public double totalValor() {
    return horas * valorporhora;
  }
}
