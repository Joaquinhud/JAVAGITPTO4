package gitpto4;

/**
 *
 * @author daniel
 */
public class Caballo {
    private int id;
    private String nombre;
    private String color;
    private double peso;
    private String altura;
    private String dueño;
    private int edad;

    public Caballo() {
    }

    public Caballo(String nombre, String color, double peso, String altura, String dueño) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.altura = altura;
        this.dueño = dueño;
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

    @Override
    public String toString() {
        return "Caballo{" + "nombre=" + nombre + ", color=" + color + ", peso=" + peso + ", altura=" + altura + ", due\u00f1o=" + dueño + '}';
    }
}
