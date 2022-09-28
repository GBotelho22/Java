package aula_05;

public class PF extends Pessoa {


    public double calcularImposto(){
        if(getRendimentos() < 3000){
            return getRendimentos()*0.88;
        }
        else return getRendimentos()*0.725;
    }
}
