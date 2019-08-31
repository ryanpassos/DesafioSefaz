/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ryan Passos
 */
public class TelaUsuarioTest {
    
    public TelaUsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of conectar method, of class TelaUsuario.
     */
    @Test
    public void testConectar() throws Exception {
        System.out.println("conectar");
        TelaUsuario instance = new TelaUsuario();
        Statement expResult = null;
        Statement result = instance.conectar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desconectar method, of class TelaUsuario.
     */
    @Test
    public void testDesconectar() throws Exception {
        System.out.println("desconectar");
        TelaUsuario instance = new TelaUsuario();
        instance.desconectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of perfilUsuario method, of class TelaUsuario.
     */
    @Test
    public void testPerfilUsuario() {
        System.out.println("perfilUsuario");
        TelaUsuario instance = new TelaUsuario();
        instance.perfilUsuario();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TelaUsuario.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TelaUsuario.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
