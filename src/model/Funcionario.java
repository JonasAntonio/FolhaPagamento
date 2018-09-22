/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.Cargo;
import java.util.Date;

/**
 *
 * @author Jonas Antônio Gomes Vicente
 */
public class Funcionario {

    private String nome;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private String matricula;
    private String endereco;
    private String telefone;
    private Departamento departamento;
    private Cargo cargo;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String rg, Date dataNascimento, String matricula, String endereco, String telefone, Departamento departamento, Cargo cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
        this.endereco = endereco;
        this.telefone = telefone;
        this.departamento = departamento;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dataNascimento=" + dataNascimento + ", matricula=" + matricula + ", endereco=" + endereco + ", telefone=" + telefone + ", departamento=" + departamento + ", cargo=" + cargo + '}';
    }

}
