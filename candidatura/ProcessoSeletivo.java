package candidatura;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Random;
/**
 * A candidatura deve selecionar no máximo 5 candidatos para a 
 * entrevista, os quais o salário pretendido seja menor ou igual
 * o salário base. 
 * Ao final das candidaturas, o selecionados e seus salários devem
 * ser exibidos.
 */
public class ProcessoSeletivo {

	static ArrayList<String> candidatosAprovados = new ArrayList<>();
	static ArrayList<Double> salariosAprovados = new ArrayList<>();
	static final double SALARIOBASE = 2000;
	
	public static void main(String[] args) {

		String[] candidatos = {"Roberto", "Jose", "Rayane", "Maria",
				"Raimundo", "Lenita", "Joaquim", "Miguel", "Teodora",
				"Manuel"};
		
		selecionarCandidatos(candidatos);
		imprimirSelecionados();
	}

	static void analisarCandidato(double salarioPretendido, String candidato) {
		
		if (SALARIOBASE > salarioPretendido)
			System.out.println("\nLIGAR PARA O CANDIDATO " + candidato.toUpperCase());
		else if (SALARIOBASE == salarioPretendido)
			System.out.println("\nLIGAR PARA O CANDIDATO COM CONTRA PROPOSTA " + candidato.toUpperCase());
		else
			System.out.println("\nAGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS ");
	}
	
	static void selecionarCandidatos(String[] candidatos) {
		//String[] candidatosAprovados = new String[5];
		
		for(int i = 0; i < candidatos.length; i++) {
			
			double salarioGerado = Math.round(salarioPretendido());
			analisarCandidato(salarioGerado, candidatos[i]);
			
			if(salarioGerado <= SALARIOBASE && candidatosAprovados.size() <= 5) {
				candidatosAprovados.add(candidatos[i]);
				salariosAprovados.add(salarioGerado);
			}
			if(candidatosAprovados.size() == 5) break;
		}
	}
	
	static double salarioPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void imprimirSelecionados() {
		System.out.println("\n========= *** =========");
		for(int i = 0; i < candidatosAprovados.size(); i++) {
			System.out.println("Nome: " + candidatosAprovados.get(i) + "\n"
					+ "Salário: R$" + salariosAprovados.get(i));
			System.out.println(realizarContato(candidatosAprovados.get(i)));
			System.out.println("----------------------------");
		}
	}
	
	static String realizarContato(String candidato) {
	
		for(int i = 0; i < 3; i++) {
			
			if(new Random().nextInt(3) == 1) {
				return "CONTATO REALIZADO COM " + candidato.toUpperCase()
						+ " NA TENTATIVA " + (i+1);
			}
		}
		return "NÂO CONSEGUIMOS CONTATO COM " + candidato.toUpperCase(); 
		
	}
}
