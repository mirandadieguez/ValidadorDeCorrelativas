import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    @DisplayName("Test que verifica si se agrega correctamente una materia a la coleccion de materias aprobadas")

    public void agregarMateriaAprobada(){    //puede llamarse distinto a la funcion original
        Alumno alumno = new Alumno();
        Materia materiaAgregada = new Materia();

        alumno.agregarMateriaAprobada(materiaAgregada);

        Assertions.assertTrue(alumno.getMateriasAprobadas().contains(materiaAgregada));
    }


}