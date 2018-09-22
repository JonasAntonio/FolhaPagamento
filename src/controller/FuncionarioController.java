/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import interfaces.Cargo;
import java.util.Date;
import model.Departamento;
import model.Funcionario;
import view.FuncionarioView;

/**
 *
 * @author juan
 */
public class FuncionarioController {
    
    private final Funcionario model;
    private final FuncionarioView view;

    public FuncionarioController(Funcionario model, FuncionarioView view) {
        this.model = model;
        this.view = view;
    }
    
    public String getNomeFuncionario() {
        return model.getNome();
    }

    public void setNomeFuncionario(String nome) {
        model.setNome(nome);
    }

    public String getCpfFuncionario() {
        return model.getCpf();
    }

    public void setCpfFuncionario(String cpf) {
        model.setCpf(cpf);
    }

    public String getRgFuncionario() {
        return model.getRg();
    }

    public void setRgFuncionario(String rg) {
        model.setRg(rg);
    }

    public Date getDataNascimentoFuncionario() {
        return model.getDataNascimento();
    }

    public void setDataNascimentoFuncionario(Date dataNascimento) {
        model.setDataNascimento(dataNascimento);
    }

    public String getMatriculaFuncionario() {
        return model.getMatricula();
    }

    public void setMatriculaFuncionario(String matricula) {
        model.setMatricula(matricula);
    }

    public String getEnderecoFuncionario() {
        return model.getEndereco();
    }

    public void setEnderecoFuncionario(String endereco) {
        model.setEndereco(endereco);
    }

    public String getTelefoneFuncionario() {
        return model.getTelefone();
    }

    public void setTelefoneFuncionario(String telefone) {
        model.setTelefone(telefone);
    }

    public Departamento getDepartamentoFuncionario() {
        return model.getDepartamento();
    }

    public void setDepartamentoFuncionario(Departamento departamento) {
        model.setDepartamento(departamento);
    }

    public Cargo getCargoFuncionario() {
        return model.getCargo();
    }

    public void setCargoFuncionario(Cargo cargo) {
        model.setCargo(cargo);
    }
    
    public void atualizaView() {
        view.printDetalhesFuncionario(model.getNome(), model.getCpf(), model.getRg(), model.getDataNascimento(), model.getMatricula(), model.getEndereco(), model.getTelefone(), model.getDepartamento(), model.getCargo());
    }
    
}
