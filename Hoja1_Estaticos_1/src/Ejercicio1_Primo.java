import java.util.Scanner;
/**
 * 
 * @author Rafa
 *
 */
/*Hacer un programa que lea un n�mero N y nos escriba en la pantalla mediante un mensaje si es
� no primo (NOTA: N�mero primo es aqu�l que es divisible solo por s� mismo y por, la unidad)
Desarrollar este programa creando un m�todo llamado primo que devuelva true si el n�mero
es primo y false si no lo es.*/
public class Ejercicio1_Primo {

	public static void main(String[] args) {
		int num;
		System.out.println("Introduce un numero");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (Metodos.esPrimo(num)) {
			System.out.println("Es primo");
		}else{
			System.out.println("No es primo");
		}

	}//main

}//Class

