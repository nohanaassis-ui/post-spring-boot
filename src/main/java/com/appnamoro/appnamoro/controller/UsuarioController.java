package com.appnamoro.appnamoro.controller;

import com.appnamoro.appnamoro.model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    private final List<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    public List<Usuario> mostrar() {
        return usuarios;
    }


    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }

    @PutMapping("/{email}")
    public Usuario atualizarTotal(@PathVariable String email, @RequestBody Usuario dadosParcias) {
        for (Usuario usuario : usuarios) {

            if (usuario.getEmail().equalsIgnoreCase(email)) {
                Usuario usuarioAtualizado = null;
                usuario.setApelido(usuarioAtualizado.getApelido());
                usuario.setIdade(usuarioAtualizado.getIdade());
                usuario.setSuperPoder(usuarioAtualizado.getSuperPoder());
                usuario.setEmail(usuarioAtualizado.getEmail());
                return usuario;
            }
        }
        return null;
    }


    @PatchMapping("/{email}")
    public Usuario atualizarParcial(@PathVariable String email, @RequestBody Usuario dadosParciais) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(email)) {
                if (dadosParciais.getApelido() != null) {
                    usuario.setApelido(dadosParciais.getApelido());
                }
                if (dadosParciais.getIdade() != null) {
                    usuario.setIdade(dadosParciais.getIdade());
                }
                if (dadosParciais.getSuperPoder() != null) {
                    usuario.setSuperPoder(dadosParciais.getSuperPoder());
                }
                return usuario;
            }
        }
        return null;
    }

    @DeleteMapping("/{email}")
    public String deletar(@PathVariable String email) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getEmail().equalsIgnoreCase(email)) {
                usuarios.remove(i);
                return "Usuário " + email + " removido com sucesso!";
            }
        }
        return "Usuário não encontrado.";
    }
}




