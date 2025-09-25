/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import excepciones.ListException;
import implementaciones.ArrayList;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSException;

/**
 *
 * @author E5
 */
public class ArrayListTest {
    
    public ArrayListTest() {
    }

 
    @Test
    public void testSet()throws ListException{
        ArrayList<Integer> list = new ArrayList<>(Integer.class,10);
        list.append(5);
        list.set(20, 0);
        assertEquals(20, list.get(0));
    }

    /**
     * Test of remove method, of class ArrayList.
     */
   @Test
    public void testRemove_GenericType() throws ListException{
        ArrayList<String> list = new ArrayList<>(String.class,10);
        list.append("a");
        assertTrue(list.remove("a"));
    }

    /**
     * Test of indexOf method, of class ArrayList.
     */
    @Test
    public void testIndexOf() throws ListException{
        ArrayList<Integer> list = new ArrayList<>(Integer.class,10);
        list.append(100);
        assertEquals(0, list.indexOf(100));
    }

    /**
     * Test of append method, of class ArrayList.
     */
    @Test
    public void testAppend()throws ListException{
        ArrayList<Integer> list = new ArrayList<>(Integer.class, 10);
        list.append(5);
        list.append(10);
        assertEquals(2, list.size());
        assertEquals(5, list.get(0));
        assertEquals(10, list.get(1));
    }

    /**
     * Test of insert method, of class ArrayList.
     */
    @Test
    public void testInsert()throws ListException{
    ArrayList<Integer> list = new ArrayList<>(Integer.class, 10);
    list.insert(10, 0);      
    assertEquals(3, list.size());
    assertEquals(10, list.get(0));
    }

    /**
     * Test of get method, of class ArrayList.
     */
    @Test
    public void testGet() throws ListException{
      ArrayList<Integer> list = new ArrayList<>(Integer.class,10);
    }

    /**
     * Test of remove method, of class ArrayList.
     */
    @Test
    public void testRemove_int()throws ListException{
        ArrayList<Integer> list = new ArrayList<>(Integer.class,10);
        list.append(100);
        int removed = list.remove(0);
        assertEquals(100, removed);
    }

    /**
     * Test of empty method, of class ArrayList.
     */
    @Test
    public void testEmpty()throws ListException{
    ArrayList<Integer> list = new ArrayList<>(Integer.class, 10);
    assertTrue(list.empty());
    }

    /**
     * Test of size method, of class ArrayList.
     */
   @Test
    public void testSize()throws ListException{
       ArrayList<Integer> list = new ArrayList<>(Integer.class,10);
       list.append(5);
       assertEquals(1, list.size());
    }

    /**
     * Test of iterator method, of class ArrayList.
     */
    @Test
    public void testIterator() throws ListException{
    ArrayList<Integer> list = new ArrayList<>(Integer.class, 10);
    list.append(5);
    list.append(10);
    Iterator<Integer> it = list.iterator();
    assertTrue(it.hasNext());
    assertEquals(5, it.next());
    assertTrue(it.hasNext());
    assertEquals(10, it.next());
    assertTrue(it.hasNext());
    }

    /**
     * Test of clear method, of class ArrayList.
     */
    @Test
    public void testClear()throws ListException{
        ArrayList<String> list = new ArrayList<>(String.class,10);
        list.append("x");
        list.clear();
        assertEquals(0, list.size());
    }

    /**
     * Test of toString method, of class ArrayList.
     */
    @Test
    public void testToString() {
        ArrayList<String> list = new ArrayList<>(String.class,10);
        list.append("item");
        assertEquals("[item]", list.toString());
    }
    
}
