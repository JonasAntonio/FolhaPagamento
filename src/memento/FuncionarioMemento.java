/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import model.Funcionario;

/**
 *
 * @author jonas
 */
public class FuncionarioMemento {
    protected Funcionario funcionario;
    
    public FuncionarioMemento(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public model.Funcionario getFuncionarioSalvo() {
        return funcionario;
    }
}
