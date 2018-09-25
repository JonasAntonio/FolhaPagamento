/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.cargo;

import interfaces.Cargo;

/**
 *
 * @author douglas, jonas, juan e lucas
 */
public class CargoSuporte implements Cargo {

    public CargoSuporte() {
    }

    @Override
    public String exibirInfo() {
        return "Suporte de Sistemas";
    }

}
