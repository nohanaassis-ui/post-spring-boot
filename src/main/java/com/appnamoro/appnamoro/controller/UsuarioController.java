package com.appnamoro.appnamoro.controller;

import com.appnamoro.appnamoro.model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    private final List<Usuario> usuarios = new ArrayList<>();

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }

    @GetMapping
    public List<Usuario> mostrar() {
        return usuarios;
    }
}