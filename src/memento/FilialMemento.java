/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import model.Departamento;

/**
 *
 * @author jonas
 */
public class FilialMemento {
    protected Departamento departamento;
    
    public FilialMemento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public model.Departamento getDepartamentoSalvo() {
        return departamento;
    }
}
