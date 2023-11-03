package exercicios.ruhanconceicao;

//The following algorithm caculates the energia cinética of a moving object.
//by using the formula Energia cinética = massa * Math.pow(velocidade,2) / 2
public class EnergiaCinetica {

	protected double massa, velocidade, energiaCinetica;
	
	public EnergiaCinetica(double m, double v){
		this.massa = m;
		this.velocidade = v;
		this.energiaCinetica = massa * Math.pow(velocidade,2) / 2.0;
	}


}
