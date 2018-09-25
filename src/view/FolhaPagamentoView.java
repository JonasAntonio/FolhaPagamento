/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Date;
import java.util.List;
import model.Campo;
import model.Funcionario;

/**
 *
 * @author juan
 */
public class FolhaPagamentoView {

    public void printDetalhesFolhaPagamento(List<Campo> campos, Funcionario funcionario, String data,
            float calcularSalarioLiquido, float calcularTotalDescontos, float calcularTotalVencimentos) {
        System.out.println("Folha de Pagamento: ");
        System.out.println(funcionario.toString());
        System.out.println("Data: " + data);
        for (Campo campo : campos) {
            System.out.println(campo.toString());
        }
        System.out.println("Total de Vencimento= " + Float.toString(calcularTotalVencimentos));
        System.out.println("Total de descontos= " + Float.toString(calcularTotalDescontos));
        System.out.println("Salário líquido= " + Float.toString(calcularSalarioLiquido));
        System.out.println("________________________________\n");
    }

}
