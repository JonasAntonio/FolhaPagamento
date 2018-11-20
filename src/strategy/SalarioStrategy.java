/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import model.Funcionario;

/**
 *
 * @author jonas
 */
public interface SalarioStrategy {
    public float calcularSalario(Funcionario funcionario);
}
