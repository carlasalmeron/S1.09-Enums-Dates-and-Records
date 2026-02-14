package level3.task5;

import java.util.Objects;

// Clase tradicional de Java para representar un álbum
// Requiere mucho código manual para tareas comunes
public class AlbumClassic {
    private String title;
    private int year;

    // Constructor obligatorio
    public AlbumClassic (String title, int year) {
        this.title = title;
        this.year = year;
    }

    // Getters manuales
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    // hashCode implementado manualmente
    @Override
    public int hashCode() {
        return Objects.hash(title, year);
    }

    // toString implementado manualmente
    @Override
    public String toString() {
        return "Title: " + this.title + " | Year: " + this.year;
    }

    /*
     DESVENTAJAS:
     - Mucho código repetitivo
     - Hay que mantener getters, constructor y métodos comunes a mano

     VENTAJAS:
     - Permite mutabilidad
     - Permite herencia
     - Mayor flexibilidad para lógica compleja
    */
}
