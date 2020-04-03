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
public class Curso 
{
    private String nome;
    
    public Curso(String nome)
    {
        this.nome = nome;
    }
        
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    @Override
    public int hashCode() 
    {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.nome);
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
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.nome, other.nome))
        {
            return false;
        }
        
        return true;
    }
    
    @Override
    public String toString() 
    {
        return this.nome;
    }  
}
