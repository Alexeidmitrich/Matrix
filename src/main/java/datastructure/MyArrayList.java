package datastructure;

public class MyArrayList {

    private String [] elements = new String[2];
    private int size;

    public void add(String e, int index) {
        if (size < elements.length) {
            for (int i = elements.length - 2; i >= 0; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = e;
            size++;
        } else {
            String[] newArray = new String[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newArray[i] =elements[i];
            }
            newArray[size] = e;
            size++;
            this.elements = newArray;
        }
    }


    public void add(String e){
        if (size < elements.length) {
            elements[size] = e;
            size++;
        } else {
           String[] newArray = new String[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newArray[i] =elements[i];
            }
            newArray[size] = e;
            size++;
            this.elements = newArray;
        }
    }

     public String get(int i) {
       return elements[i];
     }

    public int size() {
        return size;
    }
}
