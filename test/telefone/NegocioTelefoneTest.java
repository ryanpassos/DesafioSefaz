/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefone;

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
public class NegocioTelefoneTest {
    
    public NegocioTelefoneTest() {
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
     * Test of cadastrarTelefone method, of class NegocioTelefone.
     */
    @Test
    public void testCadastrarTelefone() throws Exception {
        System.out.println("cadastrarTelefone");
        Telefone t = null;
        NegocioTelefone instance = new NegocioTelefone();
        instance.cadastrarTelefone(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizarTelefone method, of class NegocioTelefone.
     */
    @Test
    public void testAtualizarTelefone() throws Exception {
        System.out.println("atualizarTelefone");
        Telefone t = null;
        NegocioTelefone instance = new NegocioTelefone();
        instance.atualizarTelefone(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerTelefone method, of class NegocioTelefone.
     */
    @Test
    public void testRemoverTelefone() throws Exception {
        System.out.println("removerTelefone");
        Telefone t = null;
        NegocioTelefone instance = new NegocioTelefone();
        instance.removerTelefone(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarTipo method, of class NegocioTelefone.
     */
    @Test
    public void testListarTipo() throws Exception {
        System.out.println("listarTipo");
        Telefone filtro = null;
        NegocioTelefone instance = new NegocioTelefone();
        ArrayList<Telefone> expResult = null;
        ArrayList<Telefone> result = instance.listarTipo(filtro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
