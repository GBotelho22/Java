package aula_05;

public class PJ extends Pessoa{

    private int cnpj;

    public double calcularImposto(){
        return getRendimentos()*0.82;
    }

    public int getCnpj(){
        return cnpj;
    }

    public void setCnpj(int cnpj){
        this.cnpj=cnpj;
    }

}
