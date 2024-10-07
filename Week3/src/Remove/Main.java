package Remove;

import java.util.Scanner;

class LinkedList {
    Node head;
     void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }
    public void Removeatpos(int pos){
        if(head == null){
            System.out.println("no list");
            return;
        }
        Node temp = head;
        if(pos == 0){
            head = temp.next;
            return;
        }
        for(int i = 0; temp!=null&& i < pos - 1; i++){
            temp = temp.next;
        }
        if(temp == null || temp.next == null){
            System.out.println("index out of list");
            return;
        }
        Node next = temp.next.next;
        temp.next = next;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Enter 4 elements:");
       for (int i = 0; i < 4; i++) {
           // System.out.print("Enter elements :"  );
            int element = sc.nextInt();

            list.add(element);

        }
        System.out.println("Linked list before");
        list.print();
        System.out.println(" enter the pos :");
        int pos = sc.nextInt();
        list.Removeatpos(pos);
        System.out.println("Linked list after");
        list.print();
    }
}

