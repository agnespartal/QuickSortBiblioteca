package view;

import controller.Ordenacao;

public class Principal {

	public static void main(String[] args) {
		Ordenacao ord = new Ordenacao();
		int[] vetor = {89, 54, 18, 71, 93, 45, 19, 14, 99, 2, 27, 3, 58, 91, 75};
		System.out.println("Bubble sort");
		ord.ordenacaoBubble(vetor);
		System.out.println("\n\nMerge sort");
		ord.ordenacaoMergeSort(vetor);
		System.out.println("\n\nQuick sort");
		ord.ordenacaoQuickSort(vetor);
	}

}
