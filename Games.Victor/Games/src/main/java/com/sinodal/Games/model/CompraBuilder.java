package com.sinodal.Games.model;

import java.util.Date;

public class CompraBuilder {
    //atributtes with polimorfism
    public int id;
    public Jogos jogo;
    public String usuario;
    public double valorCompra;
    public Date dataCompra;
    public boolean Comprado;

    public CompraBuilder comId(Long id) {
        this.id = id;
        return this;

    }
