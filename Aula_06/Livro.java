package Aula_06;

public class Livro  extends Produto{

    private String ISBN;

    public void livro (){
    }

    public void livro (String nome,double valor,String ISBN){
        super (nome,valor);
        this.ISBN=ISBN;
    }

    public double getValorliquido(){
        return getValor()*0.75;
    }

    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }

    public String getISBN(){
        return this.ISBN;
    }

}
