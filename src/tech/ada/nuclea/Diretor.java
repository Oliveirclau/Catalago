package tech.ada.nuclea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Diretor extends Pessoa {
    private List<Filme> filmesDirigidos;

    public Diretor(String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
        filmesDirigidos = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmesDirigidos.add(filme);
    }

    public List<Filme> getFilmesDirigidos() {
        return filmesDirigidos;
    }

    public void setFilmesDirigidos(List<Filme> filmesDirigidos) {
        this.filmesDirigidos = filmesDirigidos;
    }
}

