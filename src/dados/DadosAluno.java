/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;

/**
 *
 * @author jadson
 */
public class DadosAluno extends DadosXml implements Dado 
{
    private List<Aluno> alunos;

    @Override
    public void incluir(Object object) throws Exception 
    {
        listar();
        Aluno aluno = (Aluno) object;
        aluno.setId(getProximoIdAluno());
        
        alunos.add((Aluno) object);

        persistirAluno(alunos);
    }

    @Override
    public void excluir(Object object) throws Exception 
    {
        listar();
        alunos.remove((Aluno) object);

        persistirAluno(alunos);
    }

    @Override
    public void alterar(Object object) throws Exception 
    {
        excluir(object);
        alunos.add((Aluno) object);
        persistirAluno(alunos);
    }

    @Override
    public List<Aluno> listar() throws Exception 
    {
        alunos = (List<Aluno>) buscarAluno();

        if (alunos == null) 
        {
            alunos = new ArrayList();
        }
        return alunos;
    }
    
    public Integer getProximoIdAluno()  throws Exception
    {
        listar();
                
        Integer maior = 0;
        for (Aluno a: alunos) 
        {
            if (a.getId() > maior) maior = a.getId();
        }        
        return maior + 1;
    }
}
