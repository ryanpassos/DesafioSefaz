/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.util.ArrayList;

/**
 *
 * @author Ryan Passos
 */
public interface InterfaceUsuario {
    
    void cadastrarUsuario(Usuario u) throws Exception;
    
    void atualizarUsuario(Usuario u) throws Exception;
    
    void removerUsuario(Usuario u) throws Exception;
    
    void fazerLogin(Usuario u) throws Exception;
    
    ArrayList<Usuario> listarUsuario(Usuario filtro) throws Exception;
}
