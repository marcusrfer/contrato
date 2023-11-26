package exercicios.contrato.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
    private Date dtVenc;
    private Double valorParcela;

    public Parcela(Date dtVenc, Double valorParcela) {
        this.dtVenc = dtVenc;
        this.valorParcela = valorParcela;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Date getDtVenc() {
        return dtVenc;
    }

    public void setDtVenc(Date dtVenc) {
        this.dtVenc = dtVenc;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    @Override
    public String toString() {
        return sdf.format(dtVenc) + " - " + String.format("%.2f", valorParcela);
    }
}
