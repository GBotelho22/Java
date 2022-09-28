package aula07;

public class Revolver extends Arma implements Disparavel {

    private int cartucho;

    public Revolver(){
        this.cartucho=6;
    }

    @Override
    public double golpear(){
        this.destruicao+=1;
        return destruicao;
    }

    @Override
    public void disparar(){
        this.cartucho-=1;
        if(this.cartucho<6){
            this.destruicao+=5;
        }
        else if (this.cartucho<=0) {
            System.out.println("Voce está sem Cartuchos");
            this.destruicao=0;
        }
    }

    @Override
    public void recarregar() {
        System.out.println("Arma recarregada");
        this.cartucho=6;

    }

    @Override
    public void infos(){
        System.out.println("Cartuchos:"+ this.cartucho+" Dano:"+this.destruicao);

    }
}
