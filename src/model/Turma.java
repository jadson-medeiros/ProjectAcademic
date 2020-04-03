/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jadson
 */
public class Turma 
{
    private Integer numero;
    private Boolean finalizado;
    private Curso curso;
    private Professor professor;
    private Disciplina disciplina;
    private List<Diario> diarios;
    
    public Turma(Curso curso, Disciplina disciplina, 
            Professor professor)
    {
        this.curso = curso;
        this.disciplina = disciplina;
        this.professor = professor;
        this.finalizado = false;
        
        diarios = new ArrayList();      
    }

    public void setDiarios(List<Diario> diarios) 
    {
        this.diarios = diarios;
    }
    
    public int getNumero() 
    {
        return numero;
    }

    public List<Diario> getDiarios()
    {
        return this.diarios;
    }

    public void setNumero(Integer numero) 
    {
        this.numero = numero;
    }
    
    public boolean getFinalizado() 
    {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) 
    {
        this.finalizado = finalizado;
    }

    public Curso getCurso() 
    {
        return curso;
    }

    public void setCurso(Curso curso) 
    {
        this.curso = curso;
    }
    
    public Disciplina getDisciplina() 
    {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) 
    {
        this.disciplina = disciplina;
    }
    
    public void addAluno(Aluno aluno)
    {
        Diario diario = new Diario(aluno);
        this.getDiarios().add(diario);
    }
        
    public Professor getProfessor() 
    {
        return professor;
    }

    public void setProfessor(Professor professor) 
    {
        this.professor = professor;
    }    

    @Override
    public int hashCode() 
    {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.numero);
        hash = 41 * hash + Objects.hashCode(this.finalizado);
        hash = 41 * hash + Objects.hashCode(this.curso);
        hash = 41 * hash + Objects.hashCode(this.professor);
        hash = 41 * hash + Objects.hashCode(this.disciplina);
        hash = 41 * hash + Objects.hashCode(this.diarios);
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
        final Turma other = (Turma) obj;
        if (!Objects.equals(this.numero, other.numero)) 
        {
            return false;
        }
        if (!Objects.equals(this.finalizado, other.finalizado))
        {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) 
        {
            return false;
        }
        if (!Objects.equals(this.professor, other.professor)) 
        {
            return false;
        }
        if (!Objects.equals(this.disciplina, other.disciplina)) 
        {
            return false;
        }
        if (!Objects.equals(this.diarios, other.diarios)) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return this.numero.toString();
    }   
}
