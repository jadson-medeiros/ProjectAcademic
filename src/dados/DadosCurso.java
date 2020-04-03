/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.ArrayList;
import java.util.List;
import model.Curso;

/**
 *
 * @author jadson
 */
public class DadosCurso extends DadosXml implements Dado
{
    private List<Curso> cursos;

    @Override
    public void incluir(Object object) throws Exception 
    {
        listar();
        Curso curso = (Curso) object;
        cursos.add((Curso) object);

        persistirCurso(cursos);
    }

    @Override
    public void excluir(Object object) throws Exception 
    {
        listar();
        cursos.remove((Curso) object);

        persistirCurso(cursos);
    }

    @Override
    public void alterar(Object object) throws Exception 
    {
        excluir(object);
        cursos.add((Curso) object);
        
        persistirCurso(cursos);
    }

    @Override
    public List<Curso> listar() throws Exception 
    {
        cursos = (List<Curso>) buscarCurso();

        if (cursos == null) 
        {
            cursos = new ArrayList();
        }
        
        return cursos;
    }    
}
