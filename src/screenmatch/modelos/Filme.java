public class Filme {
    String nome;
    int anoDeLancamento;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    int duracaoEmMinutos;

    int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    double getSomaDasAvaliacoes(){
        return somaDasAvaliacoes
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
