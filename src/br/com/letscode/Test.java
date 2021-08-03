package br.com.letscode;

public class Test {

    public static void main(String[] args) {
        ArrayList myArray = new ArrayList();

        myArray.add(10);
        myArray.add(5);
        myArray.add(149);
        myArray.add(74);
        myArray.add(13);
        myArray.add(32);
        myArray.add(104);
        myArray.add(16);
        myArray.add(11);
        myArray.add(56);
        myArray.add(20);

        MergeSort test = new MergeSort(myArray);
        test.mSort();
    }
}