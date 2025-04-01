import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    @DisplayName("Test que verifica que si la materias que el alumno quiere cursar cumplen sus correlativas, la inscripcion esta aprobada")
    public void aprobada() {

        Alumno alumno = new Alumno();
        Inscripcion inscripcion= new Inscripcion(alumno);

        Materia desarrolloDeSoftware = new Materia();
        Materia arquitecturaDeComputadoras = new Materia();
        Materia analisisDeSistemas = new Materia();

        alumno.agregarMateriaAprobada(arquitecturaDeComputadoras);
        alumno.agregarMateriaAprobada(analisisDeSistemas);

        desarrolloDeSoftware.getCorrelativas().add(arquitecturaDeComputadoras);
        desarrolloDeSoftware.getCorrelativas().add(analisisDeSistemas);

        inscripcion.getMateriasACursar().add(desarrolloDeSoftware);

        Assertions.assertTrue(inscripcion.aprobada());




    }
}