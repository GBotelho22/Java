package aula07;

public class Faca  extends Arma{

    private int lamina;

    public Faca(){
        this.lamina=7;
        this.destruicao=2;
    }

    @Override
    public double golpear(){
        this.lamina-=1;
        if(this.lamina<7){
            this.destruicao+= 2;
        }
        else if (this.lamina<0) {
            System.out.println("Lamina Quebrada");
            this.destruicao=0;
        }
        return destruicao;
    }

    @Override
    public void infos(){
        System.out.println("Laminas:"+ this.lamina +" Dano:"+ this.destruicao);
    }
}

