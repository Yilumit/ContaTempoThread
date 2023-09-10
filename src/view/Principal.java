package view;
/*
 *	Projeto com uma Thread chamada ThreadVetor que recebe um  valor numérico e vetor como parâmetros.
 * 	Caso o valor numérico seja par, a thread percorre o vetor utilizando uma estrutura for(int i = 0 ; i < vet.length; i++) e conta o tempo para percorrer o vetor. 
 * 	Caso o valor numérico seja ímpar, a thread percorre o vetor utilizando uma estrutura foreach.
 */
import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		int vet[] = new int[1000];
		
		for (int i : vet) {
			vet[i] = (int)(Math.random()*100)+1;
		}
		
		for (int i = 1; i <= 2; i++) {
			Thread temp = new ThreadVetor(i, vet);
			temp.start();
		}
	}
}
