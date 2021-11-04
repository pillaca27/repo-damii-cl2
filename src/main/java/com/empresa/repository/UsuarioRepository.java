package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empresa.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	@Query("select u from Usuario u where u.email=?1") 
	public List<Usuario> findByUsuario(String email);
	
}
