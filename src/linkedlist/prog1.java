import java.util.Stack;

class Node{
    int data;
    Node next;
}
public class prog1 {
    public static void main(String[] args){
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node four = new Node();
        Node five = new Node();

        first.data = 10;
        second.data = 20;
        third.data = 30;
        four.data = 40;
        five.data = 50;

        Node head = first;

        first.next = second;
        second.next = third;
        third.next = four;
        four.next = five;

        Node current = head;
        while(current != null){
            System.out.println(current.data);

            current = current.next;
        }
        
    }
    
}
