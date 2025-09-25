import excepciones.ListException;
import implementaciones.ArrayList;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    @Test
    public void testSet() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(5);
        list.set(20, 0);
        assertEquals(20, list.get(0));
    }

    @Test
public void testRemove_GenericType() throws ListException {
    ArrayList<Integer> list = new ArrayList<>(Integer.class, 10);
    list.append(5);
    list.append(10);
    list.remove(0); 
    assertEquals(1, list.size());
    assertEquals(10, list.get(0));
}

    @Test
    public void testIndexOf() throws ListException {
        ArrayList<String> list = new ArrayList<>(String.class, 5);
        list.append("x");
        list.append("y");
        list.append("z");
        assertEquals(1, list.indexOf("y"));
        assertEquals(-1, list.indexOf("no-existe"));
    }

    @Test
    public void testAppend() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(7);
        assertEquals(7, list.get(0));
        assertEquals(1, list.size());
    }

    @Test
    public void testInsert() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(1);
        list.append(3);
        list.insert(2, 1);
        assertEquals(2, list.get(1));
    }

    @Test
    public void testGet() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(99);
        assertEquals(99, list.get(0));
    }

    @Test
    public void testRemove_int() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(10);
        list.append(20);
        int removed = list.remove(0);
        assertEquals(10, removed);
        assertEquals(1, list.size());
    }

    @Test
    public void testEmpty() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(1);
    }

    @Test
    public void testSize() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(5);
        assertEquals(1, list.size());
    }

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

    @Test
    public void testClear() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(1);
        list.append(2);
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void testToString() throws ListException {
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 5);
        list.append(1);
        list.append(2);
        assertEquals("[1, 2]", list.toString());
    }
}
