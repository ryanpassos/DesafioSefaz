/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.util.ArrayList;
import telefone.Telefone;

/**
 *
 * @author Ryan Passos
 */
public class Usuario extends Telefone {
    
        private String login;
	private String nome;
	private String email;
	private String senha;
        private ArrayList<Telefone> telefoneUsuario;

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the telefoneUsuario
     */
    public ArrayList<Telefone> getTelefoneUsuario() {
        return telefoneUsuario;
    }

    /**
     * @param telefoneUsuario the telefoneUsuario to set
     */
    public void setTelefoneUsuario(ArrayList<Telefone> telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

}
