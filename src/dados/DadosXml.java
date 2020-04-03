/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jadson
 */
public abstract class DadosXml 
{
    private String arquivoUsuario = "Usuario.xml";
    private String arquivoAluno = "Aluno.xml";
    private String arquivoCurso = "Curso.xml";
    private String arquivoDisciplina = "Disciplina.xml";
    private String arquivoProfessor = "Professor.xml";
    private String arquivoTurma = "Turma.xml";

    public void persistirAluno(Object object) throws IOException 
    {
        XStream xs = new XStream();

        File fAluno = new File(arquivoAluno);
        FileWriter fw = new FileWriter(fAluno);

        fw.append(xs.toXML(object));
        fw.close();
    }
    
    public void persistirCurso(Object object) throws IOException
    {
        XStream xs = new XStream();

        File fCurso = new File(arquivoCurso);
        FileWriter fw = new FileWriter(fCurso);

        fw.append(xs.toXML(object));
        fw.close();
    }
    
    public void persistirDisciplina(Object object) throws IOException 
    {
        XStream xs = new XStream();

        File fDisciplina = new File(arquivoDisciplina);
        FileWriter fw = new FileWriter(fDisciplina);

        fw.append(xs.toXML(object));
        fw.close();
    }
    
    public void persistirProfessor(Object object) throws IOException 
    {
        XStream xs = new XStream();

        File fProfessor = new File(arquivoProfessor);
        FileWriter fw = new FileWriter(fProfessor);

        fw.append(xs.toXML(object));
        fw.close();
    }
        
    public void persistirTurma(Object object) throws IOException 
    {
        XStream xs = new XStream();

        File fTurma = new File(arquivoTurma);
        FileWriter fw = new FileWriter(fTurma);

        fw.append(xs.toXML(object));
        fw.close();
    }
    
    public void persistirUsuario(Object object) throws IOException 
    {
        XStream xs = new XStream();

        File fUser = new File(arquivoUsuario);
        FileWriter fw = new FileWriter(fUser);

        fw.append(xs.toXML(object));
        fw.close();
    }

    public Object buscarUsuario() throws IOException 
    {
        XStream xs = new XStream();

        File fUser = new File(arquivoUsuario);

        if (!(fUser.exists())) 
        {
            return null;
        }

        return xs.fromXML(fUser);
    }
    
    public Object buscarDisciplina() throws IOException 
    {
        XStream xs = new XStream();

        File fDisciplina = new File(arquivoDisciplina);

        if (!(fDisciplina.exists()))
        {
            return null;
        }

        return xs.fromXML(fDisciplina);
    }
     
    public Object buscarAluno() throws IOException 
    {
        XStream xs = new XStream();

        File fAluno = new File(arquivoAluno);

        if (!(fAluno.exists())) 
        {
            return null;
        }

        return xs.fromXML(fAluno);
    }
      
    public Object buscarCurso() throws IOException 
    {
        XStream xs = new XStream();

        File fCurso = new File(arquivoCurso);

        if (!(fCurso.exists())) 
        {
            return null;
        }

        return xs.fromXML(fCurso);
    }
    
    public Object buscarProfessor() throws IOException 
    {
        XStream xs = new XStream();

        File fProfessor = new File(arquivoProfessor);

        if (!(fProfessor.exists())) 
        {
            return null;
        }

        return xs.fromXML(fProfessor);
    }
    
    public Object buscarTurma() throws IOException 
    {
        XStream xs = new XStream();

        File fTurma = new File(arquivoTurma);

        if (!(fTurma.exists())) 
        {
            return null;
        }

        return xs.fromXML(fTurma);
    }
}
