/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Funcionario;

/**
 *
 * @author juan
 */
public class DepartamentoView {
    
    public void printDetalhesDepartamento(String nome, String setor, Funcionario gerente) {
        System.out.println("Departamento: ");
        System.out.println("Nome: " + nome);
        System.out.println("Setor: " + setor);
        System.out.println("Gerente: " + gerente.getMatricula() + "-->" + gerente.getNome() );
        System.out.println("________________________________\n");
    }
    
}
