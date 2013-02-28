package com.javapapers.spring.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios") 
public class Usuario  implements Serializable {

	private static final long serialVersionUID = 1L;
	
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
	public Usuario(String nombre, String contrasena, String mail) {
		super();
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.mail = mail;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private String nombre;
	private String contrasena;
	private String mail;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Nombre: " + nombre + ";");
        buffer.append("Mail: " + mail);
        return buffer.toString();
    }
}
