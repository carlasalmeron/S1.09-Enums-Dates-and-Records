package level3.task5;

// Un record define una clase inmutable
// Java genera automáticamente:
// - constructor
// - getters (con el mismo nombre del campo)
// - equals(), hashCode() y toString()
public record Album(String tile, int year){}

/*
     VENTAJAS:
     - Mucho más legible
     - Menos código
     - Inmutable por defecto
     - Ideal para DTOs y value objects

     LIMITACIONES:
     - No permite herencia
     - No pensado para estado mutable
    */
