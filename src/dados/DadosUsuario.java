/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

/**
 *
 * @author jadson
 */
public class DadosUsuario extends DadosXml implements Dado 
{
    private static List<Usuario> usuarios;

    public static Usuario Autentication(String username, String senha) throws Exception 
    {   
        for (Usuario usuario : usuarios) 
        {
            if(usuario.getLogin().equals(username) && usuario.getSenha().equals(senha))
            {
                return usuario;
            }
        }
        
        throw new UnsupportedOperationException("Username e senha não encontrados.");
    }
    
    @Override
    public void incluir(Object object) throws Exception 
    {
        listar();
        Usuario usuario = (Usuario) object;
        usuarios.add((Usuario) object);
        
        persistirUsuario(usuarios);
    }

    @Override
    public void excluir(Object object) throws Exception 
    {
        listar();
        usuarios.remove((Usuario) object);

        persistirUsuario(usuarios);
    }

    @Override
    public void alterar(Object object) throws Exception 
    {
        excluir(object);
        usuarios.add((Usuario) object);
        
        persistirUsuario(usuarios);
    }

    @Override
    public List<Usuario> listar() throws Exception 
    {
        usuarios = (List<Usuario>) buscarUsuario();

        if (usuarios == null) 
        {
            usuarios = new ArrayList();
        }
        
        return usuarios;
    }
}
