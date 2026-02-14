package level3.task5;

public class Main {
    public static void main(String[] args) {

        Album album1 = new Album("Anti", 2016);
        AlbumClassic album2 = new AlbumClassic("Abbey Road", 1974);

        System.out.println(album1);
        System.out.println(album2);

        /*
        COMPARACIÓN DE LEGIBILIDAD:
        - record: se entiende al instante qué datos contiene
        - clase tradicional: el ruido visual oculta lo importante

        COMPARACIÓN DE UTILIDAD:
        - record: ideal para modelos simples, resultados de API, streams
        - clase tradicional: mejor para lógica de negocio y mutabilidad

        CONCLUSIÓN:
        Usa record cuando el objeto SOLO representa datos.
        Usa clase tradicional cuando el objeto TIENE comportamiento.
        */
    }
}
