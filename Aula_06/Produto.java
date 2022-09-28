package Aula_06;

 public abstract class Produto {
    private String nome;
    private double valor;

    public void produto(){

    }

    public void produto(String nome, double valor){
        this.nome=nome;
        this.valor=valor;
    }

    public double getValorliquido(){
        return 0;
    }


    public String getNome(){
        return this.nome;
    }

    public double getValor(){
        return this.valor;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setValor(double valor){
        this.valor=valor;
    }


}
