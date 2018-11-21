/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonas
 */
public class FilialCareTaker {
    protected List<FilialMemento> estados;
    
    public FilialCareTaker() {
        estados = new ArrayList<FilialMemento>();
    }
    
    public void adicionarMemento(FilialMemento memento) {
        estados.add(memento);
    }
    
    public FilialMemento getUltimoEstadoSalvo() {
        if (estados.size() <= 0) {
            return new FilialMemento(null);
        }
        FilialMemento estadoSalvo = estados.get(estados.size() - 1);
        estados.remove(estados.size() - 1);
        return estadoSalvo;
    }
}
