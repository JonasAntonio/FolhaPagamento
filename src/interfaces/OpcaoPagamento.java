/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import model.Funcionario;

/**
 *
 * @author Lucas Silva
 */
public interface OpcaoPagamento {
    
    public void liberarPagamento(Funcionario f);
    
}
