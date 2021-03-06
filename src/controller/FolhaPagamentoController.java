/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Campo;
import model.FolhaPagamento;
import model.Funcionario;
import strategy.SalarioComPremiacao;
import strategy.SalarioSemPremiacao;
import strategy.SalarioStrategy;
import view.FolhaPagamentoView;

/**
 *
 * @author juan
 */
public class FolhaPagamentoController {
    
    private final FolhaPagamento model;
    private final FolhaPagamentoView view;
    private SalarioStrategy estrategiaSalario;

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
        view.printDetalhesFolhaPagamento(model.getCampos(), model.getFuncionario(), model.getData(), model.getFuncionario().isPremiacao(), this.calcularSalario());
    }
    
    //Usa o Strategy Method
    public float calcularSalario() {
        if(this.model.getFuncionario().isPremiacao()) {
            estrategiaSalario = new SalarioComPremiacao();
            return estrategiaSalario.calcularSalario(this.model.getFuncionario());
        } else {
            estrategiaSalario = new SalarioSemPremiacao();
            return estrategiaSalario.calcularSalario(this.model.getFuncionario());
        }
    }
    
}
