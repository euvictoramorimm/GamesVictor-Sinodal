package com.sinodal.Games.model;

    public class GerenciadorDeLogin {


        private static GerenciadorDeLogin instancia;

        //Atributtes
        private Usuario usuarioLogado;

        //method constructor
        private GerenciadorDeLogin() {
        }

        // methods
        public static GerenciadorDeLogin getInstancia() {
            if (instancia == null) {
                instancia = new GerenciadorDeLogin();
            }
            return instancia;
        }
        public void login(Usuario usuario) {
            System.out.println("Login realizado para o usuário: " + usuario.nameUsuario);
            this.usuarioLogado = usuario;
            usuario.online = true;
        }

        public void logout() {
            if (this.usuarioLogado != null) {
                System.out.println("Logout realizado para o usuário: " + this.usuarioLogado.nameUsuario);
                this.usuarioLogado.online = false;
                this.usuarioLogado = null;
            }
        }

        public Usuario getUsuarioLogado() {
            return this.usuarioLogado;
        }
    }
}
