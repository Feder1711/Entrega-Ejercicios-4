import java.time.LocalDate;
import java.util.*;

public class PersonasEj17 {
    private List<PersonasEj17> listaPersonas = new ArrayList<>();

    public void anadirPersona(PersonasEj17 persona) {
        listaPersonas.add(persona);
    }

    public PersonasEj17 elMasJoven() {
        return listaPersonas.stream().min(Comparator.comparing(PersonasEj17::calcularEdad)).orElse(null);
    }

    private <U> U calcularEdad() {
    }

    public long calcularSumaEdades() {
        return listaPersonas.stream().mapToLong(PersonasEj17::calcularEdad).sum();
    }

    public long calcularEdadMinima() {
        return listaPersonas.stream().mapToLong(PersonasEj17::calcularEdad).min().orElse(0);
    }

    public double calcularMediaDeEdad() {
        return listaPersonas.stream().mapToLong(PersonasEj17::calcularEdad).average().orElse(0);
    }

    public static void main(String[] args) {
        PersonasEj17 grupo = new PersonasEj17();
        grupo.anadirPersona(new PersonasEj17("Juan", LocalDate.of(1995, 5, 10)));
        grupo.anadirPersona(new PersonasEj17("Ana", LocalDate.of(2000, 8, 25)));
        grupo.anadirPersona(new PersonasEj17("Carlos", LocalDate.of(1988, 12, 15)));

        System.out.println("Persona más joven: " + grupo.elMasJoven());
        System.out.println("Suma de edades: " + grupo.calcularSumaEdades());
        System.out.println("Edad mínima: " + grupo.calcularEdadMinima());
        System.out.println("Media de edad: " + grupo.calcularMediaDeEdad());
    }
}
