import exepcioens.AlumnoNoEncontrado;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colegio {
    List<Alumnos> alumnos;

    public Colegio() {
        alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumnos alumno) {
        if (alumno == null) {
            throw new IllegalArgumentException(
                    "El alumno no puede estar vacía");
        }
        if (alumnos.contains(alumno)) {
            throw new IllegalArgumentException(
                    "El alumno ya existe");
        }
        alumnos.add(alumno);
    }

    public void nacionalidadCantidad(String nacionalidad) {
        if (nacionalidad == null || nacionalidad.isBlank()) {
            throw new IllegalArgumentException("El nacionalidad no puede estar vacía");
        }
        int cantidad = 0;
        for (Alumnos a : alumnos) {
            if (a == null) {
                throw new IllegalArgumentException("La lista tiene un alumno nulo");
            }
            if (a.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                cantidad++;
            }
        }
        System.out.println(nacionalidad + ": " + cantidad);
    }

    public void cuantos(){
        Set<String> nacionalidades = new HashSet<>();

        for (Alumnos a : alumnos) {
            if (a == null) {
                throw new IllegalArgumentException("La lista tiene un alumno nulo");
            }
            nacionalidades.add(a.getNacionalidad().toUpperCase());
        }

        System.out.println(nacionalidades.size());
    }

    public void borrarAlumno(Alumnos alumno) throws AlumnoNoEncontrado{
        if (alumno == null) {
            throw new IllegalArgumentException("El alumno es nulo");
        }
        if(!alumnos.remove(alumno)){
            throw new AlumnoNoEncontrado("Alumno no encontrado");
        }
    }

    public void verTodos() {
        Set<String> nacionalidades = new HashSet<>();
        for (Alumnos a : alumnos) {
            nacionalidades.add(a.getNacionalidad().toUpperCase());
        }
        for (String nacionalidad : nacionalidades) {
            nacionalidadCantidad(nacionalidad);
        }
    }

}


