import java.util.Scanner;

public class OperacionesRectangulo {

	public static void main (String args[]) {

		double  altura, base, perimetro, area;
		
		Rectangulo operaciones = new Rectangulo();
	 
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresar la altura del rectángulo: ");
		altura = sc.nextDouble();
		operaciones.setAltura(altura);
		
		
		System.out.print("\ningresar la base del rectángulo: ");
		base = sc.nextDouble();
		operaciones.setBase(base);


		System.out.println("\neste es el perimetro de un rectangulo: " + operaciones.perimetro());

		System.out.println("\neste es el area de un rectangulo: " + operaciones.area());

	}
}
