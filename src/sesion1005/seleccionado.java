package sesion1005;

public abstract class seleccionado {
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    private int anyo_experiencia;
    private int salario;

    public seleccionado(int id, String nombre, String apellidos, int edad, int anyo_experiencia, int salario) throws AccionIncorrecta {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        if (edad<=0 || anyo_experiencia<=0){
            throw new AccionIncorrecta(": la edad o experiencia no puede ser menor o igual a 0");
        }else {
            this.edad = edad;
            this.anyo_experiencia = anyo_experiencia;
        }
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAnyo_experiencia() {
        return anyo_experiencia;
    }

    public void setAnyo_experiencia(int anyo_experiencia) {
        this.anyo_experiencia = anyo_experiencia;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public abstract double calcular_salario();
}
