package entidade;

import entidade_enum.NivelTrabalhador;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Trabalhador {
  
  private String nome;
  private NivelTrabalhador nivel;
  private double baseSalario;


  private Departamento departamento;
  private List<ContratoHora> contrato = new ArrayList<ContratoHora>();

  public Trabalhador() {

  }

  public Trabalhador(String nome, NivelTrabalhador nivel, double baseSalario, Departamento departamento) {
    this.nome = nome;
    this.nivel = nivel;
    this.baseSalario = baseSalario;
    this.departamento = departamento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public NivelTrabalhador getNivel() {
    return nivel;
  }

  public void setNivel(NivelTrabalhador nivel) {
    this.nivel = nivel;
  }

  public double getBaseSalario() {
    return baseSalario;
  }

  public void setBaseSalario(double baseSalario) {
    this.baseSalario = baseSalario;
  }

  public Departamento getDepartamento() {
    return departamento;
  }

  public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
  }

  public List<ContratoHora> getContrato() {
    return contrato;
  }

  public void addContrato(ContratoHora contratos) {
    contrato.add(contratos);

  }
  public void removeContrato(ContratoHora contratos) {
    contrato.remove(contratos);

  }

  public double renda(int ano, int mes){
    double soma = baseSalario;
    Calendar cal = Calendar.getInstance();

    for (ContratoHora c : contrato){
     
      cal.setTime(c.getData());
      int c_ano = cal.get(Calendar.YEAR);
      int c_mes = 1 + cal.get(Calendar.MONTH);
     
      if(ano == c_ano && mes == c_mes) {
        soma += c.totalValor();
      }
      
    }
    return soma;
  }

}
