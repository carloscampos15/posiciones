package controllers;

import models.Equipo;
import services.EquipoService;

import java.util.List;

public class EquipoController {

    private EquipoService equipoService;

    public EquipoController(){
        this.equipoService = new EquipoService();
    }

    //bryan
    public void crearEquipo(){

    }

    //elkin
    public void actualizarEquipo(String oldName, String newName, Integer goles, char charGrupo) {
        equipoService.actualizarEquipo(oldName, newName, goles, charGrupo);
    }

    //wilmer
    public Equipo obtenerEquipo(Long id){
        return null;
    }

    //jairo
    public List<Equipo> obtenerEquipos(){
        return null;
    }

    //Andres
    public List<Equipo> obtenerEquiposByGrupo(Long grupoId){
        return null;
    }

}
