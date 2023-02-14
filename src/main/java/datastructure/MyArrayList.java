package datastructure;


public class MyArrayList <E> {

    private E [] elements = (E[]) new Object[2];
    private int size;



    // метод добавляет список лист в конец текущего
    public void add(MyArrayList list) {
        if (list.size + size < elements.length) {
            for (int i = 0; i < list.size; i++) {
                elements[size] = (E) list.elements[i];
                size++;
            }
        } else {
            E[] newArray = (E[]) new Object[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }
            for (int i = 0; i < list.size; i++) {
                newArray[size] =(E) list.elements[i];
                size++;
            }
            this.elements = newArray;
        }

    }

    public void add(MyArrayList list, int index) {
        if (size + list.size < elements.length) {
            for (int i = size - 1; i >= index; i--) {
                elements[i + list.size] = elements[i];
            }
            for (int i = 0; i < list.size; i++) {
                elements[i + index] = (E) list.elements[i];
                size++;
            }
        } else {
            E[] newArray = (E[]) new Object[elements.length * 2];
            for (int i = 0; i < elements.length + 1; i++) {
                newArray[i] = elements[i];
            }
            this.elements = newArray;
        }
    }

    public void remove (int index) {
        if (index == size - 1) {
            size--;
        } else {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
        if (size % 2 == 0) {
            E[] newArray = (E[]) new Object[elements.length / 2];
            for (int i = 0; i < size; i++) {
                if (i < index) {
                    newArray[i] = elements[i];
                } else if (i == index) {
                    newArray[i] = elements[i + 1];
                } else {
                    newArray[i] = elements[i - 1];
                }
                newArray[i] = elements[i];
            }
            this.elements = newArray;
            index--;
        }
    }

    public void add(E e, int index) {
        if (size < elements.length) {
            for (int i = size - 1; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = e;
            size++;
        } else {
            E[] newArray = (E[]) new Object[elements.length * 2];
            for (int i = 0; i < elements.length + 1; i++) {
                if(i < index){
                    newArray[i] = elements[i];
                } else if(i == index) {
                    newArray[i] = e;
                } else {
                    newArray[i] = elements[i - 1];
                }
            }

            size++;
            this.elements = newArray;
        }
    }


    public void add(E e){
        if (size < elements.length) {
            elements[size] = e;
            size++;
        } else {
           E[] newArray = (E[]) new Object[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }
            newArray[size] = e;
            size++;
            this.elements = newArray;
        }
    }

     public E get(int i) {
       return elements[i];
     }

    public int size() {
        return size;
    }
}
