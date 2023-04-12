package services;

import models.Equipo;

import java.util.ArrayList;
import java.util.List;

public class EquipoService {

    private List<Equipo> equipos;

    public EquipoService() {
        this.equipos = new ArrayList<>();
    }

    public void crearEquipo(){

    }

    //elkin
    public void actualizarEquipo(){

    }

    //wilmer
    public Equipo obtenerEquipo(Long id){
        return null;
    }

    //jairo
    public List<Equipo> obtenerEquipos(){
        return this.equipos;
    }

    //Andres
    public List<Equipo> obtenerEquiposByGrupo(Long grupoId){
        return null;
    }

}
