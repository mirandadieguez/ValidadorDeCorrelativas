import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Inscripcion {

    private Set<Materia> materiasACursar;
    private boolean fueAprobada;
    private Alumno alumno;
    private LocalDateTime fechaDeEvaluacion;

    public Inscripcion(Alumno alumno) {
        this.materiasACursar = new HashSet<>(); //inicializo la coleccion
        this.alumno = alumno;
    }

    public boolean aprobada(){
        return this.materiasACursar
                .stream()
                .allMatch(m -> m.cumpleCorrelativas( alumno.getMateriasAprobadas() ));
                // verifica que cada materia que quiera cursar cumpla las correlativas
    }

    public Set<Materia> getMateriasACursar() {
        return materiasACursar;
    }
}
