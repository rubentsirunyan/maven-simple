package com.github.jitpack;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppTest {

    App app = new App();

    @BeforeClass
    public static void onceExecutedBeforeAll() {

        System.out.println("@BeforeClass: onceExecutedBeforeAll");

    }

    @Before
    public void executedBeforeEach() {

        System.out.println("@Before: executedBeforeEach");

    }

    @Test
    public void testApp() {

        assertEquals("Hello world", app.greet("world"));
    }

    @Test
    public void testTrue() {
        assertTrue(app.truer("asd"));
    }
}
