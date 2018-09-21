/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fabrica;

import interfaces.Cargo;
import interfaces.FabricaCargos;
import model.cargo.CargoAdministrativo;

/**
 *
 * @author alunoces
 */
public class FabricaAdministrativo implements FabricaCargos {

    @Override
    public Cargo criarCargo() {
        return new CargoAdministrativo();
    }
    
}
