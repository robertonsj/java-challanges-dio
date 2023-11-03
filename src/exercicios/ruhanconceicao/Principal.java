package exercicios.ruhanconceicao;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
                DecimalFormat format = new DecimalFormat(".####");
		
		System.out.print("First: ");
		double first = scan.nextDouble();
		System.out.print("Second: ");
		double second = scan.nextDouble();
		System.out.print("Third: ");
		double third = scan.nextDouble();
		
                /*
                Kinetic Energy.
		EnergiaCinetica energiaC = new EnergiaCinetica(massa, velocidade);
                PerimetroCirculo  perimetroC = new PerimetroCirculo(radius);
                MediaGeometrica mGeometrica = new MediaGeometrica(first, second, third);
		System.out.println("The geometric mean is approximately: " + 
                        format.format(mGeometrica.geometricMean));
                        */
                
	}
	

}
