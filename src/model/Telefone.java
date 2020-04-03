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
public class Telefone 
{
    private String ddd;
    private String numero;

    public Telefone(String dd, String numero)
    {
        this.ddd = dd;
        this.numero = numero;
    }

    @Override
    public String toString() 
    {
        return this.ddd + this.numero;
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.ddd);
        hash = 29 * hash + Objects.hashCode(this.numero);
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
        final Telefone other = (Telefone) obj;
        if (!Objects.equals(this.ddd, other.ddd)) 
        {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) 
        {
            return false;
        }
        
        return true;
    }
    
    public String getDdd() 
    {
        return ddd;
    }

    public void setDdd(String ddd) 
    {
        this.ddd = ddd;
    }

    public String getNumero() 
    {
        return numero;
    }

    public void setNumero(String numero) 
    {
        this.numero = numero;
    }
}
