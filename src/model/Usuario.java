/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author jadson
 */
public class Usuario 
{
    private String login;
    private String senha;
    private TipoUsuario tipo;
        
    public Usuario(String login, String senha, TipoUsuario tipo) 
    {
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }
        
    public String getLogin() 
    {
        return login;
    }

    public void setLogin(String login) 
    {
        this.login = login;
    }

    public String getSenha() 
    {
        return senha;
    }

    public void setSenha(String senha) 
    {
        this.senha = senha;
    }
    
    public TipoUsuario getTipo() 
    {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) 
    {
        this.tipo = tipo;
    }  
    
    @Override
    public String toString() 
    {
        return login;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.login);
        hash = 37 * hash + Objects.hashCode(this.senha);
        hash = 37 * hash + Objects.hashCode(this.tipo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.login, other.login)) 
        {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) 
        {
            return false;
        }
        if (this.tipo != other.tipo) 
        {
            return false;
        }
        return true;
    }    
}
