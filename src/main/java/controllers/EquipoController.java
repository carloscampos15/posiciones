package controllers;

import models.Equipo;
import services.EquipoService;

import java.util.List;

public class EquipoController {

    private EquipoService equipoService;

    public EquipoController() {
        this.equipoService = new EquipoService();
    }

    //bryan
    public void crearEquipo(){

    }

    //elkin
    public void actualizarEquipo(){

    }

    //wilmer
    public Equipo obtenerEquipo(Long id){
        return this.equipoService.obtenerEquipo(id);
    }

    //jairo
    public List<Equipo> obtenerEquipos(){
        return this.equipoService.obtenerEquipos();
    }

    //Andres
    public List<Equipo> obtenerEquiposByGrupo(Long grupoId){
        return null;
    }

}
