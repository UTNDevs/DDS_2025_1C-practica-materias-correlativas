import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import domain.Alumno;
import domain.Inscripcion;
import domain.Materia;
import org.junit.Test;
import java.util.List;

public class InscripcionesTests {
  private final Materia aM1 = new Materia("Analisis matematico 1", null);
  private final Materia algebra = new Materia("Algebra", null);
  private final Materia fisica1 = new Materia("Fisica 1", null);

  private final Materia aM2 = new Materia("Analisis matematico 2", List.of(aM1, algebra));
  private final Materia fisica2 = new Materia("Fisica 2", List.of(algebra, aM2, fisica1));

  @Test
  public void inscripcionAprobada() {
    Alumno nacho = new Alumno("Ignacio", "174890", List.of(aM1, algebra, aM2, fisica1));
    Inscripcion inscripcion = new Inscripcion(nacho,fisica2);

    assertTrue(inscripcion.aprobada());
  }

  @Test
  public void inscripcionRechazada() {
    Alumno mati = new Alumno("Matias", "346785", List.of(aM1));
    Inscripcion inscripcion = new Inscripcion(mati,fisica2);

    assertFalse(inscripcion.aprobada());
  }

}
