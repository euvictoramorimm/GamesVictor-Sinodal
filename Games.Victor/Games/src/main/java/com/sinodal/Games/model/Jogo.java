package com.sinodal.Games.Model;

public class Jogo {

    //atributtes
    public String usuario;
    public String gameName;
    public String dataDeLancamento;
    public double preco;
    public boolean comprado;

    //methods
    public String entrarNoJogo() {
        if (this.comprado == true) {
            return ("Abrindo o jogo...")
        }else {
            return ("ERRO, o jogo não foi comprado.")
        }

    }

}