package com.sinodal.Games.model;

    public class GerenciadorDeLogin {

        // 1. O atributo estático que vai guardar a ÚNICA instância da classe.
        private static GerenciadorDeLogin instancia;

        // Atributo para guardar o estado (quem está logado)
        private Usuario usuarioLogado;

        // 2. O construtor é PRIVADO.
        // Isso impede que qualquer outra parte do código crie uma instância com "new GerenciadorDeLogin()".
        private GerenciadorDeLogin() {
            // Inicialização, se necessário
        }

        // 3. O método público estático que dá acesso à instância.
        // Este é o único "portão de entrada" para a classe.
        public static GerenciadorDeLogin getInstancia() {
            // Se a instância ainda não foi criada...
            if (instancia == null) {
                // ...cria a única instância.
                instancia = new GerenciadorDeLogin();
            }
            // ...e sempre retorna a mesma instância.
            return instancia;
        }

        // Métodos de negócio do nosso gerenciador
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
