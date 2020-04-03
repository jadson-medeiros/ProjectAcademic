package model;

import java.util.Objects;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jadson
 */
public class Professor extends Pessoa
{
    private Formacao formacao;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.formacao);
        hash = 89 * hash + Objects.hashCode(this.turma);
        hash = 89 * hash + Objects.hashCode(this.usuario);
        return hash;
    }

    
    private Turma turma;
    private Usuario usuario;
    
    public Professor(Formacao formacao, Usuario usuario,
            String nome, String endereco) 
    {
        super(nome, endereco);
        this.formacao = formacao;
        this.usuario = usuario;
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
        return this.getNome();
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
        final Professor other = (Professor) obj;
        if (this.formacao != other.formacao) 
        {
            return false;
        }
        if (!Objects.equals(this.turma, other.turma)) 
        {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) 
        {
            return false;
        }
        
        return true;
    }
    
    public Formacao getFormacao() 
    {
        return formacao;
    }

    public void setFormacao(Formacao formacao) 
    {
        this.formacao = formacao;
    }    
}
