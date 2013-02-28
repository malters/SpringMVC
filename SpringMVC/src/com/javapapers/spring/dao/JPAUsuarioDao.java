package com.javapapers.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javapapers.spring.domain.Usuario;

@Repository(value = "usuarioDao")
public class JPAUsuarioDao implements IUsuarioDao {
	
	private EntityManager em = null;
	
	/*
	 * Sets the entity manager.
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

    @Transactional(readOnly = true)
    public List<Usuario> getUsuarioList() {
    	 TypedQuery<Usuario> query = em.createQuery(
    	            "SELECT g FROM Usuario g ORDER BY g.id", Usuario.class);
    	        return query.getResultList();
    }

    @Transactional
    public void saveUsuario(Usuario user) {
        em.persist(user);
    }
}
