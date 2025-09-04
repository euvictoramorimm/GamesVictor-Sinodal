package com.sinodal.Games.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

//lombok
//Annotation that marks a class as a Lombok
@Getter
@Setter

public class Compra {

    //atributtes
    public Jogos jogo;
    public String usuario;
    public double valorCompra;
    public Date dataCompra;


    //method
    public String gerarResumo() {
        return "O usuário " + this.usuario + " comprou o jogo " + this.jogo + " em " + this.dataCompra +
                " por R$" + this.valorCompra + ".";
    }
}