package br.com.curso.demo.hellou;

public class Hellou {
    private final long id;
    private final String mensagm ;

  public long getId() {
      return id;
  }

    public String getMensagm() {
        return this.mensagm;
    }

    public Hellou( long id, String mensagem) {
       this.id = id;
       this.mensagm = mensagem;


    }

}
