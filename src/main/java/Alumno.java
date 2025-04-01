import lombok.Setter;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;


public class Alumno {

    private String nombre;
    private String apellido;
    private Set<Materia> materiasAprobadas;


    public Alumno() {
        this.materiasAprobadas = new HashSet<>(); //inicializo la coleccion
    }

    public Set<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarMateriaAprobada(Materia materia){
        materiasAprobadas.add(materia); //agrego materia a la coleccion
    }

}
