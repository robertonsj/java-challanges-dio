package sorteio;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * O programa irá gerar 7 números, de 1 a 20, e o usuário irá inserir 7 números.
 * A aplicação irá contabilizar quantos números digitados pelo usuário
 * correspodem aos números gerados pelo programa.
 */
public class SorteioNumeros {

	static final int MAX = 7; // Quantidade de números a serem inseridos.
	static int[] numerosGerados = new int[MAX]; // lista de números gerados pelo programa
	static int[] numerosInseridos = new int[MAX]; // lista de numeros inseridos pelo usuario

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		preencherListaNumerosInseridos(sc);
		exibirLista(numerosInseridos);
		preencherListaNumerosGerados(rd); // preencher lista 'numerosGerados'
		exibirLista(numerosGerados);
		
		verificarAcertos(numerosInseridos, numerosGerados);
		sc.close();
	}

	static int inserirNumeroInteiro(Scanner scanner) {
		return scanner.nextInt();
	}

	static void preencherListaNumerosInseridos(Scanner scanner) {
		// Pedir ao usuário para digitar 7 números inteiros, a fim de
		// criar a lista.
		for (int i = 0; i < MAX; i++) {

			boolean numeroInvalido;
			int numeroInserido;

			do {

				try {
					System.out.print("Digite o " + (i+1) + "º número: ");
					numeroInserido = inserirNumeroInteiro(scanner);
					numeroInvalido = false;
					numerosInseridos[i] = numeroInserido;

				} catch (InputMismatchException e) {
					numeroInvalido = true;
					System.out.println("\n\tPor favor, insira um número inteiro válido.");
				}

			} while (numeroInvalido);

		}
		System.out.println("\n*** Números do usuário!");
	}

	static void preencherListaNumerosGerados(Random random) {	
		for (int i = 0; i < MAX; i++) {
			numerosGerados[i] = random.nextInt(20); // Números aleatórios de 0 a 100
		}
		System.out.println("\n*** Números gerados pela aplicação!");
		
	}

	static void exibirLista(int[] numeros) {
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
		System.out.println();
	}

	static void verificarAcertos(int[] numerosInseridos, int[] numerosGerados) {
		int acertos = 0;

		for (int numeroInserido : numerosInseridos) {
			for (int numeroGerado : numerosGerados) {
				if (numeroInserido == numeroGerado) {
					acertos++;
					break;
				}
			}
		}

		System.out.println("\nNúmero de acertos: " + acertos);
	}
}
