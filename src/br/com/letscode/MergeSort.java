package br.com.letscode;

public class MergeSort {

    ArrayList arrayOriginal;
    ArrayList primeiraMetade;
    ArrayList segundaMetade;

    public MergeSort(ArrayList arrayOriginal) {
        this.arrayOriginal = arrayOriginal;
    }

    public void mSort(){
        if (arrayOriginal.getSize() > 1) {
            separarArrays(arrayOriginal);
        }
        arrayOriginal.print();
    }

    public void separarArrays(ArrayList arrayOriginal) {
        //verifica se o número de elementos é par e define o elemento a ser usado de referência, bem como as arrays
        if (arrayOriginal.getSize() % 2 == 0) {
            int m = arrayOriginal.getSize() / 2;
            primeiraMetade = new ArrayList(m);
            segundaMetade = new ArrayList(m);
            copiarArrays(m);
        } else {
            int m = (arrayOriginal.getSize() / 2) + 1;
            primeiraMetade = new ArrayList(m);
            segundaMetade = new ArrayList(arrayOriginal.getSize() - 1);
            copiarArrays(m);
        }
    }

    public void copiarArrays(int m) {

            for (int i = 0; i < m; i++) {
                primeiraMetade.set(i, arrayOriginal.get(i));
            }

            for (int j = 0; j < segundaMetade.getSize() - m; j++) {
                segundaMetade.set(j, arrayOriginal.get(m + j));
            }

            if (primeiraMetade.getSize() > 1) {
                separarArrays(primeiraMetade);
            }

            if (segundaMetade.getSize() > 1) {
                separarArrays(segundaMetade);
            }
            ordenarArrays(primeiraMetade, segundaMetade);
    }

    //método para ordenar e unir as arrays que foram separadas
    public void ordenarArrays(ArrayList primeiraMetade, ArrayList segundaMetade) {
        if ((int) primeiraMetade.get(0) < (int) segundaMetade.get(0)) {

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