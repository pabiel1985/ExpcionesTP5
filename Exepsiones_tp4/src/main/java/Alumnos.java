import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Alumnos {
    private String nombre;
    private String nacionalidad;


    public Alumnos(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Alumnos alumnos)) return false;
        return Objects.equals(nombre, alumnos.nombre) && Objects.equals(nacionalidad, alumnos.nacionalidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nacionalidad);
    }
}
