/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author douglas, jonas, juan e lucas
 */
public class FolhaPagamento {

    private List<Campo> campos;
    private Funcionario funcionario;
    private String data;

    public FolhaPagamento() {
    }

    public FolhaPagamento(List<Campo> campos, Funcionario funcionario, String data) {
        this.campos = campos;
        this.funcionario = funcionario;
        this.data = data;
    }

    public List<Campo> getCampos() {
        campos.get(0).setVencimentos(this.funcionario.getSalario());
        campos.get(1).setDescontos(this.funcionario.inss());
        campos.get(2).setDescontos(this.funcionario.valeTransporte());
        campos.get(3).setDescontos(this.funcionario.planoSaude());
        return campos;
    }

    public void setCampos(List<Campo> campos) {
        this.campos = campos;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FolhaPagamento{" + "Campos= " + campos + ", Funcionario= " + funcionario + ", Data= " + data + "}";
    }

    public float calcularTotalVencimentos() {
        float vencimento = 0.0f;
        for (Campo campo : campos) {
            vencimento += campo.getVencimentos();
        }
        return vencimento;
    }

    public float calcularTotalDescontos() {
        float desconto = 0.0f;
        for (Campo campo : campos) {
            desconto += campo.getDescontos();
        }
        return desconto;
    }

    public float calcularSalarioLiquido() {
        return calcularTotalVencimentos() - calcularTotalDescontos();
    }

}
