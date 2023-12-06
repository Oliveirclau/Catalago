import tech.ada.nuclea.Ator;
import tech.ada.nuclea.Diretor;
import tech.ada.nuclea.Filme;
import tech.ada.nuclea.SistemaGerenciamento;

import java.time.LocalDate;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        SistemaGerenciamento gerenciamento = new SistemaGerenciamento();

        Diretor diretor1 = new Diretor("Christopher Nolan", LocalDate.of(1970, 7, 30));
        Diretor diretor2 = new Diretor("Quentin Tarantino", LocalDate.of(1963, 3, 27));

        Ator ator1 = new Ator("Leonardo DiCaprio", LocalDate.of(1974, 11, 11));
        Ator ator2 = new Ator("Brad Pitt", LocalDate.of(1963, 12, 18));

        gerenciamento.cadastrarDiretor(diretor1);
        gerenciamento.cadastrarDiretor(diretor2);
        gerenciamento.cadastrarAtor(ator1);
        gerenciamento.cadastrarAtor(ator2);

        Filme filme1 = new Filme("Inception", LocalDate.of(2010, 7, 16), 160000000, "Um ladrão que rouba segredos corporativos através do uso da tecnologia de compartilhamento de sonhos é dado a tarefa inversa de plantar uma ideia na mente de um CEO.");
        filme1.definirDiretor(diretor1);
        filme1.adicionarAtor(ator1);

        Filme filme2 = new Filme("Once Upon a Time in Hollywood", LocalDate.of(2019, 7, 26), 90000000, "Um ator de televisão desbotado e seu dublê se esforçam para alcançar a fama e o sucesso na indústria cinematográfica durante os últimos anos da Era de Ouro de Hollywood em Los Angeles em 1969.");
        filme2.definirDiretor(diretor2);
        filme2.adicionarAtor(ator2);

        gerenciamento.cadastrarFilme(filme1);
        gerenciamento.cadastrarFilme(filme2);

        Filme filmeBuscado = gerenciamento.buscarFilmePorNome("Inception");
        if (filmeBuscado != null) {
            System.out.println("Filme encontrado: " + filmeBuscado.getNome());
        } else {
            System.out.println("Filme não encontrado.");
        }
    }
}
