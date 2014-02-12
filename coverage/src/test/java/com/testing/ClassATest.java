package com.testing;

import org.junit.Test;

import static org.junit.Assert.*;


public class ClassATest {
    @Test
    public void testAdd() {
        ClassA b=new  ClassA();
        assertEquals(10,b.add(3,7));
        assertEquals(17,b.add(10,7));
    }

}
