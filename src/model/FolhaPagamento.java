/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author alunoces
 */
public class FolhaPagamento {
    
    private List<Campo> campos;
    private Funcionario funcionario;
    private Date data;

    public FolhaPagamento() {
    }

    public FolhaPagamento(List<Campo> campos, Funcionario funcionario, Date data) {
        this.campos = campos;
        this.funcionario = funcionario;
        this.data = data;
    }

    public List<Campo> getCampos() {
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
