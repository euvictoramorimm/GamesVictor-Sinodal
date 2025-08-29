package com.sinodal.Games.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

//lombok
//Annotation that marks a class as a Lombok
@Getter
@Setter

public class Compras {

    //atributtes
    private String jogo;
    private String usuario;
    private Date dataCompra;
    public double valorCompra;

    //method
    public String gerarResumo() {
        return "O usuário " + usuario + " comprou o jogo " + jogo + " em " + dataCompra +
                " por R$" + valorCompra + ".";
    }
    
    Compra minhaCompra = new Compra();
    minhaCompra.setUsuario("Victor");
    minhaCompra.setJogo("The Witcher 3");
    minhaCompra.setValorCompra("89.90");
    minhaCompra.setDataCompra(new Date());

    String resumoDaCompra = minhaCompra.gerarResumo();

    System.out.println(resumoDaCompra);
}