/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alunoces
 */
public class Campo {
    
    private int codigo;
    private String descricao;
    private float referencia;
    private float vencimentos;
    private float descontos;

    public Campo() {
      
    }
    
    public Campo(int codigo, String descricao, float referencia, float vencimentos, float descontos) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.referencia = referencia;
        this.vencimentos = vencimentos;
        this.descontos = descontos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getReferencia() {
        return referencia;
    }

    public void setReferencia(float referencia) {
        this.referencia = referencia;
    }

    public float getVencimentos() {
        return vencimentos;
    }

    public void setVencimentos(float vencimentos) {
        this.vencimentos = vencimentos;
    }

    public float getDescontos() {
        return descontos;
    }

    public void setDescontos(float descontos) {
        this.descontos = descontos;
    }

    @Override
    public String toString() {
        return "Campo { " + "Código = " + codigo + ", Descrição = " + descricao + ", Referência = " + referencia + ", Vencimentos = " + vencimentos + ", Descontos = " + descontos + " }";
    }
    
}
