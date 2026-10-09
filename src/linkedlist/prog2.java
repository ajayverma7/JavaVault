package linkedlist;

class Node{
    int data;
    Node next;
}
public class prog2 {

    static Node head;

    static void insert(int data){
        Node newNode = new Node();

        newNode.data = data;
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }   

        current.next = newNode; 
        
    }
    public static void main(String[] args){

        insert(10);
        insert(20);
        insert(30);

        Node current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    
}
