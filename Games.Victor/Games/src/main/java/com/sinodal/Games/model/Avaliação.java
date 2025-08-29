package com.sinodal.Games.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Avaliação {

    //atributtes
    private String usuario;
    private String jogo;
    private int nota;
    private String comentario;

    //method
    public String gerarResumo() {
        return "O usuário " + usuario + " avaliou o jogo " + jogo + " com a nota " + nota +
                " e comentou: " + comentario;
    }

    public static void main(String[] args) {
        Avaliação minhaAvaliação = new Avaliação();
        minhaAvaliação.setUsuario("Victor");
        minhaAvaliação.setJogo("The Witcher 3");
        minhaAvaliação.setNota(10);
        minhaAvaliação.setComentario("Ótimo jogo, para quem gosta dos livros e de RPGs, vai amar!");

        System.out.println(minhaAvaliação.gerarResumo());
    }
}