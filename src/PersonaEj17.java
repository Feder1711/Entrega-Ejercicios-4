import java.time.LocalDate;
import java.time.Period;

public class PersonaEj17 {
    private String nombre;
    private LocalDate fechaNacimiento;

    public PersonaEj17(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public long calcularEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return nombre + " - " + calcularEdad() + " años";
    }
}

