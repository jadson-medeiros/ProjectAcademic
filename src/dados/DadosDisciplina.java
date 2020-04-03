/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.ArrayList;
import java.util.List;
import model.Disciplina;
/**
 *
 * @author jadson
 */
public class DadosDisciplina extends DadosXml implements Dado
{
    private List<Disciplina> disciplinas;
    
    @Override
    public void incluir(Object object) throws Exception
    {
        listar();
        Disciplina disciplina = (Disciplina) object;
        disciplinas.add((Disciplina) object);
        
        persistirDisciplina(disciplinas);
    }

    @Override
    public void excluir(Object object) throws Exception 
    {
        listar();
        disciplinas.remove((Disciplina) object);
        
        persistirDisciplina(disciplinas);
    }

    @Override
    public void alterar(Object object) throws Exception 
    {
        excluir(object);
        disciplinas.add((Disciplina) object);
        
        persistirDisciplina(disciplinas);
    }

    @Override
    public List<Disciplina> listar() throws Exception
    {
        disciplinas = (List<Disciplina>) buscarDisciplina();

        if (disciplinas == null) 
        {
            disciplinas = new ArrayList();
        }
        
        return disciplinas;
    }
}
