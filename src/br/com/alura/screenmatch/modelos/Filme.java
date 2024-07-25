package br.com.alura.screenmatch.modelos;

//A classe vai especificar tudo que o filme tem (características)
//extends filme tem tudo que o título tem
public class Filme extends Titulo{
  private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
