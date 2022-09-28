package Aula_06;

public class DVD extends Produto{

    private String SN;


    public void DVD(){
    }
    public void DVD(String nome,double valor,String SN){
       super(nome,valor);
        this.SN=SN;
    }

    public double getValorliquido(){
        return getValor()*0.9;
    }

    public void setSN(String SN){
        this.SN=SN;
    }

    public String SN(){
        return this.SN;
    }

}
