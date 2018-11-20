/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Departamento;
import model.Funcionario;
import view.DepartamentoView;

/**
 *
 * @author juan
 */
public class DepartamentoController {
    
    private final Departamento model;
    private final DepartamentoView view;

    public DepartamentoController(Departamento model, DepartamentoView view) {
        this.model = model;
        this.view = view;
    }
    
    public String getNomeDepartamento() {
        return model.getNome();
    }

    public void setNomeDepartamento(String nome) {
        model.setNome(nome);
    }

    public String getSetor() {
        return model.getSetor();
    }

    public void setSetor(String setor) {
        model.setSetor(setor);
    }

    public Funcionario getGerente() {
        return model.getGerente();
    }

    public void setGerente(Funcionario gerente) {
        model.setGerente(gerente);
    }
    
    public void atualizaView() {
        view.printDetalhesDepartamento(model.getNome(), model.getSetor(), model.getGerente());
    }
    
}
