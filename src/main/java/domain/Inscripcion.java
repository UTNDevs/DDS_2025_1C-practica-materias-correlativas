package domain;

import java.util.List;

public class Inscripcion {
  private Alumno alumno;
  private Materia materia;

  public Inscripcion(Alumno alumno, Materia materia) {
    this.alumno = alumno;
    this.materia = materia;
  }

  public boolean aprobada(){
    List<Materia> materiasAprobadas = alumno.getMateriasAprobadas();
    List<Materia> materiasNecesarias = materia.getCorrelativas();

    for (Materia materiaNecesaria : materiasNecesarias) {
      if (!materiasAprobadas.contains(materiaNecesaria))
        return false;
    }
    return true;
  }

}
