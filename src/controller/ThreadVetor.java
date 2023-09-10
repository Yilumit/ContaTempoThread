package controller;

public class ThreadVetor extends Thread{

	private int valor;
	private int vetor[];
	
	public ThreadVetor(int valor, int vetor[]) {
		this.valor = valor;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		if (valor%2==0) {
			casoPar();
		} else {
			casoImpar();
		}
	}

	private void casoImpar() {
		
		double tempoInicial = System.nanoTime();//Atribui para a variável o horário em nanosegundos no momento em que a linha de código for compilada
		for (int i : vetor) {
			
		}
		double tempoFinal = System.nanoTime();
		
		double tempoTotal = tempoFinal - tempoInicial;//Calcula o tempo gasto
		tempoTotal = tempoTotal * Math.pow(10, 9);	//Converte de nanossefundos para segundos
		
		System.out.println("Tempo gasto para percorrer o vetor "+valor+": "+tempoTotal+"s");
	}

	

	private void casoPar() {
		int tamanho = vetor.length;
		
		double tempoInicial = System.nanoTime();//Atribui para a variável o horário em nanosegundos no momento em que a linha de código for compilada
		for (int i = 0; i < tamanho; i++) {
			
		}
		double tempoFinal = System.nanoTime();
		
		double tempoTotal = tempoFinal - tempoInicial;//Calcula o tempo gasto
		tempoTotal = tempoTotal * Math.pow(10, 9);
		System.out.println("Tempo gasto para percorrer o vetor "+valor+": "+tempoTotal+"s");
	}

}
