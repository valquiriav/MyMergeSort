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
                break;
            } else {
                size++;
            }
        }
        return size;
    }

    public Object get(int index) {
        return this.myArray[index];
    }

    public void set(int index, Object value){
        this.myArray[index] = value;
    }

    public void add(Object value){
        if (this.getSize() >= myArray.length){
            myArray = this.increase();
        }
        myArray[this.getSize()] = value;
    }

    public Object[] increase(){
        Object[] tempArray = new Object[myArray.length * 2];
        for (int i = 0; i <= this.getSize(); i++){
            tempArray[i] = myArray[i];
        }
        return tempArray;
    }

    public void remove(int index){
        Object[] tempArray = new Object[myArray.length];
        for (int i = 0; i <= this.getSize(); i++){
            tempArray[i] = myArray[i];
        }
        myArray = tempArray;
    }

    public void print(){
        for (int i = 0; i < this.getSize(); i++){
            System.out.println(this.get(i));
        }
    }
}