package br.com.letscode;

public class MergeSort {

    int[] arrayOriginal;

    public MergeSort(int[] arrayOriginal) {
        this.arrayOriginal = arrayOriginal;
    }

    public void mSort(){
        separarArrays(arrayOriginal);
    }

    public int definirM(int[] arrayOriginal) {
        //verifica se o número de elementos é par e define o elemento a ser usado de referência
        if (arrayOriginal.length % 2 == 0) {
            return arrayOriginal.length / 2;
        } else {
            return arrayOriginal.length / 2 + 1;
        }
    }

    //método para criar duas arrays separando a original

    public void separarArrays(int[] arrayOriginal) {

        if (arrayOriginal.length > 1){
            int m = definirM(arrayOriginal);

            int[] primeiraMetade = new int[m];
            int[] segundaMetade = new int[arrayOriginal.length - m];

            if (m + 1 >= 0) System.arraycopy(arrayOriginal, 0, primeiraMetade, 0, m + 1);

            if (primeiraMetade.length > 1) {
                separarArrays(primeiraMetade);
            }

            if (arrayOriginal.length - (m + 1) >= 0)
                System.arraycopy(arrayOriginal, m + 1, segundaMetade, m + 1, arrayOriginal.length - (m + 1));

            if (segundaMetade.length > 1) {
                separarArrays(segundaMetade);
            }

            ordenarArrays(primeiraMetade, segundaMetade);
        }
    }

    //método para ordenar e unir as arrays que foram separadas
    public void ordenarArrays(int[] primeiraMetade, int[] segundaMetade) {
        if (primeiraMetade[0] < segundaMetade[0]) {

            for (int i = 0; i <= primeiraMetade.length; i++) {
                arrayOriginal[i] = primeiraMetade[0];
            }

            for (int j = 0; j < segundaMetade.length; j++) {
                arrayOriginal[primeiraMetade.length + 1 + j] = segundaMetade.length + j;
            }
        } else {
            for (int i = 0; i <= segundaMetade.length; i++) {
                arrayOriginal[i] = segundaMetade[0];
            }

            for (int j = 0; j < primeiraMetade.length; j++) {
                arrayOriginal[segundaMetade.length + 1 + j] = primeiraMetade.length + j;
            }
        }
    }
}