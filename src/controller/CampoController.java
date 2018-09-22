/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Campo;
import view.CampoView;

/**
 *
 * @author juan
 */
public class CampoController {
    private final Campo model;
    private final CampoView view;

    public CampoController(Campo model, CampoView view){
	this.model = model;
	this.view = view;
    }

    public CampoController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigoCampo() {
        return model.getCodigo();
    }

    public void setCodigoCampo(int codigo) {
        model.setCodigo(codigo);
    }

    public String getDescricaoCampo() {
        return model.getDescricao();
    }

    public void setDescricaoCampo(String descricao) {
        model.setDescricao(descricao);
    }

    public float getReferenciaCampo() {
        return model.getReferencia();
    }

    public void setReferenciaCampo(float referencia) {
        model.setReferencia(referencia);
    }

    public float getVencimentosCampo() {
        return model.getVencimentos();
    }

    public void setVencimentosCampo(float vencimentos) {
        model.setVencimentos(vencimentos);
    }

    public float getDescontosCampo() {
        return model.getDescontos();
    }

    public void setDescontosCampo(float descontos) {
        model.setDescontos(descontos);
    }
    
    public void atualizaView(){				
        view.printDetalhesCampo(model.getCodigo(), model.getDescricao(), model.getReferencia(), model.getVencimentos(), model.getDescontos());
    }	
}
