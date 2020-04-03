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
public class Diario 
{
    private Double nota;
    private Integer falta;
    private Resultado resultado;
    private Aluno aluno;
    
    public Diario(Aluno aluno) 
    {        
        this.aluno = aluno; 
        this.falta = 0;
        this.nota = 0.0;
        this.resultado = Resultado.Cursando;
    }
    
    public Aluno getAluno() 
    {
        return aluno;
    }

    public void setAluno(Aluno aluno) 
    {
        this.aluno = aluno;
    }
    
    public Resultado getResultado() 
    {
        return this.resultado;
    }

    public void setResultado() 
    {
        if(this.nota > 7.0)
        {            
            this.resultado = Resultado.Aprovado;
        } 
        else if (this.nota < 7.0)
        {
            this.resultado = Resultado.Reprovado;
        }
    }
    
    public Double getNotas() 
    {
        return nota;
    }

    public void setNotas(Double notas) 
    {
        this.nota = notas;
    }

    public int getFaltas() 
    {
        return falta;
    }

    public void setFaltas(int faltas) 
    {
        this.falta = faltas;
    }
    
    @Override
    public String toString() 
    {
        return this.aluno.getNome();
    }

    @Override
    public int hashCode() 
    {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nota);
        hash = 37 * hash + Objects.hashCode(this.falta);
        hash = 37 * hash + Objects.hashCode(this.resultado);
        hash = 37 * hash + Objects.hashCode(this.aluno);
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
        final Diario other = (Diario) obj;
        if (!Objects.equals(this.nota, other.nota)) 
        {
            return false;
        }
        if (!Objects.equals(this.falta, other.falta)) 
        {
            return false;
        }
        if (this.resultado != other.resultado) 
        {
            return false;
        }
        if (!Objects.equals(this.aluno, other.aluno)) 
        {
            return false;
        }
        
        return true;
    } 
}
