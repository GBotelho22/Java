package aula07;

public class LancaChama extends Arma implements Disparavel {
    private double gas;

    public LancaChama(){
        this.gas=100;
    }

    @Override
    public double golpear(){
        this.destruicao=1;
        return destruicao;
    }

    @Override
    public void disparar() {
        this.gas-=10;
        if(gas<100){
            this.destruicao=5;
        }
        else if (gas<=0) {
            System.out.println("Acabou o gás");
            this.destruicao=0;
        }
    }

    @Override
    public void recarregar() {
        this.gas=100;
    }

    @Override
    public void infos(){
        System.out.println("Combustivel:"+ this.gas+" Dano:"+this.destruicao);
    }
}
