/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code_97;

import java.util.Arrays;


public class ArrayList {

    int arr[];
    public int size = 0;

    public ArrayList() {
        arr=new int[5];
    }
    

    public void add(int val) {
        if (size < arr.length) {
            arr[size] = val;
            size++;
        } else {
            enshur();
            arr[size] = val;
            size++;
        }
    }

    public void addFirst(int val) {
        if (arr.length == size) {
            enshur();
        }

        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = val;
        size++;

    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("Empty List");
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;

    }

    public void removeByIndex(int Index) {
        if (size == 0 || Index >= size) {
            System.out.println("Invalid index");
        } else {
            for (int i = Index ; i < size-1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        }
    }

    public void addByIndex(int val, int index) {
        if(index>size||index<0){
            System.out.println("invalid input");
        }
        else{
        if (arr.length <= size) {
            enshur();
        }

        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = val;
        size++;
        }
    }

    public void enshur() {
        arr = Arrays.copyOf(arr,arr.length * 2);
        
    }

    public int get(int index) {
        return arr[index];

    }

    public int getIndex(int val) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == val) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("Nothing to remove");
        } else {
            size--;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                s.append(arr[i]);
            } else {
                s.append(arr[i] + ",");
            }
        }
        s.append("]");
        return s.toString();

    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
       
        list.add(90);
        System.out.println(list.toString());
        list.addFirst(7);
        System.out.println(list.toString());
    }

}
