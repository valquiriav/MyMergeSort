package br.com.letscode;

public class ArrayList {

    //create array attribute
    private Object[] myArray;

    //creating constructor method
    public ArrayList() {
        //default value is an array
        this.myArray = new Object[10];
    }

    //constructor to receive arguments
    public ArrayList(int tamanho) {
        //default value is an array
        this.myArray = new Object[tamanho];
    }


    public int getSize() {
        int size = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == null) {
                return size;
            } else {
                size++;
            }
        }
        return size;
    }

    public Object get(int index) {
        return myArray[index];
    }

    public void set(int index, Object value) {
        myArray[index] = value;
    }

    public void add(Object value){
        if (this.getSize() == myArray.length){
            Object[] tempArray = new Object[myArray.length * 2];
            for (int i = 0; i < myArray.length; i++){
                tempArray[i] = myArray[i];
            }
            myArray = tempArray;
        }
        myArray[this.getSize()] = value;
    }


    public void remove(int index){
        Object[] tempArray = new Object[myArray.length];
        for (int i = 0; i < index; i++){
            tempArray[i] = myArray[i];
        }
        for (int j = index + 1; j < myArray.length; j++){
            tempArray[j - 1] = myArray[j];
        }
        myArray = tempArray;
    }

    public void print(){
        for (int i = 0; i < this.getSize(); i++){
            System.out.println(this.get(i));
        }
    }
}