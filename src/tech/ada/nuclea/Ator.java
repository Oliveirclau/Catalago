package tech.ada.nuclea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ator extends Pessoa {
    private List<Filme> filmes;

    public Ator(String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
        filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
}
