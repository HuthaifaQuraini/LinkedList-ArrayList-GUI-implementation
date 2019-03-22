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
public class Node {
    int Data;
    Node next;
public Node() {
       
    }
    public Node(int Data) {
       this.Data=Data;
    }

    public int getData() {
        return Data;
    }

    public void setData(int Data) {
        this.Data = Data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
    
}
