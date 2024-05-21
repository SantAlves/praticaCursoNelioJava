package servicos;

public interface PagOnlineServicos {
  
  double taxaPagemento(double valor);
  double interesse (double valor, int meses);
  
}
