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
            boolean premiacao, float salarioFinal) {
        System.out.println("Folha de Pagamento: ");
        System.out.println(funcionario.toString());
        System.out.println("Data: " + data);
        System.out.println("Premiação: " + premiacao);
        for (Campo campo : campos) {
            System.out.println(campo.toString());
        }
        System.out.println("Valor Total à Receber: R$ " + salarioFinal);
        System.out.println("________________________________\n");
    }
}
