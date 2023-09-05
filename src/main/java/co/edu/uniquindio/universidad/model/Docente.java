package co.edu.uniquindio.universidad.model;

public class Docente {
    private String nombre;
    private int edad;
    private String correo;

    public static int ganaronCurso= 0;
    public static int perdieronCurso= 0;
    public static int CantidadEstudiantesNotaMayor4= 0;

    public Docente(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }
    public  double calcularDefinitivaEstudiante(double nota1, double nota2, double nota3){

        double notaDefinitiva = (nota1+nota2+nota3)/3;
        return notaDefinitiva;
    }
    public  void calcularPromedioCurso( double definitivaEstudiante1, double definitivaEstudiante2,
                                              double definitivaEstudiante3){

        double promCurso = 0;

        promCurso = (definitivaEstudiante1 + definitivaEstudiante2 + definitivaEstudiante3) / 3;

        System.out.println("El promedio del curso es : " + promCurso);
    }
    public void calcularPromedioEdad(Estudiante estudiante1, Estudiante estudiante2,
                                             Estudiante estudiante3) {

        double promEdad = 0;

        promEdad = (Double.valueOf(estudiante1.getEdad()) + Double.valueOf(estudiante2.getEdad())
                + Double.valueOf(estudiante3.getEdad())) / 3;

        System.out.println("El Promedio de edad de los estudiantes es de : " + promEdad);
    }
    public void calcularPromedioNota1(Estudiante estudiante1, Estudiante estudiante2,
                                              Estudiante estudiante3) {

        double promNota1 = 0;

        promNota1 = (estudiante1.getNota1() + estudiante2.getNota1() + estudiante3.getNota1()) / 3;

        System.out.println("El Promedio de la nota 1 de los estudiantes en el curso es: " + promNota1);

    }
    public double calcularNotaMaxEst(double nota1, double nota2, double nota3) {

        double notaMaxEst = nota1;

        if (nota2 > notaMaxEst) {
            notaMaxEst = nota2;
        }
        if(nota3 > notaMaxEst) {
            notaMaxEst = nota3;
        }
        return notaMaxEst;
    }

    public void calcularNotaMayorDelCurso(Estudiante estudiante1, Estudiante estudiante2,
                                                  Estudiante estudiante3) {

        double notaMaxEst1 = calcularNotaMaxEst(estudiante1.getNota1(),estudiante1.getNota2(), estudiante1.getNota3());
        double notaMaxEst2 = calcularNotaMaxEst(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());
        double notaMaxEst3 = calcularNotaMaxEst(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());
        double notaMayorCurso = notaMaxEst1;

        if (notaMaxEst2 > notaMayorCurso) {
            notaMayorCurso = notaMaxEst2;
        }
        if(notaMaxEst3 > notaMayorCurso){
            notaMayorCurso = notaMaxEst3;
        }
        System.out.println("La nota mayor del curso es : " + notaMayorCurso);
    }
    public double calcularNotaMinimaEstudiante( double nota1, double nota2, double nota3) {

        double notaMinimaEstudiante = nota1;

        if (nota2 < notaMinimaEstudiante) {
            notaMinimaEstudiante = nota2;
        }
        if(nota3 < notaMinimaEstudiante) {
            notaMinimaEstudiante = nota3;
        }
        return notaMinimaEstudiante;
    }
    public void calcularNotaMenorCurso(Estudiante estudiante1, Estudiante estudiante2,
                                               Estudiante estudiante3) {

        double notaMinimaEst1 = calcularNotaMinimaEstudiante( estudiante1.getNota1(), estudiante1.getNota2(),
                estudiante1.getNota3());
        double notaMinimaEst2 = calcularNotaMinimaEstudiante( estudiante2.getNota1(), estudiante2.getNota2(),
                estudiante2.getNota3());
        double notaMinimaEst3 = calcularNotaMinimaEstudiante( estudiante3.getNota1(), estudiante3.getNota2(),
                estudiante3.getNota3());
        double notaMenorCurso = notaMinimaEst1;

        if (notaMinimaEst2 < notaMenorCurso) {
            notaMenorCurso = notaMinimaEst2;
        }
        if(notaMinimaEst3 < notaMenorCurso){
            notaMenorCurso = notaMinimaEst3;
        }
        System.out.println("La nota menor del curso es : " + notaMenorCurso);
    }
    public String aprobacionCurso(double defEstudiante, String nombreEstudiante){

        if (defEstudiante >=3.0){
            ganaronCurso= ganaronCurso +1;
            return "El estudiante "+ nombreEstudiante + " Aprobó el curso ";

        }else {
            perdieronCurso=perdieronCurso +1;
            return "El estudiante "+ nombreEstudiante + " No Aprobó el curso ";

        }
    }
    public int cantidadGanaronCurso(){
        return ganaronCurso ;

    }
    public int cantidadperdieronCurso(){
        return perdieronCurso ;

    }
    public double calcularPorcentajeGanaronCurso(int ganaronCurso){
        double porcentajeGanaronCurso= (ganaronCurso*100)/3;
        System.out.println("El porcentaje de estudiantes que ganaron el curso es: "+ porcentajeGanaronCurso +"%");
        return porcentajeGanaronCurso;

    }
    public  double calcularPorcentajePerdieronCurso(int perdieronCurso){
        double porcentajeperdieronCurso= (perdieronCurso*100)/3;
        System.out.println("El porcentaje de estudiantes que perdieron el curso es: "
                + porcentajeperdieronCurso +"%");
        return porcentajeperdieronCurso;


    }
    public String obtenerEstudianteNotaMayor4(String nombre, double nota1,double nota2, double nota3){
        if (nota1 >=4 && nota2 >=4 && nota3 >=4){
            CantidadEstudiantesNotaMayor4 = CantidadEstudiantesNotaMayor4+1;
            System.out.println( "El estudiante "+nombre +"tiene todas las notas mayores o iguales a 4");
            return "El estudiante "+nombre +"tiene todas las notas mayores o iguales a 4";

        }
        return null;

    }
    //Método para calcular cuando ningún estudiante tiene notas mayores o iguales a 4.0
    public  String cantidadEstudiantesNotasMayor4(){
        if (CantidadEstudiantesNotaMayor4 == 0){
            System.out.println("No se encontro estudiante con notas mayor o igual a 4");
            return "No se encontro estudiante con notas mayor o igual a 4";
        }
        System.out.println("hay " + CantidadEstudiantesNotaMayor4 +" con notas mayor o igual a 4");
        return "hay " + CantidadEstudiantesNotaMayor4 +" con notas mayor o igual a 4";
    }
    public void calcularNotaMaximaEstudiante(Estudiante estudiante) {

        double notaMaximaEstudiante = estudiante.getNota1();

        if (estudiante.getNota2() > notaMaximaEstudiante) {
            notaMaximaEstudiante = estudiante.getNota2();
        }
        if(estudiante.getNota3() > notaMaximaEstudiante) {
            notaMaximaEstudiante = estudiante.getNota3();
        }
        System.out.println(" La nota máxima del estudiante "+ estudiante.getNombre()+ " es : " + notaMaximaEstudiante);
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
