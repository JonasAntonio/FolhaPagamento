/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import interfaces.Cargo;
import model.Departamento;

/**
 *
 * @author juan
 */
public class FuncionarioView {
    
    public void printDetalhesFuncionario(String nome, String cpf, String rg, 
            String dataNascimento, String matricula, String endereco, String telefone,
            Departamento departamento, Cargo cargo, boolean premiacao) {
        System.out.println("Funcionário: ");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Matricula: " + matricula);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Departamento: " + departamento.getNome());
        cargo.exibirInfo();
        System.out.println("Premiado: " + premiacao);
        System.out.println("________________________________\n");
    }
    
}
