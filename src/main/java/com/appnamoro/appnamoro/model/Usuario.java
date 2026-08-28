package com.appnamoro.appnamoro.model;

public class Usuario {
    private String apelido;
    private Integer idade;
    private String email;
    private String superPoder;

    public Usuario() {
    }

    public Usuario(String apelido, Integer idade, String superPoder, String email) {
        this.apelido = apelido;
        this.idade = idade;
        this.superPoder = superPoder;
        this.email = email;
    }


    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSuperPoder() {
        return superPoder;
    }

    public void setSuperPoder(String superPoder) {
        this.superPoder = superPoder;
    }


}