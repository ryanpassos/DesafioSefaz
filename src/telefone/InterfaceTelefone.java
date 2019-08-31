/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefone;

import java.util.ArrayList;

/**
 *
 * @author Ryan Passos
 */
public interface InterfaceTelefone {
    
    void cadastrarTelefone (Telefone t) throws Exception;
    
    void atualizarTelefone (Telefone t) throws Exception;
    
    void removerTelefone (Telefone t) throws Exception;
    
    ArrayList<Telefone> listarTipo(Telefone filtro) throws Exception;
    
}
