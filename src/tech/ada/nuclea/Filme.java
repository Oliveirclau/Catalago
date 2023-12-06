package tech.ada.nuclea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private LocalDate dataLancamento;
    private double orçamento;
    private String descricao;
    private Diretor diretor;
    private List<Ator> atores;

    public Filme(String nome, LocalDate dataLancamento, double orçamento, String descricao) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orçamento = orçamento;
        this.descricao = descricao;
        atores = new ArrayList<>();
    }

    public void adicionarAtor(Ator ator) {
        atores.add(ator);
        ator.adicionarFilme(this);
    }

    public void definirDiretor(Diretor diretor) {
        this.diretor = diretor;
        diretor.adicionarFilme(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public double getOrçamento() {
        return orçamento;
    }

    public void setOrçamento(double orçamento) {
        this.orçamento = orçamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
}

