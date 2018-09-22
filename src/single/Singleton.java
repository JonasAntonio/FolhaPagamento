/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package single;

import java.util.ArrayList;
import java.util.List;
import model.Campo;
import model.Departamento;
import model.FolhaPagamento;
import model.Funcionario;

/**
 *
 * @author juan
 */
public class Singleton {
    
    private static Singleton instance;
    public List<Campo> campos;
    public List<Departamento> departamentos;
    public List<Funcionario> funcionarios;
    public List<FolhaPagamento> folhasPagamentos;
    
    private Singleton() {
        campos = new ArrayList<>();
        departamentos = new ArrayList<>();
        funcionarios = new ArrayList<>();
        folhasPagamentos = new ArrayList<>();
    }
    
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
   
}
