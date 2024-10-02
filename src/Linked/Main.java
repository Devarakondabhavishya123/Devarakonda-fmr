package Linked;

public class Main {
    public static void main(String[] args) {
        Node n = new Node(20);
        n.next = null;
        Node n2 = new Node(20);
        n2.next = n;
        System.out.println(n);
        LinkedList list = new LinkedList();
        list.insertatfirst(10);
        list.insertatfirst(20);
        list.insertatfirst(30);
        list.insertatfirst(40);
        System.out.println("After adding");
        list.display();
        System.out.println("after adding last");
        list.insertLast(50);
        list.display();
        list.insertAtmiddle(60,5);
        list.display();
        list.revrse();
        System.out.println("After reversing");
        list.display();


    }
}
