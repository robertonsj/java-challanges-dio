package enumexample;

public class SistemaIBGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getNome() + " - " + e.getSigla());
		}
		
	}

}
