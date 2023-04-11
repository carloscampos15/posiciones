package models;

public class Equipo {

    private Long id;
    private String nombre;
    private Integer goles;
    private Grupo grupo;

    public Equipo(Long id, String nombre, Integer goles, Grupo grupo) {
        this.id = id;
        this.nombre = nombre;
        this.goles = goles;
        this.grupo = grupo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getGoles() {
        return goles;
    }

    public void setGoles(Integer goles) {
        this.goles = goles;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}
