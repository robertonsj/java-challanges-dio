package exercicios.ruhanconceicao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the object mass: ");
		double massa = scan.nextDouble();
		System.out.print("Enter the object speed: ");
		double velocidade = scan.nextDouble();
		
		EnergiaCinetica energiaC = new EnergiaCinetica(massa, velocidade);
		System.out.println("A energia cinética do objecto é: " + energiaC.energiaCinetica);
	}
	

}
