/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author douglas, jonas, juan e lucas
 */
public class Departamento {

    private String nome;
    private String setor;
    private Funcionario gerente;

    public Departamento() {
    }

    public Departamento(String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
    }

    public Departamento(String nome, String setor, Funcionario gerente) {
        this.nome = nome;
        this.setor = setor;
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nome=" + nome + ", setor=" + setor + ", gerente=" + gerente + '}';
    }

}
