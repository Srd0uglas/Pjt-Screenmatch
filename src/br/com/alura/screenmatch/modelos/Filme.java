package br.com.alura.screenmatch.modelos;

import calculos.Classificavel;

//A classe vai TITULO especificar tudo que o filme tem (características)
//extends filme tem tudo que o título tem
public class Filme extends Titulo implements Classificavel {
  private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }
}
