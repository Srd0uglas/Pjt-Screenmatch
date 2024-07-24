package br.com.alura.screenmatch.modelos;

//A classe vai especificar tudo que o filme tem (características)
public class Filme {
   private String nome;
   private int anoDeLancamento;
   private boolean incluidoNoPlano;
   private double somaDasAvaliacoes;
   private int totalDeAvaliacoes;
   private int duracaoEmMinutos;

    //       Método acessor
   public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
//    Método para deixar a pessoa incluir um nome
//    String nome é so um parametro

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //    Método = vai imprimir a ficha técnica do filme
    public void exibeFichaTecnica(){
        System.out.println("Nome do br.com.alura.screenmatch.modelos.Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

//    Método para somar as avaliações
//    a variável avaliação está declarada como double, então preciso passar um parâmetro double para o método
//    "nota" é o parâmetro
    public void avalia(double nota){
        somaDasAvaliacoes = somaDasAvaliacoes + nota;
//        a cada avaliação feita o método vai incrementar (adicionar mais 1)
        totalDeAvaliacoes++;
    }

//  Método para mostrar a média
    public double pegaMedia(){
//        return é para retornar um valor
    return somaDasAvaliacoes/totalDeAvaliacoes;
}
}
