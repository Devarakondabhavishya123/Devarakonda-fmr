package Linked;

public class LinkedList {

        Node head;
        Node tail;
        int size;
        public LinkedList(){
            head = null;
            tail = null;
            size = 0;
        }
        public void insertatfirst(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;

        }
        public void insertAtmiddle(int data, int pos) {
            Node newNode = new Node(data);
            if (pos == 0) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node temp = head;
            for (int i = 0; i < pos - 1; i++) {
                if (temp == null) {
                    System.out.println("Empty");
                    return;
                }
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;


        }
        public void insertLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            }
            else {
                Node temp = head;

                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }

        }
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;

            }

        }
        public void revrse(){

            Node prev = null;
            Node current = head;
            Node next = null;
            while(current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
    }












