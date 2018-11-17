/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.Cargo;

/**
 *
 * @author douglas, jonas, juan e lucas
 */
public class Funcionario {

    private String nome;
    private String cpf;
    private String rg;
    private String dataNascimento;
    private String matricula;
    private String endereco;
    private String telefone;
    private Departamento departamento;
    private Cargo cargo;
    private int vales;
    private float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String rg, String dataNascimento, String matricula, String endereco, String telefone, Departamento departamento, Cargo cargo, int vales, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
        this.endereco = endereco;
        this.telefone = telefone;
        this.departamento = departamento;
        this.cargo = cargo;
        this.vales = vales;
        this.salario = salario;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
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

    public int getVales() {
        return vales;
    }

    public void setVales(int vales) {
        this.vales = vales;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float valeTransporte() {
        if ((this.salario * 0.06f) > (this.vales * 3.10f)) {
            return salario * 0.06f;
        } else {
            return this.vales * 3.10f;
        }
    }

    public float inss() {
        return this.salario * 0.08f;
    }

    public float planoSaude() {
        return this.salario * 0.04f;
    }

    @Override
    public String toString() {
        return "Funcionario {"
                + "\n\tnome=" + nome
                + "\n\tcpf=" + cpf
                + "\n\trg=" + rg
                + "\n\tdataNascimento=" + dataNascimento
                + "\n\tmatricula=" + matricula
                + "\n\tendereco=" + endereco
                + "\n\ttelefone=" + telefone
                + "\n\tdepartamento=" + departamento.getNome()
                + "\n\tcargo=" + cargo.exibirInfo() + " }";
    }

}
