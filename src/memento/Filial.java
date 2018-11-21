/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.ArrayList;
import java.util.List;
import model.Departamento;

/**
 *
 * @author jonas
 */
public class Filial {
    
    protected List<Departamento> departamentos;
    FilialCareTaker careTaker;
    
    public Filial() {
        careTaker = new FilialCareTaker();
        departamentos = new ArrayList();
    }
    
    public void adicionarDepartamento(Departamento novoDepartamento) {
        careTaker.adicionarMemento(new FilialMemento(novoDepartamento));
        departamentos.add(novoDepartamento);
    }
    
    public void desfazer() {
        departamentos.remove(careTaker.getUltimoEstadoSalvo().getDepartamentoSalvo());
    }
    
    public void mostrarDepartamento() {
        for (Departamento departamento : departamentos) {
            System.out.println(departamento.toString());
        }
    }
    
}
