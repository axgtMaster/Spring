package com.cursojava.spring.controllers;

import com.cursojava.spring.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Rodolfo");
        usuario.setApellido("Salazar");
        usuario.setEmail("rodolfosalazar@clc.cl");
        usuario.setTelefono("+56985783215");
        usuario.setPassword("123456");

        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Rodolfo");
        usuario.setApellido("Salazar");
        usuario.setEmail("rodolfosalazar@clc.cl");
        usuario.setTelefono("+56985783215");
        usuario.setPassword("123456");
        usuarios.add(usuario);

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Javiera");
        usuario2.setApellido("Salazar");
        usuario2.setEmail("jav.salazar@clc.cl");
        usuario2.setTelefono("+56985783456");
        usuario2.setPassword("123456");
        usuarios.add(usuario2);

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("Fernanda");
        usuario3.setApellido("Salazar");
        usuario3.setEmail("fer.salazar@clc.cl");
        usuario3.setTelefono("+56985789874");
        usuario3.setPassword("123456");
        usuarios.add(usuario3);

        return usuarios;
    }

    @RequestMapping(value = "usuariof")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Rodolfo");
        usuario.setApellido("Salazar");
        usuario.setEmail("rodolfosalazar@clc.cl");
        usuario.setTelefono("+56985783215");
        usuario.setPassword("123456");

        return usuario;
    }

    @RequestMapping(value = "usuarioff")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Rodolfo");
        usuario.setApellido("Salazar");
        usuario.setEmail("rodolfosalazar@clc.cl");
        usuario.setTelefono("+56985783215");
        usuario.setPassword("123456");

        return usuario;
    }

    @RequestMapping(value = "usuarioffi")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Rodolfo");
        usuario.setApellido("Salazar");
        usuario.setEmail("rodolfosalazar@clc.cl");
        usuario.setTelefono("+56985783215");
        usuario.setPassword("123456");

        return usuario;
    }
}
