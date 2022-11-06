/*
 * Copyright (C) 2016 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.samples.managedbeans;

import edu.eci.pdsw.samples.entities.Paciente;
import edu.eci.pdsw.samples.entities.TipoIdentificacion;
import edu.eci.pdsw.samples.services.ServiciosPacientesFactory;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author hcadavid
 */
@ManagedBean(name = "mb")
@SessionScoped
public class PacientesBean {

    TipoIdentificacion tipoIdentificacion;
    Paciente selectedPaciente;

    List<Paciente> menoresContagiados;

    public List<Paciente> getMenoresEnfermos() {
        return menoresContagiados;
    }

    public void loadEnfermos(){
        try {
            menoresContagiados = ServiciosPacientesFactory.getInstance().getForumsServices().consultarMenoresEnfermos();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Paciente getSelectedPaciente() {
        return selectedPaciente;
    }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void getData(int id, TipoIdentificacion tipo){
        try {
            selectedPaciente = ServiciosPacientesFactory.getInstance().getForumsServices().consultarPacientesPorId(id, tipo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public TipoIdentificacion[] getTiposIdentificacion() {
        return TipoIdentificacion.values();
    }
    
}
