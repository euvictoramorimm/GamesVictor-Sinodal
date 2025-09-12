package com.sinodal.Games.model;

public class FabricaDeAvaliacoes {

    /**
     * Este é o nosso "método fábrica".
     * Ele recebe os dados simples e cuida da parte "chata" de montar o objeto Avaliação.
     */
    public Avaliacao criarAvaliacao(Usuario usuario, Jogo jogo, int nota, String comentario) {
        // Validações poderiam ser adicionadas aqui
        if (usuario == null || jogo == null) {
            System.out.println("ERRO: Usuário ou Jogo não pode ser nulo.");
            return null; // Retorna nulo se os dados essenciais faltarem
        }
        if (nota < 1 || nota > 5) {
            System.out.println("ERRO: A nota deve ser entre 1 e 5.");
            return null;
        }

        // A lógica de criação do objeto fica centralizada aqui.
        Avaliacao novaAvaliacao = new Avaliacao();
        novaAvaliacao.setUsuario(usuario);
        novaAvaliacao.setJogo(jogo);
        novaAvaliacao.setNota(nota);
        novaAvaliacao.setComentario(comentario);

        System.out.println("Avaliação criada com sucesso pela fábrica!");
        return novaAvaliacao;
    }
}

