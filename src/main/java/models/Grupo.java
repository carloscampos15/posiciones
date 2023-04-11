package models;

public class Grupo {

    private Long id;
    private Character letra;
    private Integer numeroEquipos;

    public Grupo(Long id, Character letra, Integer numeroEquipos) {
        this.id = id;
        this.letra = letra;
        this.numeroEquipos = numeroEquipos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getLetra() {
        return letra;
    }

    public void setLetra(Character letra) {
        this.letra = letra;
    }

    public Integer getNumeroEquipos() {
        return numeroEquipos;
    }

    public void setNumeroEquipos(Integer numeroEquipos) {
        this.numeroEquipos = numeroEquipos;
    }
}
