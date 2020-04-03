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
public class Disciplina 
{
    private Integer qtdAulas;  
    private String nome;
        
    public Disciplina (String nome, Integer qtdAulas)
    {
        this.nome = nome;
        this.qtdAulas = qtdAulas;
    }    
        
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getQtdAula()
    {
        return qtdAulas;
    }

    public void setQtdAula(Integer qtdAulas) 
    {
        this.qtdAulas = qtdAulas;
    }  
    
    @Override
    public String toString()
    {
        return this.nome;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.qtdAulas);
        hash = 41 * hash + Objects.hashCode(this.nome);
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
        final Disciplina other = (Disciplina) obj;
        if (!Objects.equals(this.nome, other.nome)) 
        {
            return false;
        }
        if (!Objects.equals(this.qtdAulas, other.qtdAulas))
        {
            return false;
        }
        
        return true;
    }    
}
