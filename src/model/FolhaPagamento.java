/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.OpcaoPagamento;
import java.util.List;

/**
 *
 * @author alunoces
 */
public class FolhaPagamento {
    
    private List<Campo> campos;
    private Funcionario funcionario;
    private String data;
    private OpcaoPagamento opcaoPagmento;

    public FolhaPagamento() {
    }

    public FolhaPagamento(List<Campo> campos, Funcionario funcionario, String data, OpcaoPagamento opPagamento) {
        this.campos = campos;
        this.funcionario = funcionario;
        this.data = data;
        this.opcaoPagmento = opPagamento;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public OpcaoPagamento getOpcaoPagmento() {
        return opcaoPagmento;
    }

    public void setOpcaoPagmento(OpcaoPagamento opcaoPagmento) {
        this.opcaoPagmento = opcaoPagmento;
    }
    
    @Override
    public String toString() {
        return "FolhaPagamento{" + "campos=" + campos + ", funcionario=" + funcionario + ", data=" + data + '}';
    }    
    
    public void processarFolha(){
        this.opcaoPagmento.liberarPagamento(this.funcionario);
    }
    
}
