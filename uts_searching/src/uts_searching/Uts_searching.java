/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_searching;

import java.io.InputStream;
import static java.lang.System.in;

/**
 *
 * @author USER
 */
public class Uts_searching {
    Node head;
    
    static class Node{
        int data;
        Node next;
        
       Node(int d){
           data =d;
           next = null;
       }
    }

private void priviousItems(Uts_searching list){
list.head = new Node(10);
Node secondNode = new Node(16);
Node thirdNode = new Node(21);
Node fourthNode = new Node(65);
list.head.next = secondNode;
list.head.next.next= thirdNode;
list.head.next.next.next= fourthNode;
}

private void cetak(String message){
    System.out.println(message);
    Node listNode = head;
    while(listNode != null){
        System.out.println(listNode.data+" ");
        listNode = listNode.next;
    }
    System.out.println("");
}
public static void main(String[] args){
    Uts_searching list = new Uts_searching();
    list.priviousItems(list);
    list.cetak(" nilai");
    
    boolean found = list.searchNode(10);
    if(found){
        System.out.println("nilai yang ada");
    }else{
        System.out.println(" nilai tdk ada");
    }
}
private boolean searchNode(int n){
    Node temp = head;
    while(temp != null){
        if(temp.data == n){
            return true;
        }
        temp = temp.next;
    }
    return false;
}
}    

