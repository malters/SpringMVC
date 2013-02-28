package com.javapapers.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javapapers.spring.dao.IUsuarioDao;
import com.javapapers.spring.domain.Usuario;

@Component
public class UsuarioService implements IUsuarioService {

	private static final long serialVersionUID = 1L;

	@Autowired
    private IUsuarioDao productDao;

    public void setProductDao(IUsuarioDao productDao) {
        this.productDao = productDao;
    }

	public List<Usuario> getUsuarioList() {
        //return products;
		return productDao.getUsuarioList();
	}

	public void saveUsuario(Usuario usuario) {

		productDao.saveUsuario(usuario);
	}
}