import excepciones.ListException;
import implementaciones.ArrayList;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * ArrayListTest.java
 * Clase de pruebas de la clase ArrayList.java
 * @author E5
 */
public class ArrayListTest {
    /**
     * Test de prueba del metodo set()
     * Verifica que al modificar un elemento en un índice específico,
     * el valor se actualice correctamente
     * @throws ListException 
     */
    @Test
    public void testSet() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(5);
        list.set(20, 0);
        assertEquals(20, list.get(0));
    }
    /**
     * Test de prueba del metodo remove()
     * Verifica que se elimine el elemento en la posición indicada
     * y que los elementos restantes se reacomoden correctamente
     * @throws ListException 
     */
    @Test
    public void testRemove_GenericType() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 10);
        list.append(5);
        list.append(10);
        list.remove(0); 
        assertEquals(1, list.size());
        assertEquals(10, list.get(0));
    }
    /**
     * Test de prueba del metodo indexOf()
     * Verifica que se devuelva el índice correcto de un elemento existente,
     * y -1 cuando el elemento no está en la lista
     * @throws ListException 
     */
    @Test
    public void testIndexOf() throws ListException {
        ArrayList<String> list = new ArrayList<>(String.class, 5);
        list.append("x");
        list.append("y");
        list.append("z");
        assertEquals(1, list.indexOf("y"));
        assertEquals(-1, list.indexOf("no-existe"));
    }
    /**
     * Test de prueba del metodo append()
     * Verifica que un elemento se agregue al final de la lista y que el tamaño se actualice
     * @throws ListException 
     */
    @Test
    public void testAppend() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(7);
        assertEquals(7, list.get(0));
        assertEquals(1, list.size());
    }
    /**
     * Test de prueba del metodo insert()
     * Verifica que un elemento se inserte en la posición indicada
     * y que los elementos existentes se desplacen correctamente
     * @throws ListException 
     */
    @Test
    public void testInsert() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(1);
        list.append(3);
        list.insert(2, 1);
        assertEquals(2, list.get(1));
    }
    /**
     * Test de prueba del metodo get()
     * Verifica que se pueda recuperar un elemento por su índice
     * @throws ListException 
     */
    @Test
    public void testGet() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(99);
        assertEquals(99, list.get(0));
    }
    /**
     * Test de prueba del metodo remove()
     * Verifica que el valor eliminado sea el esperado
     * y que el tamaño de la lista disminuya
     * @throws ListException 
     */
    @Test
    public void testRemove_int() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(10);
        list.append(20);
        int removed = list.remove(0);
        assertEquals(10, removed);
        assertEquals(1, list.size());
    }
    /**
     * Test de prueba del metodo empty()
     * Verifica que una lista con elementos no esté vacía
     * @throws ListException 
     */
    @Test
    public void testEmpty() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(1);
    }
    /**
     * Test de prueba del metodo size()
     * Verifica que el tamaño refleje la cantidad de elementos insertados
     * @throws ListException 
     */
    @Test
    public void testSize() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(5);
        assertEquals(1, list.size());
    }
    /**
     * Test de prueba del metodo iterator()
     * Verifica que se pueda recorrer la lista con un iterador,
     * obteniendo los elementos en el orden correcto
     * @throws ListException 
     */
    @Test
    public void testIterator() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(5);
        list.append(10);
        list.append(15);

        Iterator<Integer> it = list.iterator();
        assertTrue(it.hasNext());
        assertEquals(5, it.next());
        assertTrue(it.hasNext());
        assertEquals(10, it.next());
        assertTrue(it.hasNext());
        assertEquals(15, it.next());
        assertFalse(it.hasNext());
    }
    /**
     * Test de prueba del metodo clear()
     * Verifica que al limpiar la lista, su tamaño sea cero
     * @throws ListException 
     */
    @Test
    public void testClear() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(1);
        list.append(2);
        list.clear();
        assertEquals(0, list.size());
    }
    /**
     * Test de prueba del metodo toString()
     * Verifica que la representación en cadena de la lista
     * coincida con el formato esperado
     * @throws ListException 
     */
    @Test
    public void testToString() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(1);
        list.append(2);
        assertEquals("[1, 2]", list.toString());
    }
}
