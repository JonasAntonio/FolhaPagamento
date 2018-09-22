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
    
    public void printDetalhesFolhaPagamento(List<Campo> campos, Funcionario funcionario, Date data) {
        System.out.println("Folha de Pagamento: ");
        funcionario.toString();
        System.out.println("Data: " + data);
        for (Campo campo : campos) {
            campo.toString();
        }
    }
}
