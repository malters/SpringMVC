package com.javapapers.spring.dao;

import java.util.List;

import com.javapapers.spring.domain.Usuario;

public interface IUsuarioDao {
	
    public List<Usuario> getUsuarioList();

    public void saveUsuario(Usuario prod);
}
