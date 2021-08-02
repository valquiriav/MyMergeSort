package br.com.letscode;

public class Test {

    public static void main(String[] args) {
        int[] myArray = {3, 1, 9, 12, 2, 32, 5, 6, 104, 53};
        MergeSort test = new MergeSort(myArray);
        test.mSort();
    }
}