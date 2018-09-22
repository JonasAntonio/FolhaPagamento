/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author juan
 */
public class CampoView {
    
    public void printDetalhesCampo(int codigo, String descricao, float referencia, float vencimentos, float descontos) {
        System.out.println("Campo: ");
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Referência: " + referencia);
        System.out.println("Vencimentos: " + vencimentos);
        System.out.println("Descontos: " + descontos);
    }
    
}
