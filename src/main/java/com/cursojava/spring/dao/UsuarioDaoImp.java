package com.cursojava.spring.dao;

import com.cursojava.spring.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

private EntityManager entityManager;

public class UsuarioDaoImp implements UsuarioDao {

    @Override
    public List<Usuario> getUsuarios() {
        return null;
    }


}
