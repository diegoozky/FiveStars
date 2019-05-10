package com.pelicula.demo.model;



import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique=true)
	private String correo;
	
	@Column(unique=true)
	private String username;
	
	private String password;
	
	private String privilegio;
	
	public String getPrivilegio() {
		return privilegio;
	}


	public void setPrivilegio(String privilegio) {
		this.privilegio = privilegio;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String user) {
		this.username = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	public  String getMD5() {
		 try {
		 MessageDigest md = MessageDigest.getInstance("MD5");
		 byte[] messageDigest = md.digest(this.password.getBytes());
		 BigInteger number = new BigInteger(1, messageDigest);
		 this.password = number.toString(16);

		 while (this.password.length() < 32) {
		 this.password = "0" + this.password;
		 }
		 return this.password;
		 }
		 catch (NoSuchAlgorithmException e) {
		 throw new RuntimeException(e);
		 }
	 }
	
	
	
}
