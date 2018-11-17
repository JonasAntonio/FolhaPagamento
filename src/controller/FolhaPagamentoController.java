/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import java.util.List;
import model.Campo;
import model.FolhaPagamento;
import model.Funcionario;
import view.FolhaPagamentoView;

/**
 *
 * @author douglas, jonas, juan e lucas
 */
public class FolhaPagamentoController {

    private final FolhaPagamento model;
    private final FolhaPagamentoView view;

    public FolhaPagamentoController(FolhaPagamento model, FolhaPagamentoView view) {
        this.model = model;
        this.view = view;
    }

    public List<Campo> getCampos() {
        return model.getCampos();
    }

    public void setCampos(List<Campo> campos) {
        model.setCampos(campos);
    }

    public Funcionario getFuncionario() {
        return model.getFuncionario();
    }

    public void setFuncionario(Funcionario funcionario) {
        model.setFuncionario(funcionario);
    }

    public String getData() {
        return model.getData();
    }

    public void setData(String data) {
        model.setData(data);
    }

    public void atualizaView() {
        view.printDetalhesFolhaPagamento(model.getCampos(), model.getFuncionario(), model.getData(),
                model.calcularSalarioLiquido(), model.calcularTotalDescontos(), model.calcularTotalVencimentos());
    }

}
