package com.cursojava.spring.dao;

import com.cursojava.spring.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();
}
