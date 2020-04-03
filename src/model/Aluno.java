/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author jadson
 */
public class Aluno extends Pessoa
{    
    private static Integer proximoId = 0001;
    
    private Integer id;
    private String matricula;
    private LocalDate dataIngresso;   
    private Usuario usuario;
            
    public Aluno(String nome, String endereco, 
            Usuario usuario) 
    {
        super(nome, endereco);
        
        this.dataIngresso = LocalDate.now();  
        this.usuario = usuario;
        
        id = proximoId;
        proximoId++;
        
        this.matricula = String.valueOf(dataIngresso.getYear()) + String.valueOf(dataIngresso.getMonthValue()) + String.valueOf(id);
    }
    
    public Integer getId() 
    {
        return id;
    }

    public void setId(Integer id) 
    {
        this.id = id;
    }
    
    public String getMatricula() 
    {
        return matricula;
    }
    
    public void setMatricula(String matricula) 
    {
        this.matricula = matricula;
    }

    public LocalDate getDataIngresso() 
    {
        return dataIngresso;
    }
  
    public void setDataIngresso(LocalDate dataIngresso) 
    {
        this.dataIngresso = dataIngresso;
    }
    
    public Usuario getUsuario() 
    {
        return usuario;
    }

    public void setUsuario(Usuario usuario) 
    {
        this.usuario = usuario;
    }     
    
    @Override
    public String toString() 
    {
        return this.matricula;
    } 

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.id);
        hash = 61 * hash + Objects.hashCode(this.matricula);
        hash = 61 * hash + Objects.hashCode(this.dataIngresso);
        hash = 61 * hash + Objects.hashCode(this.usuario);
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.matricula, other.matricula)) 
        {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) 
        {
            return false;
        }
        if (!Objects.equals(this.dataIngresso, other.dataIngresso))
        {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) 
        {
            return false;
        }
        
        return true;
    } 
}
