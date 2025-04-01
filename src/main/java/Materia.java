import java.util.HashSet;
import java.util.Set;


public class Materia {

    private String nombre;
    private Set<Materia> correlativas;

    public Materia() {
        this.correlativas = new HashSet<>(); //inicializo la coleccion
    }


    public boolean cumpleCorrelativas(Set<Materia> materias){ //materias apribadas del alumno
        return this.getCorrelativas().containsAll(materias); //se fija si todas las correlativas estan dentro de las aprobadas
    }


    public Set<Materia> getCorrelativas() {
        return correlativas;
    }
}

    /*
    public boolean cumpleCorrelativas(Set<Materia> materias){
        return this.getCorrelativas()
                .stream()
                .allMatch(correlativa -> materias.contains(correlativa));       // OTRA OPCION: .allMatch(materias::contains);
    }
    //por cada correlativa se fija si esta aprobada
    */
