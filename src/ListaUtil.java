import java.util.Collections;
import java.util.List;

public class ListaUtil {

    // Método genérico: funciona com lista de qualquer tipo que seja Comparable
    public static <T extends Comparable<? super T>> void ordenarExibir(List<T> lista) {
        Collections.sort(lista);
        for (T item : lista) {
            System.out.println(item);
        }
    }
}
