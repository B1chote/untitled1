package sesion0504;

public class Estudiante extends Persona{
    public int contadorEstudiante=0;
    public Estudiante(){

    }
    @Override
    void message(){
        System.out.println("me quedo en el mñetodo message de la clase estudiante");
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "contadorEstudiante=" + contadorEstudiante +
                '}' + super.toString();
    }
}
