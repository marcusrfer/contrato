package exercicios.contrato.services;

public class PaypalService implements PagamentoOnlineService {
    private static final double TAXA = 0.02;
    private static final double JUROS = 0.01;

    @Override
    public double pagamentoTaxa(double valorParcela) {
        return valorParcela * TAXA;
    }

    @Override
    public double pagamentoJuros(double valorParcela, int parcela) {
        return valorParcela * JUROS * parcela;
    }
}
