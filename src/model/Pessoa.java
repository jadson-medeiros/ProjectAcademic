package model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jadson
 */
public abstract class Pessoa 
{
    private Integer id;
    private String nome;
    private String endereco;
    private Set<Telefone> telefones;      
    
    public Pessoa(String nome, String endereco) 
    {
        this.nome = nome;
        this.endereco = endereco; 
        telefones = new HashSet<Telefone>();  
    }
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getEndereco() 
    {
        return endereco;
    }

    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }
   
    public void addTelefone(Telefone telefone)
    {
        telefones.add(telefone);
    }
    
    public void deleteTelefone(Telefone telefone)
    {
        telefones.remove(telefone);
    }
    
    public Set<Telefone> getTelefones()
    {
        return this.telefones;
    }    

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
        hash = 43 * hash + Objects.hashCode(this.nome);
        hash = 43 * hash + Objects.hashCode(this.endereco);
        hash = 43 * hash + Objects.hashCode(this.telefones);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) 
        {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) 
        {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) 
        {
            return false;
        }
        if (!Objects.equals(this.telefones, other.telefones))
        {
            return false;
        }
        
        return true;
    }
}
