package kickoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class AlunoVaiNaWeb {
	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplinas;
	private double[] notas;
	
	public AlunoVaiNaWeb(String nome2, String matricula2,
			String curso2) {
		this.nome = nome2;
		this.matricula = matricula2;
		this.curso = curso2;
		this.disciplinas = new String[3];
		this.notas = new double[this.disciplinas.length];
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void getDisciplinas() {
		for(String disciplina : this.disciplinas)
		System.out.println(disciplina);
	}

	public void setDisciplinas(BufferedReader in) throws IOException{
		
		for(int i = 0; i < this.disciplinas.length; i++) {
			System.out.print("Insira a disciplina " + (i+1) + ": ");
			this.disciplinas[i] = in.readLine();
		}
		System.out.println("\nDisciplinas foram inseridas.\n");
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(Scanner sc) throws IOException {
		
		for(int i = 0; i < this.disciplinas.length; i++) {
			System.out.print("Insira a nota de " + this.disciplinas[i] + ": ");
			this.notas[i] = sc.nextDouble();
		}
		System.out.println("\nNotas foram inseridas.\n");
	}
	
	//
	public void verificarAprovacao(String disciplina) {
		for(int i = 0; i < this.disciplinas.length; i++) {
			if(this.disciplinas[i].equals(disciplina)) {
				if(this.notas[i] >= 7) System.out.println("\nAprovado, parabéns!\n");
				else System.out.println("\nNão foi aprovado, estude mais.");
				break;
			}
		}
	}
	
	
}
