package exercicios.ruhanconceicao;

//The program aims to calculate the kinetic energy of a moving object.
//KE = massa * Math.pow(velocidade,2) / 2
public class EnergiaCinetica {

	protected double massa, velocidade, energiaCinetica;
	
	public EnergiaCinetica(double m, double v){
		this.massa = m;
		this.velocidade = v;
		this.energiaCinetica = massa * Math.pow(velocidade,2) / 2.0;
	}


}
