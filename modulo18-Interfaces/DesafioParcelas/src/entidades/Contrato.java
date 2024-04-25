package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Contrato {
  
  private Integer numuero;
  private LocalDate date;
  private Double valorTotal;

  private List<Parcelamento> parcelamento = new ArrayList<>();

  public Contrato() {
    
  }
  
  public Contrato(Integer numuero, LocalDate date, Double valorTotal) {
    this.numuero = numuero;
    this.date = date;
    this.valorTotal = valorTotal;
  }

  public Integer getNumuero() {
    return numuero;
  }

  public void setNumuero(Integer numuero) {
    this.numuero = numuero;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(Double valorTotal) {
    this.valorTotal = valorTotal;
  }

  public List<Parcelamento> getParcelamento() {
    return parcelamento;
  }
  
}
