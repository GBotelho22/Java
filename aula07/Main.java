package aula07;

public class Main {

    public static void main(String args[]) {

        Faca f = new Faca();
        Revolver r = new Revolver();
        LancaChama lc = new LancaChama();

        agredir(f);
        agredir(f);
        agredir(f);
        agredir(f);
        agredir(f);
        agredir(f);
        agredir(f);
        agredir(f);
        infos(f);





    }
        public static void agredir (Arma a){
            a.golpear();
        }

        public static void disparar(Disparavel d){
            d.disparar();
        }

        public static void reload(Disparavel d){
            d.recarregar();
        }

        public static void infos(Arma a){
            a.infos();
        }
}


