package exercicios.contrato.services;

import exercicios.contrato.entities.Contrato;
import exercicios.contrato.entities.Parcela;

import java.util.Calendar;
import java.util.Date;

public class ContratoService {

    private PagamentoOnlineService pagamentoOnlineService;

    public ContratoService(PagamentoOnlineService pagamentoOnlineService) {
        this.pagamentoOnlineService = pagamentoOnlineService;
    }

    public void faturamentoContrato(Contrato ct, int parcelas) {
        double valorParcelaBase = ct.getValorContrato() / parcelas;

        for (int i = 1; i <= parcelas; i++) {
            Date dataVenc = somaMes(ct.getDtContrato(), i);
            double vlrParcJuro = valorParcelaBase + pagamentoOnlineService.pagamentoJuros(valorParcelaBase, i);
            double valorFinal = vlrParcJuro + pagamentoOnlineService.pagamentoTaxa(vlrParcJuro);
            ct.addParcelas(new Parcela(dataVenc, valorFinal));
        }
    }

    private Date somaMes(Date data, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }
}
