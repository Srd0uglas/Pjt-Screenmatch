import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
//  Instância da Classe br.com.alura.screenmatch.modelos.Filme
       Filme meuFilme = new Filme();
       meuFilme.setNome( "As vantagens de ser Invisível");
       meuFilme.setAnoDeLancamento(2010);
       meuFilme.setDuracaoEmMinutos(180);
//       Quando eu chamar o método exibeFichaTecnica ele precisa exibir o que eu determinei
       meuFilme.exibeFichaTecnica();


       meuFilme.avalia(8);
       meuFilme.avalia(10);
       meuFilme.avalia(5);
       System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
       System.out.println(meuFilme.pegaMedia());
    }
}
