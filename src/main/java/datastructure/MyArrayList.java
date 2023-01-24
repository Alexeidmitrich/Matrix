package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;

public class MyArrayList {

    private String [] elements = new String[2];
    private int size;



    // метод добавляет список лист в конец текущего
    public void add(MyArrayList list) {
        if (list.size + size < elements.length) {
            for (int i = 0; i < list.size; i++) {
                elements[size] = list.elements[i];
                size++;
            }
        } else {
            String[] newArray = new String[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }
            for (int i = 0; i < list.size; i++) {
                newArray[size] = list.elements[i];
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
                elements[i + index] = list.elements[i];
                size++;
            }
        } else {
            String[] newArray = new String[elements.length * 2];
            for (int i = 0; i < elements.length + 1; i++) {
                newArray[i] = elements[i];
            }
            this.elements = newArray;
        }
    }
    
    public void remove (int index) {
        if (index == size - 1) {
            size--;
            if (size % 2 == 0) {
                String[] newArray = new String[size/2];
                for (int i = 0; i < size; i++) {
                   if(i < index){
                        newArray[i] = elements[i];
                    } else if(i == index) {
                        newArray[i] = elements[i + 1];
                    } else {
                        newArray[i] = elements[i - 1];
                    }
                    newArray[i] = elements[i];
                }
                this.elements = newArray;
            } /*else {
                if (size - 1 % 2 == 0) {
                    String[] newArray = new String[size / 2];
                    for (int i = 0; i < size; i++) {
                        //for (int i = index; i < elements.length; i++) {
                        newArray[i] = elements[i];
                    }
                    this.elements = newArray;
                }
            }
            }*/} else {
                for (int i = index; i < size - 1; i++) {
                    elements[i] = elements[i + 1];
                }
                size--;
            }
        }
    //}


    public void add(String e, int index) {
        if (size < elements.length) {
            for (int i = size - 1; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = e;
            size++;
        } else {
            String[] newArray = new String[elements.length * 2];
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


    public void add(String e){
        if (size < elements.length) {
            elements[size] = e;
            size++;
        } else {
           String[] newArray = new String[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
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
