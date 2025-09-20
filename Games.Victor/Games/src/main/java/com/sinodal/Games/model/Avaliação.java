package com.sinodal.Games.model;

public class Avaliação {

    //atributtes
    public Usuario usuario;
    public Jogo jogo;
    public int nota;
    public String comentario;


    //method
    public String gerarResumo() {
        return ("O usuário " + this.usuario + " avaliou o jogo " + this.jogo + " com a nota " + this.nota +
                " e comentou: " + this.comentario);

    }


}