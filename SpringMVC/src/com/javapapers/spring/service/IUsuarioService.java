package com.javapapers.spring.service;

import java.io.Serializable;
import java.util.List;

import com.javapapers.spring.domain.Usuario;

public interface IUsuarioService extends Serializable {
	
    public List<Usuario> getUsuarioList();

    public void saveUsuario(Usuario prod);
}
