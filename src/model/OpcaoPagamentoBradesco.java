package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import interfaces.OpcaoPagamento;
import model.Funcionario;

/**
 *
 * @author Lucas Silva
 */
public class OpcaoPagamentoBradesco implements OpcaoPagamento {

    @Override
    public void liberarPagamento(Funcionario f) {
        System.out.println("Pagamento do funcionário " + f.getNome() + " realizado atráves do Banco Bradesco");
    }
    
}
