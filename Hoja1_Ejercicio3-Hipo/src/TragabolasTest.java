import java.util.*;
/**
 * 
 * @author Rafa
 *
 */
public class TragabolasTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String color="";
		int maxBolas;
		int bolasComidas=0;
		int jugar;
		TragaBolas hipopotamo; // ??
		hipopotamo = new TragaBolas();
		System.out.println("1-Crear Hipopotamo\n2-Comer\n3-Dormir\n4-Trotar\n5-Visualizar\n0-Salir");
		jugar = sc.nextInt();
		while (jugar!=0) {
			switch (jugar) {
			case 1:
				sc.nextLine();
				do {
					System.out.println("Color del hipopotamo?");
					color = sc.nextLine();
				} while (!color.toLowerCase().equals("verde") && !color.toLowerCase().equals("rojo") && !color.toLowerCase().equals("amarillo"));
				System.out.println("Bolas m�ximas?");
				maxBolas = sc.nextInt();
				hipopotamo = new TragaBolas(color, bolasComidas ,maxBolas ); //Crear objeto clase tragabolas
				hipopotamo.setMaxBolas(maxBolas);//darle valores
				hipopotamo.setColor(color);
				break;
			case 2:
				hipopotamo.comer();
				break;
			case 3:
				hipopotamo.dormir();
				break;
			case 4:
				hipopotamo.trotar();// visualizar con el metodo de clase?
				break;
			case 5:
				hipopotamo.visualizar();// visualizar con el metodo de clase?
				break;
			}//Switch
			System.out.println("2-Comer\n3-Dormir\n4-Trotar\n5-Visualizar\n0-Salir");
			jugar = sc.nextInt();
		}



	}//main

}//Class
