package com.sinodal.Games.model;

import java.sql.SQLOutput;

//Imports
public class Usuario {

    //attributes
    private List <jogo> bibliotecaDeJogos;
    private int id;
    private String email;
    private String nameUsuario;
    private boolean orientacao;
    private int idade;
    private boolean online;

    //methods
    public void infoUsuario() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getnameUsuario());
        System.out.println("Email: " + getEmail());
        System.out.println("Idade: " + getIdade());
        System.out.println("Online: " + getOnline());

    }




    //getters e setters

    private int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }

    private String getnameUsuario() {
        return nameUsuario;
    }

    private void setnameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    private boolean getOrientacao() {
        return orientacao;
    }
    private void setOrientacao(boolean orientacao) {
        this.orientacao = orientacao;
    }
    private int getIdade() {
        return idade;
    }
    private void setIdade(int idade) {
        this.idade = idade;

    }

    private boolean getOnline() {
        return online;
    }

    private void setOnline(boolean online) {
        this.online = online;
    }

    private String getEmail() {
        return email;
    }
    private void setEmail(String email) {
        this.email = email;
    }


}



