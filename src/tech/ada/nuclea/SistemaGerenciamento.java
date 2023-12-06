package tech.ada.nuclea;

import java.util.ArrayList;
import java.util.List;

public class SistemaGerenciamento {
    private List<Filme> filmes;
    private List<Ator> atores;
    private List<Diretor> diretores;

    public SistemaGerenciamento() {
        filmes = new ArrayList<>();
        atores = new ArrayList<>();
        diretores = new ArrayList<>();
    }

    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void cadastrarAtor(Ator ator) {
        atores.add(ator);
    }

    public void cadastrarDiretor(Diretor diretor) {
        diretores.add(diretor);
    }

    public Filme buscarFilmePorNome(String nome) {
        return filmes.stream()
                .filter(filme -> filme.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

    // Métodos adicionais conforme necessidade
}

