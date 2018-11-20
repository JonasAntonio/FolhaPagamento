/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.ArrayList;
import java.util.List;
import model.Funcionario;

/**
 *
 * @author jonas
 */
public class FuncionarioCareTaker {
    protected List<Funcionario> estados;
    
    public FuncionarioCareTaker() {
    estados = new ArrayList<Funcionario>();
    }
    public void adicionarMemento(Funcionario memento) {
    estados.add(memento);
    }
    public Funcionario getUltimoEstadoSalvo() {
    if (estados.size() <= 0) {
    return new Funcionario();
    }
    Funcionario estadoSalvo = estados.get(estados.size() - 1);
    estados.remove(estados.size() - 1);
    return estadoSalvo;
    }
}
