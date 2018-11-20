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
public class SalarioComPremiacao implements SalarioStrategy {
    
    private float valorPremiacao;

    public float getValorPremiacao() {
        return valorPremiacao;
    }

    public void setValorPremiacao(float valorPremiacao) {
        this.valorPremiacao = valorPremiacao;
    }

    @Override
    public float calcularSalario(Funcionario funcionario) {
        float salarioBase = funcionario.getCargo().getSalarioBase();
        return salarioBase + 300;
    }
    
}
