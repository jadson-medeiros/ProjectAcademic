/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.List;

/**
 *
 * @author jadson
 */
public interface Dado 
{    
    public void incluir(Object object) throws Exception;
    public void excluir(Object object) throws Exception;
    public void alterar(Object object) throws Exception;
    public List listar() throws Exception;    
}
