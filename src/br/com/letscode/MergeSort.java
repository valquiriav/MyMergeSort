package br.com.letscode;

public class MergeSort {

    ArrayList arrayOriginal;

    public MergeSort(ArrayList arrayOriginal) {
        this.arrayOriginal = arrayOriginal;
    }

    public void mSort(){
        separarArrays(arrayOriginal);
    }

    public int definirM(ArrayList arrayOriginal) {
        //verifica se o número de elementos é par e define o elemento a ser usado de referência
        if (arrayOriginal.getSize() % 2 == 0) {
            return arrayOriginal.getSize() / 2;
        } else {
            return arrayOriginal.getSize() / 2 + 1;
        }
    }

    //método para criar duas arrays separando a original

    public void separarArrays(ArrayList arrayOriginal) {

        if (arrayOriginal.getSize() > 1){
            int m = definirM(arrayOriginal);

            ArrayList primeiraMetade = new ArrayList();
            ArrayList segundaMetade = new ArrayList();

            for (int j = m + 1; j < arrayOriginal.getSize(); j++) {
                segundaMetade.set(j, arrayOriginal.get(j));
            }

            if (primeiraMetade.getSize() > 1) {
                separarArrays(primeiraMetade);
            }

            for (int j = m + 1; j < arrayOriginal.getSize(); j++) {
                segundaMetade.set(j, arrayOriginal.get(j));
            }

            if (segundaMetade.getSize() > 1) {
                separarArrays(segundaMetade);
            }

            ordenarArrays(primeiraMetade, segundaMetade);
        }
    }

    //método para ordenar e unir as arrays que foram separadas
    public void ordenarArrays(ArrayList primeiraMetade, ArrayList segundaMetade) {
        if (primeiraMetade.get(0).equals(segundaMetade.get(0))) {

            for (int i = 0; i <= primeiraMetade.getSize(); i++) {
                arrayOriginal.set(0, primeiraMetade.get(0));
            }

            for (int j = 0; j < segundaMetade.getSize(); j++) {
                arrayOriginal.set(primeiraMetade.getSize() + 1 + j, segundaMetade.getSize() + j);
            }
        } else {
            for (int i = 0; i <= segundaMetade.getSize(); i++) {
                arrayOriginal.set(i, segundaMetade.get(0));
            }

            for (int j = 0; j < primeiraMetade.getSize(); j++) {
                arrayOriginal.set(segundaMetade.getSize() + 1 + j, primeiraMetade.getSize() + j);
            }
        }
    }
}