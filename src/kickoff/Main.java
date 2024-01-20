package kickoff;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));

		AlunoVaiNaWeb alunoVnw = new AlunoVaiNaWeb("Roberto",
				"SI2019", "Sistemas de Informação");
		
		try {
			
			alunoVnw.setDisciplinas(in);
			
			alunoVnw.setNotas(sc);
			
			alunoVnw.exibirInfoDeAluno();
			
			alunoVnw.getSituacao("redes");
			
		}catch (IOException ex) {
			System.out.println(ex);
		}
		
	}

}
