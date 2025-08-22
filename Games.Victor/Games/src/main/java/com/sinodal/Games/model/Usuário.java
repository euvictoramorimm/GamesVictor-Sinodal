package com.sinodal.Games.model;

//Imports
public class Usuario {

    //attributes
    public String nameUsuario;
    private boolean Orientacao;
    private int Idade

    //methods
    public void CalculaIdade (String NomeUsuario)
    {
        this.NameUsuario= NomeUsuario;

    }
    public String returnName (String NomeUsuario)
    {
        this.NameUsuario= "Prof"+NomeUsuario;
        System.out.println(this.NameUsuario);

        return this.NameUsuario;
}

