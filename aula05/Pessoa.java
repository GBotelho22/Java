package aula_05;

public abstract class Pessoa {

    protected String nome;
    protected String endereço;
    protected double rendimentos;

    public Pessoa (){

    }

    public Pessoa(String nome,String endereço, double rendimentos){
        this.nome=nome;
        this.endereço=endereço;
        this.rendimentos=rendimentos;

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getEndereço(){
        return endereço;
    }

    public void setEndereço(String endereço){
        this.endereço=endereço;
    }

    public double getRendimentos(){
        return rendimentos;
    }

    public void setRendimentos(double rendimentos){
        this.rendimentos=rendimentos;
    }

}
