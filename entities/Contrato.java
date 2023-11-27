package interfaces.contrato.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
    private int numContrato;
    private Date dtContrato;
    private Double valorContrato;

    List<Parcela> parcelas = new ArrayList<>();

    public Contrato(int numContrato, Date dtContrato, Double valorContrato) {
        this.numContrato = numContrato;
        this.dtContrato = dtContrato;
        this.valorContrato = valorContrato;
    }

    public int getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(int numContrato) {
        this.numContrato = numContrato;
    }

    public Date getDtContrato() {
        return dtContrato;
    }

    public void setDtContrato(Date dtContrato) {
        this.dtContrato = dtContrato;
    }

    public Double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(Double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void addParcelas(Parcela parcela) {
        parcelas.add(parcela);
    }

    public void removeParcelas(Parcela parcela){
        parcelas.remove(parcela);
    }

}
