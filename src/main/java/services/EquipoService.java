package services;

import models.Equipo;
import models.Grupo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class EquipoService {

    private List<Grupo> grupos;
    private List<Equipo> equipos;

    public EquipoService() {
        this.equipos = new ArrayList<>();
    }

    public void crearEquipo(){

    }

    //elkin
    public void actualizarEquipo(String oldName, String newName, Integer goles, char charGrupo) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equals(oldName)) {
                for (Grupo grupo : grupos) {
                    if (grupo.getLetra().equals(charGrupo)) {
                        equipo.setGrupo(grupo);
                    }
                }
                equipo.setNombre(newName);
                equipo.setGoles(goles);
                JOptionPane.showMessageDialog(null, "El equipo ha sido actualizado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "El equipo no existe");
            }
        }

    }

    public Equipo obtenerEquipo(Long id){
        return this.equipos.stream().filter(equipo -> equipo.getId().equals(id)).findFirst().get();
    }

    //jairo
    public List<Equipo> obtenerEquipos(){
        return this.equipos;
    }

    //Andres
    public List<Equipo> obtenerEquiposByGrupo(Long grupoId){

        List<Equipo> equiposByGrupo = new ArrayList<>();
        for (Equipo equipo : this.equipos) {
            if (equipo.getGrupo().getId() == grupoId) {
                equiposByGrupo.add(equipo);
            }
        }
        return equiposByGrupo;
    }

}
