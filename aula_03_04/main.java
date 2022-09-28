import java.util.Scanner;

public class main {
	
	  public static void main(String args[]) {
		  
		  Tanque Tanque = new Tanque ();
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Max: ");
	      float max = sc.nextFloat();
	        
	      System.out.print("min: ");
	      float min = sc.nextFloat();
	      
	      Tanque.setVolumeMax(max);
	      Tanque.setVolumeMin(min);
	      
	      System.out.println("");
	      
	      int opcao = Menu();
	      
	      while(opcao != 4) {
	    	  
	    	  System.out.println("max: " + Tanque.getVolumeMax());
		      System.out.println("min: " + Tanque.getVolumeMin());
		      System.out.println("Atual: " + Tanque.getVolumeAtual());
		      System.out.println("Status da Bomba: "+Tanque.exibirinfo());
		      
		      System.out.println("");
	    	  
		      switch(opcao) {
		      	case 1:
		      			System.out.print("Quantos litros deseja encher: ");
		      			float encher = sc.nextFloat();
		      			System.out.println("");
		      			
		      			if(Tanque.getVolumeMax() >= (Tanque.getVolumeAtual() + encher)) {
		      				Tanque.encher(encher);
		      			} else {
		      				System.out.print("Ultrapassou a quantidade do tanque!!!");
		      			}
		      		break;
		      	case 2:
	      				System.out.print("Quantos litros deseja esvaziar: ");
	      				float esvaziar = sc.nextFloat();
	      				System.out.println("");
	      			
	      				if(Tanque.getVolumeMin() <= (Tanque.getVolumeAtual() - esvaziar)) {
	      					Tanque.esvaziar(esvaziar);
	      					
	      				} else {
	      					System.out.print("Ultrapassou a quantidade do tanque!!!");
	      				}
	      			break;
		      	case 3:
		      			System.out.println("max: " + Tanque.getVolumeMax());
		      			System.out.println("min: " + Tanque.getVolumeMin());
				    	System.out.println("Atual: " + Tanque.getVolumeAtual());
				    	System.out.println("Status da Bomba: "+Tanque.exibirinfo());
      				break;
		      }
		      
		      System.out.println("");
		      opcao = Menu();
	      }
	      
	      
	  }
	  
	  public static int Menu() {
		  Scanner sc = new Scanner(System.in);

		  System.out.println("1. Encher o tanque ");
		  System.out.println("2. Esvaziar o tanque ");
		  System.out.println("3. Exibir ");
		  System.out.println("4. Encerrar ");

		  System.out.println("");
		  
		  System.out.print("Digite:");
	      int menu = sc.nextInt();
		  
		  return menu;
	  }
}

