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
public class Filial {
    
    protected Departamento departamento;
    FilialCareTaker careTaker;
    
    public Filial() {
        careTaker = new FilialCareTaker();
        departamento = new Departamento();
    }
    
    public void adicionarDepartamento(Departamento departamento) {
        careTaker.adicionarMemento(new FilialMemento(departamento));
        //falta alguma coisa aqui
    }
    
    public void desfazer() {
        departamento = careTaker.getUltimoEstadoSalvo().getDepartamentoSalvo();
    }
    
    public void mostrarDepartamento() {
        System.out.println(this.departamento.toString());
    }
    
}
