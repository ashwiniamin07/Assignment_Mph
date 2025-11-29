package com.mph.Maven29Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AppTest {

    
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    @Test
    public void sayHelloTest() {
    
    	String expected="hello";
    	String actual=new App().sayHello();
    	assertEquals(expected, actual);
    }
    @Test
    public void checkTextTest() {
    	assertNotNull(new App().checkText());
    	
    }
    
    @BeforeEach
    public void beforeEveryTest() {
    	System.out.println("Testing of api started");
    }
    @BeforeAll
    public static void beforeAllTest() {
    	System.out.println("Testing of api started before All");
    }
    
    @AfterEach
    public void afterEach() {
    	System.out.println("Testing of Api Completed");
    }
    @AfterAll
    public static void afterAll() {
    	System.out.println("Testing of All Api Completed");
    }
}
