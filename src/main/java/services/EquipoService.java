package services;

import models.Equipo;

import java.util.List;

public class EquipoService {

    private List<Equipo> equipos;

    public void crearEquipo(){

    }

    //elkin
    public void actualizarEquipo(){

    }

    //wilmer
    public Equipo obtenerEquipo(Long id){
        return this.equipos.stream().filter(equipo -> equipo.getId().equals(id)).findFirst().get();
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
