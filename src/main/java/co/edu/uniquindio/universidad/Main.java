package co.edu.uniquindio.universidad;

import co.edu.uniquindio.universidad.model.Curso;
import co.edu.uniquindio.universidad.model.Docente;
import co.edu.uniquindio.universidad.model.Estudiante;

public class Main {


    public static void main(String[] args) {
         Estudiante estudiante1 = new Estudiante("Juan", 17, "Juan@gmail.com", 3,
                3.0, 3.5, 4.8);

         Estudiante estudiante2 = new Estudiante("Maria", 15, "Mari@gmail.com", 1,
                2.0, 2.5, 1.0);

         Estudiante estudiante3 = new Estudiante("Pepe", 20, "Pepe@gmail.com", 4,
                4.0, 2.5, 4.3);

          Docente docente = new Docente("Jorge", 40, "Anderson24@gmail.com");

          Curso curso = new Curso("Programacion1", 3, "02 nocturno", 8,
                  "Nocturna",estudiante1, estudiante2, estudiante3,docente);

        double notaDefinitivaEstudiante1 = estudiante1.calcularNotaDefinitiva(estudiante1.getNota1(), estudiante1.getNota2(),
                estudiante1.getNota3());
        double notaDefinitivaEstudiante2 = estudiante2.calcularNotaDefinitiva(estudiante2.getNota1(), estudiante2.getNota2(),
                estudiante2.getNota3());
        double notaDefinitivaEstudiante3 = estudiante3.calcularNotaDefinitiva(estudiante1.getNota1(), estudiante3.getNota2(),
                estudiante3.getNota3());

        System.out.println("La nota definitiva del estudiante 1 es : "+ notaDefinitivaEstudiante1);
        System.out.println("La nota definitiva del estudiante 2 es : "+ notaDefinitivaEstudiante2);
        System.out.println("La nota definitiva del estudiante 3 es : "+ notaDefinitivaEstudiante3);

        docente.calcularPromedioCurso(notaDefinitivaEstudiante1, notaDefinitivaEstudiante2,notaDefinitivaEstudiante3);
        docente.calcularPromedioEdad(estudiante1, estudiante2, estudiante3);
        docente.calcularPromedioNota1(estudiante1, estudiante2, estudiante3);

        docente.calcularNotaMayorDelCurso(estudiante1, estudiante2, estudiante3);
        docente.calcularNotaMenorCurso(estudiante1, estudiante2, estudiante3);


        docente.aprobacionCurso(notaDefinitivaEstudiante1, estudiante1.getNombre());
        docente.aprobacionCurso(notaDefinitivaEstudiante2, estudiante2.getNombre());
        docente.aprobacionCurso(notaDefinitivaEstudiante3, estudiante3.getNombre());

         int ganaronCurso= docente.cantidadGanaronCurso();
        docente.calcularPorcentajeGanaronCurso(ganaronCurso);
         int perdieronCurso = docente.cantidadperdieronCurso();
        docente.calcularPorcentajePerdieronCurso(perdieronCurso);

        docente.obtenerEstudianteNotaMayor4(estudiante1.getNombre(), estudiante1.getNota1(), estudiante1.getNota2(),
                estudiante1.getNota3());
        docente.obtenerEstudianteNotaMayor4(estudiante2.getNombre(), estudiante2.getNota1(), estudiante2.getNota2(),
                estudiante2.getNota3());
        docente.obtenerEstudianteNotaMayor4(estudiante3.getNombre(), estudiante3.getNota1(), estudiante3.getNota2(),
                estudiante3.getNota3());

        docente.cantidadEstudiantesNotasMayor4();
        docente.calcularNotaMaximaEstudiante(estudiante1);
        docente.calcularNotaMaximaEstudiante(estudiante2);
        docente.calcularNotaMaximaEstudiante(estudiante3);



    }


}
