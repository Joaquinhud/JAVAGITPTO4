package gitpto4;

/**
 *
 * @author daniel
 */
public class Perro {
    private int id;
    private String nombre;
    private String color;
    private double peso;
    private String altura;
    private String dueño;
    private String raza;
    private int edad;

    public Perro() {
    }

    public Perro(int id, String nombre, String color, double peso, String altura, String dueño, String raza, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.altura = altura;
        this.dueño = dueño;
        this.raza = raza;
        this.edad = edad;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "id=" + id + ", nombre=" + nombre + ", color=" + color + ", peso=" + peso + ", altura=" + altura + ", due\u00f1o=" + dueño + ", raza=" + raza + ", edad=" + edad + '}';
    }
    
}
