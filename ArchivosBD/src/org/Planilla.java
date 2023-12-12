/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

/**
 *
 * @author Fernando
 */
public class Planilla {
    public int id_planilla;
    public int anho;
    public String mes;
    public int empresa_id_empresa;

    public Planilla(int id_planilla, int anho, String mes, int empresa_id_empresa) {
        this.id_planilla = id_planilla;
        this.anho = anho;
        this.mes = mes;
        this.empresa_id_empresa = empresa_id_empresa;
    }

    public Planilla() {
    }

    
    public int getId_planilla() {
        return id_planilla;
    }

    public void setId_planilla(int id_planilla) {
        this.id_planilla = id_planilla;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getEmpresa_id_empresa() {
        return empresa_id_empresa;
    }

    public void setEmpresa_id_empresa(int empresa_id_empresa) {
        this.empresa_id_empresa = empresa_id_empresa;
    }
    
    @Override
	public String toString() {
		return "Planilla [id_planilla=" + id_planilla + ", anho=" + anho
				+ ", mes=" + mes + ", mes=" + empresa_id_empresa + "]";
	}
    
}
