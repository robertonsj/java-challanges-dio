package kickoff;

import java.io.BufferedReader;

import java.io.IOException;
import java.util.Scanner;

/**
 * Escrever uma classe Aluno com os atributos nome, matricula, curso
 * matriculado, nome de 3 disciplinas que está cursando e as notas dessas
 * disciplinas. Desenvolver um método para verificar se o aluno está
 * aprovado(nota maior ou igual a 7) em uma disciplina. O programa deve pedir
 * as informações do aluno ao usuário e ao final informa o nome das disciplinas,
 * as notas e se o aluno foi aprovado.
 */

public class AlunoVaiNaWeb {
	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplinas;
	private double[] notas;
	private static final int SIZE = 3;

	public AlunoVaiNaWeb(String nome2, 
			String matricula2, String curso2) {
		
		this.nome = nome2;
		this.matricula = matricula2;
		this.curso = curso2;
		this.disciplinas = new String[SIZE];
		this.notas = new double[SIZE];
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
		for (String disciplina : this.disciplinas)
			System.out.println(disciplina);
	}

	public void setDisciplinas(BufferedReader in) throws IOException {

		for (int i = 0; i < SIZE; i++) {
			System.out.print("\tInsira a disciplina " + (i + 1) + ": ");
			this.disciplinas[i] = in.readLine();
		}
		System.out.println("\n\t\tDisciplinas foram inseridas.\n");
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(Scanner sc) throws IOException {

		for (int i = 0; i < SIZE; i++) {
			System.out.print("\tInsira a nota de " + this.disciplinas[i] + ": ");
			this.notas[i] = sc.nextDouble();
		}
		System.out.println("\n\t\tNotas foram inseridas.\n");
	}

	//
	public String getSituacao(String disciplina) {
		String situacao = "";
		for (int i = 0; i < SIZE; i++) {
			if (this.disciplinas[i].equals(disciplina)) {
				if (this.notas[i] >= 7)
					situacao += "Aprovado";
				else
					situacao += "Não aprovado";
				break;
			}
		}
		return situacao;
	}
	
	public void exibirInfoDeAluno () {
		System.out.println("\t--------- *** ---------");
		System.out.println("\tNome: " + getNome() + "\n"
				+ "\tMatricula: " + getMatricula() + "\n"
				+ "\tCurso: " + getCurso());
		System.out.println("\t--------- *** ---------");
		for(int i = 0; i < SIZE; i++) {
			System.out.println("\t" + this.disciplinas[i].toUpperCase() + ": \n"
					+ "\tnota: " + this.notas[i] + "\n"
					+ "\tsituação: " + getSituacao(this.disciplinas[i]));
			System.out.println("\t---------------------");
		}
	}
	
	

}
