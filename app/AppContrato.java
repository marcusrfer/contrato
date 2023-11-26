package exercicios.contrato.app;

import exercicios.contrato.entities.Contrato;
import exercicios.contrato.entities.Parcela;
import exercicios.contrato.services.ContratoService;
import exercicios.contrato.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppContrato {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do Contrato");
        System.out.print("Número: ");
        int numContrato = sc.nextInt();
        System.out.print("Data: ");
        Date dataContrato = sdf.parse(sc.next());
        System.out.print("Valor do Contrato: ");
        double valorContrato = sc.nextDouble();
        System.out.print("Quantidade de parcelas: ");
        int parcelas = sc.nextInt();

        Contrato contrato = new Contrato(numContrato, dataContrato, valorContrato);
        ContratoService cs = new ContratoService(new PaypalService());

        cs.faturamentoContrato(contrato, parcelas);

        System.out.println("Parcelamento");
        for (Parcela x : contrato.getParcelas()){
            System.out.println(x);
        }

        sc.close();

    }
}
