/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.cargo;

import interfaces.Cargo;

/**
 *
 * @author alunoces
 */
public class CargoAnalista implements Cargo {

    private float salarioBase;

    public CargoAnalista() {
    }

    public CargoAnalista(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    @Override
    public void exibirInfo() {
        System.out.println("Cargo: Analista de Sistemas");
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    
}
