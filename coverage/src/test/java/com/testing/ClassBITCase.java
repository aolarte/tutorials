package com.testing;

import org.junit.Test;

import static org.junit.Assert.*;


public class ClassBITCase {

    @Test
    public void testAdd() {
        ClassB b=new  ClassB();
        assertEquals(10,b.add(3,7));
        assertEquals(17,b.add(10,7));
    }
}
