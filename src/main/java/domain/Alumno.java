package domain;

import java.util.List;

public class Alumno {
  private String nombre;
  private String legajo;
  private List<Materia> materiasAprobadas;

  public Alumno(String nombre, String legajo, List<Materia> materiasAprobadas) {
    this.nombre = nombre;
    this.legajo = legajo;
    this.materiasAprobadas = materiasAprobadas;
  }

  public List<Materia> getMateriasAprobadas() {
    return materiasAprobadas;
  }

}
