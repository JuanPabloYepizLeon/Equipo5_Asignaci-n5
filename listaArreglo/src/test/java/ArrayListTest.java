/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import excepciones.ListException;
import implementaciones.ArrayList;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author luisc
 */
public class ArrayListTest {
    
    public ArrayListTest() {
    }

 
    @org.junit.jupiter.api.Test
    public void testSet() {
        ArrayList<Integer> list = new ArrayList<>(Integer.class,10);
        list.append(5);
        list.set(20, 0);
        assertEquals(20, list.get(0));
    }

    /**
     * Test of remove method, of class ArrayList.
     */
    @org.junit.jupiter.api.Test
    public void testRemove_GenericType() {
        System.out.println("remove");
        Object o = null;
        ArrayList instance = null;
        boolean expResult = false;
        boolean result = instance.remove(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class ArrayList.
     */
    @org.junit.jupiter.api.Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object o = null;
        ArrayList instance = null;
        int expResult = 0;
        int result = instance.indexOf(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of append method, of class ArrayList.
     */
    @org.junit.jupiter.api.Test
    public void testAppend() {
        System.out.println("append");
        Object o = null;
        ArrayList instance = null;
        instance.append(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class ArrayList.
     */
    @org.junit.jupiter.api.Test
    public void testInsert() {
        System.out.println("insert");
        Object o = null;
        int i = 0;
        ArrayList instance = null;
        instance.insert(o, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ArrayList.
     */
    @Test
    public void testGet() throws ListException{
      ArrayList<Integer> list = new ArrayList<>(Integer.class,3);
    }

    /**
     * Test of remove method, of class ArrayList.
     */
    @org.junit.jupiter.api.Test
    public void testRemove_int() {
        System.out.println("remove");
        int i = 0;
        ArrayList instance = null;
        Object expResult = null;
        Object result = instance.remove(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class ArrayList.
     */
    @org.junit.jupiter.api.Test
    public void testEmpty() {
        System.out.println("empty");
        ArrayList instance = null;
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class ArrayList.
     */
    @org.junit.jupiter.api.Test
    public void testSize() {
        System.out.println("size");
        ArrayList instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class ArrayList.
     */
    @org.junit.jupiter.api.Test
    public void testIterator() {
        System.out.println("iterator");
        ArrayList instance = null;
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class ArrayList.
     */
    @org.junit.jupiter.api.Test
    public void testClear() {
        System.out.println("clear");
        ArrayList instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ArrayList.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        ArrayList instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
