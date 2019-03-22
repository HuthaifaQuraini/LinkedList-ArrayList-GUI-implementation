/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code_97;

/**
 *
 * @author Hodaifa A Quraini
 */
public class LinkedList {

    public Node head;
    public Node last;
    public int size;

    public LinkedList() {

    }

    public void addFirst(int value) {
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
        if (size == 0) {
            head = last = temp;
            size++;
        } else {
            
            head = temp;
            size++;
        }

    }

    public void removeLast() {
        if (iseEmpty()) {
            System.out.println("Nothing to remove");
        } else {
            Node temp = last;
            if (last == head) {
                last = head = null;
                size = 0;
            } else {
                Node priv = head;
                while (priv.next.next != null) {
                    priv = priv.next;
                }
                last = priv;
                priv.next = null;
                size--;
            }
        }

    }

    public void addLast(int value) {
        if (iseEmpty()) {
            addFirst(value);
            size++;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node current = new Node(value);
            last = current;
            temp.next = current;
            size++;

        }

    }

    public int Max() {
        if (iseEmpty()) {
            return -1;
        } else if (size == 1) {
            return head.getData();
        } else {
            int max = Integer.MIN_VALUE;
            Node temp = head;
            while (temp != null) {
                if (temp.getData() > max) {
                    max = temp.getData();
                }
                temp = temp.next;
            }

            return max;
        }
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        if (iseEmpty()) {
            return st.toString();
        }

        Node temp = head;

        while (temp.next != null) {
            st.append(temp.getData() + "----->");
            temp = temp.next;
        }
        st.append(temp.getData() + "-----> Null");

        return st.toString();
    }

    public boolean iseEmpty() {
        boolean flag = false;
        if (size == 0) {
            flag = true;
        }
        return flag;
    }

    public void addByIndex(int val, int index) {
        if (iseEmpty() || index == 1) {
            addFirst(val);
        } else if (index == 0) {
            System.out.println("Start from Index 1 plz ");
        } else {
            int counter = 1;
            Node temp = head;
            while (temp != null && counter != index - 1) {
                temp = temp.next;
                counter++;
            }
            Node add = new Node(val);
            add.next = temp.next;
            temp.next = add;
        }

    }

    public void addbySort(int value) {

        Node temp = head;
        Node priv = new Node(value);
        if (iseEmpty()) {
            addFirst(value);}
        
        else if (head.getData() > value) {
            addFirst(value);
        }
        else if (last.getData() < value) {
            addLast(value);
        } 
        else {
            
            while (temp != null && temp.next.getData() < value) {
                temp = temp.getNext();

            }
            priv.next = temp.next;
            temp.next = priv;

            size++;
        }
    }

    public int getIndex(int value) {
        if (iseEmpty()) {
            return -1;
        } else {
            int index = 1;
            Node temp = head;
            while (temp != null) {
                if (temp.getData() == value) {
                    return index;
                }
                temp = temp.next;
                index++;
            }

            return -1;
        }

    }

    public LinkedList Reverse() {

        Node temp = head;
        LinkedList l1 = new LinkedList();
        while (temp != null) {
            l1.addFirst(temp.getData());
            temp = temp.next;
        }
        return l1;

    }

    public LinkedList Clone() {

        Node temp = head;
        LinkedList list = new LinkedList();
        while (temp != null) {
            list.addLast(temp.getData());
            temp = temp.next;

        }
        return list;

    }

    public boolean Bilandrom(LinkedList list) {
        LinkedList list1 = list.Reverse();
        if (list1.toString().equals(list.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public void removefirst() {
        if (iseEmpty()) {
            System.out.println("Nothing to remve");
        } else if (size == 1) {
            size--;
            head = null;
        } else {
            head = head.next;
            size--;
        }
    }

    public void removeByIndex(int Index) {
        if (iseEmpty() || size < Index) {
            System.out.println("Invalid index");
        } else if (size == Index) {
            removeLast();
        } else if (Index == 1) {
            removefirst();
        } else {
            Node temp = head;
            int counter = 1;
            while (temp != null && counter != Index - 1) {
                counter++;
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

    }

    public int get(int Index) {
        if (iseEmpty() || Index > size || Index < 1) {
            return -1;
        } else if (Index == 1) {
            return head.getData();
        } else if (Index == size) {
            return last.getData();
        } else {
            int counter = 1;
            Node temp = head;
            while (temp != null && counter != Index) {
                temp = temp.next;
                counter++;
            }
            return temp.getData();
        }

    }

    public void swap(int n1, int n2) {
        Node temp = head;
        Node node1 = new Node();
        Node node2 = new Node();
        Node swap;
        int counter = 0;
        while (temp != null && counter != n2) {
            if (counter == n1) {
                node1 = temp;
            }
            counter++;
            temp = temp.next;
        }
        node2 = temp;
        swap = node1;
        node1 = node2;
        node2 = swap;

    }
    public static void main(String[] args) {
         LinkedList list=new LinkedList();
        list.addbySort(15);
        list.addbySort(25);
        list.addbySort(195);
        list.addbySort(1);
        System.out.println(list.toString());
    }

}
