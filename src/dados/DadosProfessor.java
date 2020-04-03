/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.ArrayList;
import java.util.List;
import model.Professor;

/**
 *
 * @author jadson
 */
public class DadosProfessor extends DadosXml implements Dado 
{
    private static List<Professor> professores;   
    
    @Override
    public void incluir(Object object) throws Exception 
    {
        listar();
        Professor professor = (Professor) object;
        professores.add((Professor) object);
        
        persistirProfessor(professores);
    }

    @Override
    public void excluir(Object object) throws Exception 
    {
        listar();
        professores.remove((Professor) object);

        persistirProfessor(professores);
    }

    @Override
    public void alterar(Object object) throws Exception 
    {
        excluir(object);
        professores.add((Professor) object);
        persistirProfessor(professores);
    }

    @Override
    public List<Professor> listar() throws Exception 
    {
        professores = (List<Professor>) buscarProfessor();

        if (professores == null) 
        {
            professores = new ArrayList();
        }
        return professores;
    }
}
