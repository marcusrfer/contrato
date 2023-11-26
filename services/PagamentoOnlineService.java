package exercicios.contrato.services;

public interface PagamentoOnlineService {

    double pagamentoTaxa(double valorParcela);

    public double pagamentoJuros(double valorParcela, int parcelas);
}
