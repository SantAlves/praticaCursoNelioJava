package modelEntidade;


import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

import modelExc.TratativasPersonalizadas;


public class Reserva {

  private Integer numeroQuarto;
  private Date deCheckin;
  private Date deCheckout;

  private static SimpleDateFormat confParaDataReserva = new SimpleDateFormat("dd-MM-yyyy");


  public Reserva(Integer numeroQuarto, Date deCheckin, Date deCheckout) {

    if (!deCheckout.after(deCheckin)){
      throw new TratativasPersonalizadas("Erro na reserva: datas de check-out devem ser depois da data de check-in." );
    }

    this.numeroQuarto = numeroQuarto;
    this.deCheckin = deCheckin;
    this.deCheckout = deCheckout;
  }

  public Integer getNumeroQuarto() {
    return numeroQuarto;
  }
  public void setNumeroQuarto(Integer numeroQuarto) {  
    this.numeroQuarto = numeroQuarto;
  }
  public Date getDeCheckin() {
    return deCheckin;
  }

  public Date getDeCheckout() {
    return deCheckout;
  }

  public long duracao() {
    long diferenca = deCheckout.getTime() - deCheckin.getTime();
    return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
  }

  public void atualizacaoData ( Date deCheckin, Date deCheckout) {
    
    Date agora = new Date();

    if(deCheckin.before(agora) || deCheckout.before(agora)){
        throw new TratativasPersonalizadas ("Erro na reserva: atualização apenas para datas futuras.");
    } 
    if(!deCheckout.after(deCheckin)){
        throw new TratativasPersonalizadas("Erro na reserva: datas de check-out devem ser depois da data de check-in." );
    }
    
    this.deCheckin = deCheckin;
    this.deCheckout = deCheckout;
  }

  @Override
  public String toString() {
    return "Quarto" 
    + numeroQuarto 
    + " Check-in" 
    + confParaDataReserva.format(deCheckin) 
    + ", Check-out" 
    + confParaDataReserva.format(deCheckout) 
    + ", " 
    + duracao() 
    + "Noites.";
  }
  
}
