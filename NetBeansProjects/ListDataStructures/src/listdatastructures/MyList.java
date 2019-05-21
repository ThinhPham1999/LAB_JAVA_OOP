
package listdatastructures;

import java.util.Random;
import java.util.Scanner;

public class MyList {
    Node head, tail;
    
    void myList(){
        head = tail = null;
    }
    
    boolean isEmpty(){
        return (head == null);
    }
    
    void clear(){
        head = tail = null;
    }
    
    void addToHead(int x){
        head.next = head;
        head.info = x;
        if(tail == null){
            tail = head;
        }
    }
    
    void addToTail(int x){
        Node q = new Node(x);
        if (isEmpty()){
            head = tail = null;
        }
        tail.next = q;
        tail = q;
    }
    
    void addAfter(Node p, int x){
        if(p == null){
            System.out.println("The given previous node cannot be null");
            return;
        }
        
        Node new_node = new Node(x);
        new_node.next = p.next;
        p.next = new_node;
    }
    
    void visit(Node p){
        Node currentNode = head;
        while (currentNode != p && currentNode != null){
            currentNode = currentNode.next;
        }
        if (currentNode == null){
            System.out.println("Not have node p");
        }
        System.out.println(currentNode);
    }
    
    void traverse(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.println(currentNode);
        }
    }
    
    int deleFromHead(){
        if(isEmpty()){
            tail = null;
            return -1;
        }
        Node currentNode = head;
        head = head.next;
        return currentNode.info;
    }
    
    int deleFromTail(){
        if (head == null){
            return 0;
        }
        
        Node last = tail;
        Node second_last = head;
        while(second_last.next != last){
            second_last = second_last.next;
        }
        second_last.next = null;
        tail = second_last;
        return last.info;
    }
    
    int deleAfter(Node p){
        if (p == null){
            System.out.println("p is not null.");
            return 0;
        }
        
        
    }
}
