package Mergetwoorderedlists;

import org.w3c.dom.Node;

public class Mylist {
    Node head=null;
    class Node{
        Node next=null;
        int data;

        public Node(int data){
            this.data=data;
        }
    }

    public void addNode(int d){
        Node newNode=new Node(d);
        if (head==null){
            head=newNode;
            return;
        }

        Node tmp=head;
        while (tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=newNode;
    }

}
