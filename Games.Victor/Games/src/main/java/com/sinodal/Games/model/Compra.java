package com.sinodal.Games.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

//lombok
//Annotation that marks a class as a Lombok
@Getter
@Setter

public class Compra {

    //atributtes with polimorfism
    public int id;
    public Jogos jogo;
    public String usuario;
    public double valorCompra;
    public Date dataCompra;
    public boolean Comprado;

    //method
    public String gerarResumo() {
        return "O usuário " + this.usuario + " comprou o jogo " + this.jogo + " em " + this.dataCompra +
                " por R$" + this.valorCompra + ".";
    }
    public String Comprar() {
        return "O " + this.jogo + " foi comprado por R$" + valorCompra + ".";
        Comprado = true;

    }

}