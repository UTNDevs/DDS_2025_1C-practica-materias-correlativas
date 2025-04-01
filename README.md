# Documentacion de la solucion propuesta

[Diagrama de clases](./docs/class_diagram.puml)

# Justificacion de diseño

Para este diseño se penso en un relacion de composicion entre la clase inscripcion, materia y entre inscripcion alumno. Ya que para el modelo, no puede existir una 
inscripcion sin una materia y un alumno asociado. Dentro de esta clase solo se contara con un metodo "aprobada()" que se encargara de validar si las materias
aprobadas por el alumno estan en las materias correlativas necesarias para cursar la nueva materia.