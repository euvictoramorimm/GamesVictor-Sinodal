package com.sinodal.Games.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

//lombok
//Annotation that marks a class as a Lombok
@Getter
@Setter

public class Compra {

    //atributtes
    private String jogo;
    private String usuario;
    private Date dataCompra;
    public double valorCompra;
    public String comentarioCompra;

    public Comprar(String newName, String newEmail, String newPassword, RoleModel newRole) {
        this.nameUser = newName;
        this.email = newEmail;
        this.password = newPassword;
        this.role = newRole;


}