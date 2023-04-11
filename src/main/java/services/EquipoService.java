package services;

import models.Equipo;
import models.Grupo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class EquipoService {

    private List<Grupo> grupos = new ArrayList<>();

    public void crearEquipo(){

    }

    //elkin
    public void actualizarEquipo(Equipo equipo){
        String newName = JOptionPane.showInputDialog(null,"Digite el nuevo nombre del equipo");
        String goles = JOptionPane.showInputDialog(null,"Digite el nuevo nombre del equipo");
        String charGrupo = JOptionPane.showInputDialog(null,"Digite el nuevo nombre del equipo");
        for (Grupo grupo: grupos){
            if (grupo.getLetra().equals(charGrupo)){
                equipo.setGrupo(grupo);
            }
        }
        equipo.setNombre(newName);
        equipo.setGoles(Integer.parseInt(goles));
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
