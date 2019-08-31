/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.util.ArrayList;
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
public class NegocioUsuarioTest {
    
    
    public NegocioUsuarioTest() {
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
     * Test of cadastrarUsuario method, of class NegocioUsuario.
     */
    @Test
    public void testCadastrarUsuario() throws Exception {
        System.out.println("cadastrarUsuario");
        Usuario u = null;
        NegocioUsuario instance = new NegocioUsuario();
        instance.cadastrarUsuario(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizarUsuario method, of class NegocioUsuario.
     */
    @Test
    public void testAtualizarUsuario() throws Exception {
        System.out.println("atualizarUsuario");
        Usuario u = null;
        NegocioUsuario instance = new NegocioUsuario();
        instance.atualizarUsuario(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerUsuario method, of class NegocioUsuario.
     */
    @Test
    public void testRemoverUsuario() throws Exception {
        System.out.println("removerUsuario");
        Usuario u = null;
        NegocioUsuario instance = new NegocioUsuario();
        instance.removerUsuario(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fazerLogin method, of class NegocioUsuario.
     */
    @Test
    public void testFazerLogin() throws Exception {
        System.out.println("fazerLogin");
        Usuario u = null;
        NegocioUsuario instance = new NegocioUsuario();
        instance.fazerLogin(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarUsuario method, of class NegocioUsuario.
     */
    @Test
    public void testListarUsuario() throws Exception {
        System.out.println("listarUsuario");
        Usuario filtro = null;
        NegocioUsuario instance = new NegocioUsuario();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.listarUsuario(filtro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
