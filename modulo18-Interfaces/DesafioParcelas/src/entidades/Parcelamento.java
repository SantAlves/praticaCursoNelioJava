package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelamento {
  
  private LocalDate date;
  private double valor;
  private static DateTimeFormatter configData = DateTimeFormatter.ofPattern("dd/MM/yyyy");


  public Parcelamento() {
    
  }
  public Parcelamento(LocalDate date, double valor) {
    this.date = date;
    this.valor = valor;
  }
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }
  public double getValor() {
    return valor;
  }
  public void setValor(double valor) {
    this.valor = valor;
  }

  @Override
  public String toString() {
    return date.format(configData) + " - " + String.format("%.2f",valor);
  }

}
