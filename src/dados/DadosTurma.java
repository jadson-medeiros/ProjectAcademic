/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.ArrayList;
import java.util.List;
import model.Professor;
import model.Turma;

/**
 *
 * @author jadson
 */
public class DadosTurma extends DadosXml implements Dado 
{
    private List<Turma> turmas;
    
    @Override
    public void incluir(Object object) throws Exception 
    {
        listar();
        Turma turma = (Turma) object;
        turma.setNumero(getProximoNumero());
        turmas.add((Turma) object);
        
        persistirTurma(turmas);
    }

    @Override
    public void excluir(Object object) throws Exception 
    {
        listar();
        turmas.remove((Turma) object);

        persistirTurma(turmas);
    }

    @Override
    public void alterar(Object object) throws Exception 
    {
        excluir(object);
        turmas.add((Turma) object);
        
        persistirTurma(turmas);
    }

    @Override
    public List<Turma> listar() throws Exception 
    {
        turmas = (List<Turma>) buscarTurma();

        if (turmas == null) 
        {
            turmas = new ArrayList();
        }
        
        return turmas;
    }
    
    public List<Turma> getTurmas(Professor prof)  throws Exception
    {
        listar();
        
        List<Turma> turma2 = new ArrayList();
        
        for(Turma turma : turmas)
        {
            if(turma.getProfessor().equals(prof))
            {
                turma2.add(turma);
            }
        }
        
        return turma2;
    }
    
    public Integer getProximoNumero()  throws Exception
    {
        listar();
                
        Integer maior = 0;
        for (Turma t: turmas) 
        {
            if (t.getNumero()>maior) maior = t.getNumero();
        }
        
        return maior + 1;
    }
}
